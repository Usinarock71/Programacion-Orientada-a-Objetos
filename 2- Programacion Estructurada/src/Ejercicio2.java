import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int n1 = scan.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int n2 = scan.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int n3 = scan.nextInt();

        int mayor = Math.max(n1, Math.max(n2, n3));
        System.out.println("El mayor es: " + mayor);
    }
}
