import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) {

        // Usamos try-with-resources para que el Scanner se cierre solo
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("--- 1. División Segura ---");
            System.out.print("Ingrese el numerador (ej: 10): ");
            int numerador = scanner.nextInt();

            System.out.print("Ingrese el divisor (ej: 2 o 0): ");
            int divisor = scanner.nextInt();

            // 1. TRY: Se intenta la operación riesgosa (división)
            int resultado = numerador / divisor;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            // 2. CATCH: Se ejecuta solo si 'divisor' es cero
            System.err.println("Error: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            // (Catch adicional para robustez)
            System.err.println("Error: Debe ingresar números enteros.");
        }
    }
}