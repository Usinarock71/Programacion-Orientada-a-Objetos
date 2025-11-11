import java.time.LocalDate;

public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto; // Composición: la foto es parte del pasaporte
    private Titular titular; // Asociación: referencia al titular

    // El objeto Foto se crea junto con el Pasaporte, demostrando la composición
    public Pasaporte(String numero, LocalDate fechaEmision, String urlImagen, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(urlImagen, formatoFoto); // El ciclo de vida de Foto depende de Pasaporte
    }

    // Método para establecer la relación bidireccional
    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setPasaporte(this); // Se establece la referencia en la otra dirección
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Pasaporte [numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + ", titular=" + (titular != null ? titular.getNombre() : "N/A") + "]";
    }
}
