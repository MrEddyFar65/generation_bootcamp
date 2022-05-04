const url = 'https://dog.ceo/api/breeds/list/all ';

const $ul = document.querySelector('ul');

fetch(url).then(resultado => resultado.json().then(datos =>{
    console.log(datos.message);

    const arregloTerrier = datos.message.terrier;

    arregloTerrier.forEach(element => {
        
        const tempalte = `<li class="list-group-item"> ${element}</li>`

        $ul.innerHTML += tempalte;

    });
}));
