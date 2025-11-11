public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; // Agregación
    private Conductor conductor; // Asociación

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null) {
            conductor.setVehiculo(this);
        }
    }

    @Override
    public String toString() {
        return "Vehiculo [patente=" + patente + ", modelo=" + modelo + ", motor=" + motor +
                ", conductor=" + (conductor != null ? conductor.getNombre() : "N/A") + "]";
    }
}
