public class Calculadora {
    // Dependencia de Uso: 'impuesto' es un parámetro temporal.
    public void calcular(Impuesto impuesto) {
        // Simula un cálculo complejo.
        double total = impuesto.getMonto() * 1.21;
        System.out.println("Calculando impuesto para: " + impuesto.toString());
        System.out.println("Total a pagar: $" + total);
    }
}
