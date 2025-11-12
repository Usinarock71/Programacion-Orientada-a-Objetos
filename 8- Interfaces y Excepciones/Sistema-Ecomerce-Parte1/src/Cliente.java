public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("=========================================");
        System.out.println("ENVIANDO NOTIFICACIÓN AL CLIENTE: " + this.nombre);
        System.out.println("Email: " + this.email);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("=========================================");
    }
}
