//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Estudiante
        Estudiante e1 = new Estudiante("Juan", "Pérez", "3°A", 7.5);
        e1.mostrarInfo();
        e1.subirCalificacion(1.0);
        e1.bajarCalificacion(0.5);
        e1.mostrarInfo();

        // 2. Mascota
        Mascota m1 = new Mascota("Firulais", "Perro", 3);
        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();

        // 3. Libro
        Libro l1 = new Libro("El Quijote", "Cervantes", 1605);
        l1.setAnioPublicacion(3000); // inválido
        l1.setAnioPublicacion(2005); // válido
        System.out.println("Libro: " + l1.getTitulo() + " | Autor: " + l1.getAutor() + " | Año: " + l1.getAnioPublicacion());

        // 4. Gallinas
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1);
        g1.ponerHuevo();
        g1.envejecer();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g1.mostrarEstado();
        g2.mostrarEstado();

        // 5. Nave Espacial
        NaveEspacial nave = new NaveEspacial("Apolo", 50);
        nave.mostrarEstado();
        nave.avanzar(40); // debería fallar
        nave.recargarCombustible(30);
        nave.despegar();
        nave.avanzar(60);
        nave.mostrarEstado();
    }
}