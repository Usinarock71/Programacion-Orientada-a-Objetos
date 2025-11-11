import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
    private LocalDate fecha;
    private LocalTime hora;
    private Cliente cliente; // Asociación Unidireccional
    private Mesa mesa;       // Agregación Unidireccional

    public Reserva(LocalDate fecha, LocalTime hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Reserva [fecha=" + fecha + ", hora=" + hora + ",\n cliente=" + cliente + ",\n mesa=" + mesa + "]";
    }
}
