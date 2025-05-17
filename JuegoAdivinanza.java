import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String jugarOtraVez;
        
        System.out.println("Bienvenido al juego de adivinanzas");
        System.out.println("En este juego tendrás que adivinar un número entre el 1 y el 50, podrás decidir si quieres tener 5, 10 o 15 intentos. Buena suerte.");
        System.out.println("\n¿Cuántos intentos quieres tener? (5, 10 o 15): ");

        do{
           int numeroSecreto = random.nextInt(50) + 1; 
            int intentos = 0;
            int maxIntentos = 0;
            int intentoUsuario = -1; 

        while (true) {
            maxIntentos = scanner.nextInt();
            if (maxIntentos == 5 || maxIntentos == 10 || maxIntentos == 15) {
                break;
            } else {
                System.out.println("Por favor, elige 5, 10 o 15 intentos:");
            }
        }

     
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

          System.out.print("\n¿Quieres jugar otra vez? (s/n): ");
            jugarOtraVez = scanner.next();

        } while (jugarOtraVez.equalsIgnoreCase("s"));
        
        System.out.println("Gracias por jugar.");
        scanner.close();
    }
}


