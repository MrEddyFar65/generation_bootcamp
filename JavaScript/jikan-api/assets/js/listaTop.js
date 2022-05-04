const urlTop = 'https://api.jikan.moe/v4/top/anime';

const theTop = document.getElementById('topAnimu');

fetch(urlTop).then(resp => resp.json()).then(datos => {
    //console.log(datos.data);

    const animesTop = datos.data.slice(0,8);

    animesTop.forEach(anim => {

        //console.log(anim);

        const theData = {
            title: anim.title
        }

        const tempaltes = `
        <a href="#" class="list-group-item list-group-item-action ">${theData.title}</a>`;

        theTop.innerHTML += tempaltes;
        
    });
})