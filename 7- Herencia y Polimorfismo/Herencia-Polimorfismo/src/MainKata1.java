// --- Clases de la Kata 1 ---

/**
 * Clase base: Vehiculo
 */
class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }

    public void mostrarInfo() {
        System.out.println("Vehículo: " + this.marca + " " + this.modelo);
    }
}

/**
 * Subclase: Auto
 */
class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Puertas: " + this.cantidadPuertas);
    }
}

// --- TAREA ---
public class MainKata1 {
    public static void main(String[] args) {
        // Tarea: Instanciar un auto y mostrar su información completa.
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        miAuto.mostrarInfo();
    }
}