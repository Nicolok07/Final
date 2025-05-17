import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(50) + 1; // Número entre 1 y 50
        int intentos = 0;
        int maxIntentos = 0;
        int intentoUsuario = -1; // Inicializar para evitar error

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("¿Cuántos intentos quieres tener? (5, 10 o 15): ");

        // Validar número de intentos
        while (true) {
            maxIntentos = scanner.nextInt();
            if (maxIntentos == 5 || maxIntentos == 10 || maxIntentos == 15) {
                break;
            } else {
                System.out.println("Por favor, elige 5, 10 o 15 intentos:");
            }
        }

        // Juego principal
        while (intentos < maxIntentos) {
            System.out.print("Intento #" + (intentos + 1) + " - Adivina el número (entre 1 y 50): ");
            intentoUsuario = scanner.nextInt();
            intentos++;

            if (intentoUsuario == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intento(s).");
                break;
            } else if (intentoUsuario > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("El número secreto es mayor.");
            }
        }

        if (intentos == maxIntentos && numeroSecreto != intentoUsuario) {
            System.out.println("Lo siento, se acabaron los intentos.");
            System.out.println("El número secreto era: " + numeroSecreto);
        }

        System.out.println("Gracias por jugar.");
        scanner.close();
    }
}


