public class GeneradorQR {
    // Dependencia de Creación: El método 'generar' crea y devuelve un CodigoQR.
    public CodigoQR generar(String valor, Usuario usuario) {
        // Crea la instancia localmente.
        CodigoQR nuevoCodigo = new CodigoQR(valor, usuario);
        System.out.println("Generando nuevo código QR...");
        return nuevoCodigo;
    }
}
