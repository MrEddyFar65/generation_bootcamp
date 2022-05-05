const urlUltimos = "https://api.jikan.moe/v4/seasons/now";

const lastAnimes = document.getElementById('losUltimosAnimes');

fetch(urlUltimos).then(result => result.json()).then(datos => {
    //console.log(datos);

    const arreglosUltimosAnimes = datos.data.slice(0,16);
    //console.log(arreglosUltimosAnimes);

    arreglosUltimosAnimes.forEach(animu => {

        const datosNecesarios = {

            nombre: animu.title,
            imagen:animu.images.jpg.image_url,
            id: animu.mal_id,
            sinopsis: animu.synopsis
        }
{/* <p class="card-text">${datosNecesarios.sinopsis}</p> */}
        const templates = `
        <div class="col mb-4">
            <a href="informacion.html?id=${datosNecesarios.id}">    
                <div class="card">
                    <img src="${datosNecesarios.imagen}" class="card-img-top" alt="...">
                    <div class="card-body">
                         <h5 class="card-title">${datosNecesarios.nombre}</h5>
                        
                    </div>
                </div>
            </a>
        </div>`;


        lastAnimes.innerHTML += templates;
       // console.log(datosNecesarios);
        
    });

})