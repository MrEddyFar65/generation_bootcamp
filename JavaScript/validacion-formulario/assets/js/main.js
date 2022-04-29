const expresiones = {
	usuario: /^[a-zA-Z0-9\_\-]{4,16}$/, // Letras, numeros, guion y guion_bajo
	nombre: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
	password: /^.{4,12}$/, // 4 a 12 digitos.
	email: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
	telefono: /^\d{7,14}$/ // 7 a 14 numeros.
}


const formulario = document.querySelector("form");

console.log(formulario);

const inputs = document.querySelectorAll('input');

console.log(inputs);

const apellidoError = document.querySelector("#errorApellido");


const statusInf = {
	nombre: false,
	apellido: false
}

inputs.forEach((input)=>{
	// console.log(input);

	input.addEventListener("keyup", (a)=>{
		// console.log(a.target.name);
	


	switch(a.target.name){
		case "nombre":
			
			console.log("nombre");
			break
		
		case "apellido":
			// console.log(expresiones.nombre.test(a.target.value));
			// console.log(a.target.value);
			if(expresiones.nombre.test(a.target.value)){
				console.log("valido");
				statusInf.apellido = true;
				apellidoError.textContent = "";
			}
			else{
				statusInf.apellido = false;
				console.log('No valido');
				apellidoError.textContent="Error";
			}
			break

		
		}
	});
});
console.log(5+2+"7");

formulario.addEventListener("submit", (e)=>{
	e.preventDefault();
	
	Object.values(statusInf);

	if(!(Object.values(statusInf).includes(false))){
		console.log("Enviado")
		document.querySelector(".alert-danger").style.display = "none";
		const datos = Object.fromEntries( new FormData(e.target)
		 )
		 
		console.log(datos); 

		formulario.reset();
	}
	else{
		console.log("Enviadon't")
		document.querySelector(".alert-danger").style.display = "block" 
	}
});