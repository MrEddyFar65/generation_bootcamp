function saludar(){
    alert("Marciano");
}



//Manejador de eventos
const botonsemantico = document.getElementById("evento-semantico");

botonsemantico.onclick = saludar;

 botonsemantico.onclick = function(evento){
     console.log(evento.target);
}

//Manejador de eventos multiple

buttonMultiples = document.getElementById("eventos-multiples");

buttonMultiples.addEventListener('click', function(){
    alert('No llore mi chuy');
});

buttonMultiples.addEventListener('click', function(e){
    console.log(e.target);
});