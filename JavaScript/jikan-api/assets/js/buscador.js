const formulario = document.querySelector('form');

formulario.addEventListener('submit', (e)=> {

    e.preventDefault();

    const buscador = document.querySelector('input').value;

    window.location.href = `busqueda.html?name=${buscador}`

})