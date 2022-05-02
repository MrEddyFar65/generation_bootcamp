const $delBody = document.querySelector(".padre");

const $parag = document.createElement('p');

$parag.textContent = "lorem ipsum";
$parag.textContent += "lorem ipsum";
$parag.textContent += "lorem ipsum";

$delBody.appendChild($parag);

const $cuadro = document.querySelector('.cuadro')
;

$cuadro.innerHTML = ""; // iniciar elementos del contenido

$cuadro.innerHTML = `<a href="#">Esto es un enlace</a>
    <ol>
        
    <li>Elemento 1</li>
    <li>Elemento 2</li>
    <li>Elemento 3</li>

    </ol>
`;

const estaciones = ['primavera','verano', 'otono', 'invierno'];

const lista = document.createElement('ul');

estaciones.forEach(elemento =>{
    const $li = document.createElement('li');
   // $li.textContent = estaciones[0].toString();
    $li.textContent = elemento; 
   lista.appendChild($li);
});

document.body.appendChild(lista);

const continentes = ['Asia', 'America', 'Europa','Africa', 'Oceania'];

const $ol = document.createElement('ol');
$cuadro.appendChild(lista);

continentes.forEach(continent => {$ol.innerHTML = `<li>${continent}</li>`});