package ciclos;
import java.util.Scanner;

public class ejercicio1{

    // Function that implements the
    // number guessing game
    public static void
    guessingNumberGame()
    {
        // Scanner Class
        Scanner sc = new Scanner(System.in);

        // Generate the numbers
        int number = 1 + (int)(100
                            * Math.random());

        // Given K trials
        int K = 5;

        int i, guess;

        System.out.println(
            "Un numero a sido elegido "
            + "del uno al cien."
            + " Adivina el numero"
            + " tienes 5 intentos.");

        // Iterate over K Trials
        for (i = 0; i < K; i++) {

            System.out.println(
                "Adivina el numero:");

            // Take input for guessing
            guess = sc.nextInt();

            // If the number is guessed
            if (number == guess) {
                System.out.println(
                    "Felicitaciones!"
                    + " Adivinaste el numero.");
                break;
            }
            else if (number > guess
                    && i != K - 1) {
                System.out.println(
                    "El numero es "
                    + "mayor que " + guess);
            }
            else if (number < guess
                    && i != K - 1) {
                System.out.println(
                    "El numero es "
                    + " menor que " + guess);
            }
        }

        if (i == K) {
            System.out.println(
                "La has liado"
                + " K trials.");

            System.out.println(
                "El numero era " + number);
        }
    }

    // Driver Code
    public static void
    main(String arg[])
    {

        // Function Call
        guessingNumberGame();
    }
}