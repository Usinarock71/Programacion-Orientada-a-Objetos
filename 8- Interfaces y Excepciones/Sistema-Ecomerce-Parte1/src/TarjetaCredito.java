class TarjetaCredito implements Pago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con Tarjeta de Crédito por $" + monto);
        // Lógica de conexión con el banco...
        System.out.println("Pago Aprobado.");
    }
}