package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
        // TODO: Coloca aquí el código del ejercicio 1: Set de tenis
      // Verificar si el resultado es válido
        // Verificar si el resultado es válido
        if (numVictoriasA < 0 || numVictoriasB < 0) {
            return "Inválido";
        }
        
        // Verificar si los resultados son válidos
        if (numVictoriasA > 7 || numVictoriasB > 7 || Math.abs(numVictoriasA - numVictoriasB) > 2) {
            return "Inválido";
        }

        // Verificar si A ha ganado el set
        if (numVictoriasA >= 6 && numVictoriasA >= numVictoriasB + 2) {
            return "Ganó A";
        }

        // Verificar si B ha ganado el set
        if (numVictoriasB >= 6 && numVictoriasB >= numVictoriasA + 2) {
            return "Ganó B";
        }

        // Verificar si el set está en el estado especial de 5-7 o 7-5
        if ((numVictoriasA == 5 && numVictoriasB == 7) || (numVictoriasB == 5 && numVictoriasA == 7)) {
            return "Ganó " + (numVictoriasA > numVictoriasB ? "A" : "B");
        }

        // Verificar si el set está en el estado especial de 6-7 o 7-6
        if ((numVictoriasA == 6 && numVictoriasB == 7) || (numVictoriasB == 6 && numVictoriasA == 7)) {
            return "Ganó " + (numVictoriasA > numVictoriasB ? "A" : "B");
        }

        // Si ninguna condición se cumple, el set aún no termina
        return "Aún no termina";
    }
      
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
