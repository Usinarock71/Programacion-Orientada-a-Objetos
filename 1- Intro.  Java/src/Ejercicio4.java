import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();

        // Pedir edad
        System.out.print("Ingrese su edad: ");
        int edad = input.nextInt();

        // Mostrar en pantalla
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
