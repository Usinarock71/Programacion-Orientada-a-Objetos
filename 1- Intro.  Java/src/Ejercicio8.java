import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = input.nextInt();

        if (num2 != 0) {
            int resultado = num1 / num2;  // División entera
            System.out.println("Resultado de la división entera: " + resultado);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }
}
