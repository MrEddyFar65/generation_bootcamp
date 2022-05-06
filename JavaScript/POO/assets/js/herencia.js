class Pokemon
{

    #nombre = '';
    #edad = 0;
    #evolucion = '';
    #tipo = '';

    constructor(nombre, edad, evolucion, tipo){

        this.#nombre = nombre;
        this.#edad = edad;
        this.#evolucion = evolucion;
        this.#tipo = tipo;
    }

    get nombre(){
        return this.#nombre;
    }

    atacar(){
        console.log(`${this.#nombre} esta atacando`)
    }

    evolucion(){
        
        let mesage =' ';
        
        if(this.#evolucion != ' '){
           mesage = `${this.#nombre} ha evolucionado a ${this.#evolucion}`;

            return console.log(mesage);
        }
    }

}


const pokemon = new Pokemon('Charmander', 3, 'Maistro', 'Cerveza');

console.log(pokemon);

pokemon.atacar();

pokemon.evolucion();



class TipoCerveza extends Pokemon{

    constructor(nombre,edad,evolucion){
        super(nombre,edad,evolucion);
    }

    atacar(){
        return console.log(`${super.nombre} ataca de tipo chela`);
    }
}
    const newPokemon = new TipoCerveza('Charmander');

    newPokemon.atacar();