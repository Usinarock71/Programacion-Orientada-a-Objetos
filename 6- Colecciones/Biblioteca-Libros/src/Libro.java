public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor; // Asociación simple con Autor

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    /**
     * Muestra título, ISBN, año y el nombre del autor.
     */
    public void mostrarInfo() {
        System.out.println("--- Ficha de Libro ---");
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Año: " + this.anioPublicacion);
        // Accede al autor para mostrar su nombre
        System.out.println("Autor: " + this.autor.getNombre());
    }

    // Getters (necesarios para los métodos de la Biblioteca)
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
}