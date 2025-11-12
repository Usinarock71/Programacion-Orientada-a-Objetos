import java.util.ArrayList;
import java.util.List;

// --- Clases de la Kata 2 ---

abstract class Figura {
    protected String nombre;
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    public abstract double calcularArea();
    public String getNombre() {
        return nombre;
    }
}

class Circulo extends Figura {
    private double radio;
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Figura {
    private double base;
    private double altura;
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return base * altura;
    }
}

// --- TAREA ---
public class MainKata2 {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo("Círculo Rojo", 10.0));
        figuras.add(new Rectangulo("Rectángulo Azul", 5.0, 3.0));

        System.out.println("Cálculo de Áreas (Polimorfismo):");
        for (Figura fig : figuras) {
            System.out.println("Área de " + fig.getNombre() + ": " + fig.calcularArea());
        }
    }
}