public class Cancion {
    private String titulo;
    private Artista artista; // Asociación

    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "'" + titulo + "' de " + artista.toString();
    }
}
