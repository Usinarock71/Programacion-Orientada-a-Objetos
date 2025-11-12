import java.util.ArrayList;
import java.util.List;

// --- Clases de la Kata 4 ---

class Animal {
    private String nombre;
    public Animal(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public void hacerSonido() {
        System.out.println(this.nombre + " hace un sonido genérico.");
    }
}

class Perro extends Animal {
    public Perro(String nombre) { super(nombre); }
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Guau! ¡Guau!");
    }
}

class Gato extends Animal {
    public Gato(String nombre) { super(nombre); }
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }
}

class Vaca extends Animal {
    public Vaca(String nombre) { super(nombre); }
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Muuu!");
    }
}

// --- TAREA (Clase Principal) ---
public class MainKata4 {
    public static void main(String[] args) {
        List<Animal> granja = new ArrayList<>();
        granja.add(new Perro("Fido"));
        granja.add(new Gato("Misu"));
        granja.add(new Vaca("Lola"));
        granja.add(new Animal("Criatura"));

        System.out.println("--- Sonidos de la Granja (Polimorfismo) ---");
        for (Animal a : granja) {
            a.hacerSonido();
        }
    }
}