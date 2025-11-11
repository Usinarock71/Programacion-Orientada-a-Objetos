import java.util.ArrayList;
import java.util.HashSet; // Para mostrar autores únicos
import java.util.List;
import java.util.Set; // Para el HashSet

public class Biblioteca {
    private String nombre;
    // Atributo de Colección (Relación 1 a N)
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        // Inicializa la lista en el constructor
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        this.libros.add(nuevoLibro);
        System.out.println("Libro '" + titulo + "' agregado a la biblioteca.");
    }

    public void listarLibros() {
        System.out.println("\n=== LIBROS EN LA BIBLIOTECA: " + this.nombre + " ===");
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
            return;
        }
        for (Libro libro : this.libros) {
            libro.mostrarInfo();
        }
    }

    // --- Métodos de Búsqueda y Filtrado ---

    // Método auxiliar (privado) para reutilizar la lógica de búsqueda
    private Libro buscar(String isbn) {
        for (Libro libro : this.libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro; // Devuelve el objeto encontrado
            }
        }
        return null; // No encontrado
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        System.out.println("\n--- Buscando libro por ISBN: " + isbn + " ---");
        Libro libro = buscar(isbn);
        if (libro != null) {
            libro.mostrarInfo();
        } else {
            System.out.println("ERROR: Libro con ISBN " + isbn + " no encontrado.");
        }
        return libro;
    }

    public void eliminarLibro(String isbn) {
        Libro libro = buscar(isbn);
        if (libro != null) {
            this.libros.remove(libro);
            System.out.println("\nLibro '" + libro.getTitulo() + "' eliminado correctamente.");
        } else {
            System.out.println("\nERROR: No se pudo eliminar el libro (ISBN " + isbn + " no existe).");
        }
    }

    public int obtenerCantidadLibros() {
        int cantidad = this.libros.size();
        System.out.println("\nLa biblioteca tiene un total de: " + cantidad + " libros.");
        return cantidad;
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n--- Libros publicados en el año: " + anio + " ---");
        int contador = 0;
        for (Libro libro : this.libros) {
            if (libro.getAnioPublicacion() == anio) {
                libro.mostrarInfo();
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No se encontraron libros publicados en ese año.");
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("\n--- Autores Disponibles en la Biblioteca ---");
        // Usamos un HashSet para evitar autores duplicados
        Set<Autor> autoresUnicos = new HashSet<>();

        for (Libro libro : this.libros) {
            autoresUnicos.add(libro.getAutor());
        }

        if (autoresUnicos.isEmpty()) {
            System.out.println("No hay autores para mostrar.");
            return;
        }

        for (Autor autor : autoresUnicos) {
            autor.mostrarInfo();
        }
    }
}
