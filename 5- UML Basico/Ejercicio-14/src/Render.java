public class Render {
    private String formato;
    private Proyecto proyecto; // Asociación

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Render [formato=" + formato + ", proyecto=" + proyecto + "]";
    }
}
