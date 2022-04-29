 let $parr= document.querySelector('p');
 const $card = document.querySelector('.card');




 function crearElemento(){
     const img = document.createElement('img');

        img.src = "https://www.purina-latam.com/sites/g/files/auxxlc391/files/styles/social_share_large/public/Que_debes_saber_antes_de_adoptar_un_gatito.jpg?itok=guFplHEU ";

    $card.appendChild(img);

 }

 

 crearElemento();