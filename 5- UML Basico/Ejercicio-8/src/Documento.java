public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // Composición

    public Documento(String titulo, String contenido, Usuario firmante) {
        this.titulo = titulo;
        this.contenido = contenido;
        // La FirmaDigital es creada y gestionada por el Documento.
        this.firmaDigital = new FirmaDigital(firmante);
    }

    @Override
    public String toString() {
        return "Documento [titulo=" + titulo + "]\n --> " + firmaDigital;
    }
}
