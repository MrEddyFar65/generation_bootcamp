
const url = 'https://dog.ceo/api/breeds/image/random';

const img = document.getElementById('imagenPerrito');

fetch(url).then(respuesta=>respuesta.json()).then(datos => {
    console.log(datos);
    img.src = datos.message;

})


async function  obtenerPerro(){
    const inforPerro = await fetch(url);
    
    const perritos = await inforPerro.json();
    console.log(perritos);
}

obtenerPerro();