import java.util.Scanner;

public class Ejercicio8B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = input.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = input.nextDouble();

        if (num2 != 0) {
            double resultado = num1 / num2;  // División real
            System.out.println("Resultado de la división: " + resultado);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        input.close();
    }
}
