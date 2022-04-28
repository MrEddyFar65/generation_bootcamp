
//ejercicio 1

// for(let a = 5; a>=0; a--){
//     a = a + 0.5;
//     console.log(a);
//     console.log("\n");
// }

//for(let i=1; i<=100; i++) { if(i%2 == 1 ) { console.log(i); } }


for(let b = 0; b < 10; b++){}

/* Ejercicio 3 */ const numero = prompt("Ingresa un número:"); let control = 0; let arreglo = []; while(control < numero) { arreglo[control] = control + 1; console.log(`[${arreglo[control]}]`); control++; } /* Ejercicio 4 */ let numero = prompt("Ingresa un número:"); let suma = 0; for(let i=1; i<=numero; i++) { suma = suma + i; } console.log("El resultado es: " + suma); 