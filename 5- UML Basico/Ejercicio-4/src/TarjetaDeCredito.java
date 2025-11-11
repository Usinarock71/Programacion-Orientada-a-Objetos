import java.time.LocalDate;

public class TarjetaDeCredito {
    private String numero;
    private LocalDate fechaVencimiento;
    private Cliente cliente; // Asociación
    private Banco banco;     // Agregación

    public TarjetaDeCredito(String numero, LocalDate fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null) {
            cliente.setTarjetaDeCredito(this); // Establece la relación inversa
        }
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito [numero=" + numero + ", fechaVencimiento=" + fechaVencimiento +
                ", cliente=" + (cliente != null ? cliente.getNombre() : "N/A") + ", banco=" + banco + "]";
    }
}
