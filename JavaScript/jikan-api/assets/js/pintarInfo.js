const info = window.location.href.split("=").pop();

console.log(info);

const urlID = `https://api.jikan.moe/v4/anime/${info}`;
const animeData = document.getElementById('dataAnime');

const firstImage = document.getElementById('imagenPortada');

fetch(urlID).then(resp => resp.json()).then(datos => {
    //console.log(datos.data);

    const needData = {
        id: datos.data.mal_id,
        imagen: datos.data.images.jpg.large_image_url,
        sinopsis: datos.data.synopsis,
        nombre: datos.data.title
    }

    const imgTemplate =  `<img src="${needData.imagen} " alt="" class="img-fluid">`

    firstImage.innerHTML = imgTemplate;

    const dataTemplate = `
        <h1>${needData.nombre}</h1>
        <p>${needData.sinopsis}</p>
        <div class="favorito">
            <button id="agregarFavoritos" type="button" class="btn btn-dark">Agregar a favoritos</button> 
        </div>
    `;

    animeData.innerHTML = dataTemplate;
    console.log(needData);

    const agregarFav = document.getElementById("agregarFavoritos");

    agregarFav.addEventListener('click', (e)=>{

        const datos = {
           id: needData.id,
           nombre: needData.nombre,
           img: needData.imagen

        }


        if(localStorage.getItem('favoritos')){
            console.log('Existe un elemento');
            let datosGuardados = JSON.parse(localStorage.getItem('favoritos'));
            datosGuardados = datosGuardados.filter((el) => el.nombre != datos.nombre);
            datosGuardados.push(datos);

            localStorage.setItem("favoritos", JSON.stringify(favoritos));
            window.location.href =`favoritos.html`;
        }
        else{
            console.log('elemento vacio');
            const favorites = [];

            favorites.push(datos);

            localStorage.setItem("favoritos", JSON.stringify(favorites));
        }

       
       
        console.log(datos);
    });

})