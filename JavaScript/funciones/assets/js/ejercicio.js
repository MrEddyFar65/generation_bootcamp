
/* ejercio 1 */ 
function palindromo(str) { const strReversed = str.split("").reverse().join(""); return strReversed === str ? "es palindromo" : "no es palindromo"; } console.log(palindromo("hola")); 

/* ejericio 2 */ 
/* function repetir(cadena)
{ let cadenaRepetida = cadena.repeat(3);
     console.log(cadenaRepetida); 
    }
repetir(" hola mundo "); */
 
/* ejercicio 3 */ 
 /* let cadena ="hola mundo" function cortarcadena(cadena, numero){ let extraida = cadena.substring(0, numero); console.log(extraida); } cortarcadena(cadena , 6) */ /* ejericio 4 */ /* const factorial = (numero=undefined)=>{ if (numero === 0)return console.error("El número no puede ser 0"); let factorial=1; for (let i=numero;i>1;i--){ factorial *=i; } return console.log(`El factorial de ${numero} es ${factorial}`); } factorial (5); */ 