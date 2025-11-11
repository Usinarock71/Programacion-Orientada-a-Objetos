public class Foto {
    private String imagen; // Simulado con un String, podría ser un array de bytes
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto [formato=" + formato + ", imagen=" + imagen + "]";
    }
}
