import java.time.LocalDate;

public class ClaveSeguridad {
    private String codigo;
    private LocalDate ultimaModificacion;

    public ClaveSeguridad(String codigo) {
        this.codigo = codigo;
        this.ultimaModificacion = LocalDate.now();
    }

    @Override
    public String toString() {
        return "ClaveSeguridad [ultimaModificacion=" + ultimaModificacion + "]";
    }
}
