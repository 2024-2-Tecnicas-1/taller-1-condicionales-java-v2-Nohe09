
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Division {
    public static String evaluar(int dividendo, int divisor) {
        // TODO: Coloca aquí el código del ejercicio 3: Division
        if (divisor == 0) {
            return "El divisor no puede ser cero.";
        }
        int cociente = dividendo / divisor;
        int residuo = dividendo % divisor;
        if (residuo == 0) {
            return "La división es exacta. \nCociente: " + cociente + "\nResiduo: " + residuo;
        } else {
            return "La división no es exacta. \nCociente: " + cociente + "\nResiduo: " + residuo;
        }
    }
        int cociente = 0;
        int residuo = 0;
        String respuesta = "La división es exacta. \n"
                + "Cociente: " + cociente + "\n"
                + "Residuo: " + residuo;
        
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Dividendo:");
        int dividendo = lector.nextInt();
        System.out.print("Divisor:");
        int divisor = lector.nextInt();

        String respuesta = evaluar(dividendo, divisor);
        System.out.println(respuesta);
    }
}
