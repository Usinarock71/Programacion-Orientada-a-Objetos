import java.time.LocalDate;
import java.time.LocalTime;

public class CitaMedica {
    private LocalDate fecha;
    private LocalTime hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(LocalDate fecha, LocalTime hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica [fecha=" + fecha + ", hora=" + hora + "]\n --> " + paciente + "\n --> " + profesional;
    }
}
