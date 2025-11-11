public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor; // Asociación unidireccional
    private Editorial editorial; // Agregación

    // Los objetos Autor y Editorial se crean fuera y se pasan al Libro
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", isbn=" + isbn + "]\n --> " + autor + "\n --> " + editorial;
    }
}
