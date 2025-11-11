public class Main {
    public static void main(String[] args) {

        // 1. Creamos una biblioteca
        Biblioteca miBiblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear al menos tres autores
        System.out.println("--- Tarea 2: Creando autores ---");
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor autor3 = new Autor("A003", "Stephen King", "Estadounidense");

        // 3. Agregar 5 libros (usando el método de composición)
        System.out.println("\n--- Tarea 3: Agregando libros ---");
        miBiblioteca.agregarLibro("978-0307389732", "Cien años de soledad", 1967, autor1);
        miBiblioteca.agregarLibro("978-0747532743", "Harry Potter y la piedra filosofal", 1997, autor2);
        miBiblioteca.agregarLibro("978-0307348128", "El amor en los tiempos del cólera", 1985, autor1);
        miBiblioteca.agregarLibro("978-0451169518", "It (Eso)", 1986, autor3);
        miBiblioteca.agregarLibro("978-0439064873", "Harry Potter y la cámara secreta", 1998, autor2);

        // 4. Listar todos los libros
        miBiblioteca.listarLibros();

        // 5. Buscar un libro por su ISBN
        miBiblioteca.buscarLibroPorIsbn("978-0451169518"); // Busca "It (Eso)"

        // 6. Filtrar y mostrar los libros publicados en un año específico
        miBiblioteca.filtrarLibrosPorAnio(1998); // Busca "Harry Potter y la cámara secreta"

        // 7. Eliminar un libro por su ISBN y listar los libros restantes
        miBiblioteca.eliminarLibro("978-0307389732"); // Elimina "Cien años de soledad"
        miBiblioteca.listarLibros();

        // 8. Mostrar la cantidad total de libros
        miBiblioteca.obtenerCantidadLibros(); // Debería ser 4

        // 9. Listar todos los autores disponibles (sin duplicados)
        miBiblioteca.mostrarAutoresDisponibles();
    }
}
