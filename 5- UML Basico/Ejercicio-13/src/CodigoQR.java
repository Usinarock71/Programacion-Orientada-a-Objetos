public class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociación

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CodigoQR [valor=" + valor + ", usuario=" + usuario + "]";
    }
}
