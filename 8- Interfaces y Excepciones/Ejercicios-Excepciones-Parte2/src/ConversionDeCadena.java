import java.util.Scanner;

public class ConversionDeCadena {

    public static void main(String[] args) {

        // 1. Declara 'texto' en el ámbito exterior (main), inicializado en null.
        String texto = null;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("\n--- 2. Conversión de Cadena ---");
            System.out.print("Ingrese un texto (ej: '123' o 'Hola'): ");

            // 2. Asigna el valor dentro del try
            texto = scanner.nextLine();

            // 3. Intenta la conversión
            int numero = Integer.parseInt(texto);
            System.out.println("El número ingresado es: " + numero);

        } catch (NumberFormatException e) {
            // 4. CATCH: Ahora 'texto' SÍ es visible aquí.
            System.err.println("Error: El valor '" + texto + "' no es un número entero válido.");
        }
    }
}