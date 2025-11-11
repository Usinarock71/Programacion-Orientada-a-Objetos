public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", dni=" + dni + ", tarjeta=" + (tarjeta != null ? tarjeta.getNumero() : "N/A") + "]";
    }
}
