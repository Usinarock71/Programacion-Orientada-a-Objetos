import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir los dos números
        System.out.print("Ingrese el primer número entero: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = input.nextInt();

        // Operaciones
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = 0;

        // Verificar que no se divida por cero
        if (num2 != 0) {
            division = (double) num1 / num2;
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        // Resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        if (num2 != 0) {
            System.out.println("División: " + division);
        }
    }
}
