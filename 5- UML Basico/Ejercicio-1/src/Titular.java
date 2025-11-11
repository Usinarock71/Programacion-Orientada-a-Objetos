public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // Referencia al Pasaporte

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Método para establecer la relación bidireccional
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", dni=" + dni + ", numeroPasaporte=" + (pasaporte != null ? pasaporte.getNumero() : "N/A") + "]";
    }

    public String getNombre() {
        return nombre;
    }
}
