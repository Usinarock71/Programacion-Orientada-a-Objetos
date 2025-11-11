import java.time.LocalDate;
import java.util.UUID;

public class FirmaDigital {
    private String codigoHash;
    private LocalDate fecha;
    private Usuario usuario; // Agregación

    // La firma se crea para un usuario específico.
    public FirmaDigital(Usuario usuario) {
        this.usuario = usuario;
        this.fecha = LocalDate.now();
        // Se genera un hash único para simular la firma.
        this.codigoHash = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "FirmaDigital [codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + "]";
    }
}
