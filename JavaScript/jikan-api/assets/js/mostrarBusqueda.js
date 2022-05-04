
const search = window.location.href.split("=").pop();

console.log(search);
const searchAnimu = document.getElementById('resultadosBusqueda');

const urlBusqueda = `https://api.jikan.moe/v4/anime?q=${search}&order_by=popularity`

fetch(urlBusqueda).then(resp => resp.json()).then(datos => {

    const resultadosB = datos.data;

    resultadosB.forEach((resultados => {
        const needData = {
            nombre: resultados.title,
            imagen: resultados.images.jpg.image_url
        }

        const template =  `
        <div class="col mb-4">
                <div class="card">
                <img src="${needData.imagen}" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h5 class="card-title">${needData.nombre}</h5>
                        
                    </div>
                </div>
     </div>`;
        
        searchAnimu.innerHTML += template;  
    }))
    
});