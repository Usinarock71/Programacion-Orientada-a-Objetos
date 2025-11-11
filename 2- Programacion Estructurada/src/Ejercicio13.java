public class Ejercicio13 {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }

    public static void imprimirArrayRecursivo(double[] arr, int indice) {
        if (indice >= arr.length) return;
        System.out.println("Precio: $" + arr[indice]);
        imprimirArrayRecursivo(arr, indice + 1);
    }
}
