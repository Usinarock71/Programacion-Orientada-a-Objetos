public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Agregación
    private Usuario usuario; // Asociación

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

    // El objeto Bateria se recibe desde afuera, demostrando agregación
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    // Método para la relación bidireccional
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        usuario.setCelular(this);
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Celular [marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", usuario=" + (usuario != null ? usuario.getNombre() : "N/A") + "]";
    }
}
