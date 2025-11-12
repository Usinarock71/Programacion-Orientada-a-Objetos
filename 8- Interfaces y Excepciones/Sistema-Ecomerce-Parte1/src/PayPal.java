class PayPal implements PagoConDescuento {

    // Implementa el método de PagoConDescuento
    @Override
    public double aplicarDescuento(double monto) {
        // Aplica un 5% de descuento por pagar con PayPal
        return monto * 0.95;
    }

    // Implementa el método heredado de 'Pago'
    @Override
    public void procesarPago(double monto) {
        double montoFinal = aplicarDescuento(monto);
        System.out.println("Procesando pago con PayPal...");
        System.out.println("Monto Original: $" + monto + " | Descuento aplicado: $" + (monto - montoFinal));
        System.out.println("TOTAL A PAGAR: $" + montoFinal);
        System.out.println("Pago Aprobado.");
    }
}
