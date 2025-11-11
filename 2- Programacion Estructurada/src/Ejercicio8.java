import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double base = scan.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje: ");
        double imp = scan.nextDouble() / 100;
        System.out.print("Ingrese el descuento en porcentaje: ");
        double desc = scan.nextDouble() / 100;
        double total = calcularPrecioFinal(base, imp, desc);
        System.out.println("El precio final del producto es: " + total);
    }

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
}
