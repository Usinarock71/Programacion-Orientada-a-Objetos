public class Main_Parte1 {
    public static void main(String[] args) {
        // Tarea 5: Crear Cliente
        Cliente cliente1 = new Cliente("Tiziano Caamaño", "tiziano@utn.com");

        // Tarea 3: Crear Pedido
        Pedido pedido1 = new Pedido(cliente1);

        // Tarea 2: Crear Productos
        Producto p1 = new Producto("Notebook Pro", 1500.0);
        Producto p2 = new Producto("Mouse Inalámbrico", 50.0);

        pedido1.agregarProducto(p1);
        pedido1.agregarProducto(p2);

        // Calcular total usando la interfaz Pagable
        double totalDelPedido = pedido1.calcularTotal();
        System.out.println("El total del pedido es: $" + totalDelPedido);

        // Tarea 4: Procesar el pago
        // Pago sin descuento
        Pago medioDePago1 = new TarjetaCredito();
        medioDePago1.procesarPago(totalDelPedido);

        System.out.println("----");

        // Pago con descuento
        PagoConDescuento medioDePago2 = new PayPal();
        medioDePago2.procesarPago(totalDelPedido);

        // Tarea 5: Notificar cambio de estado
        pedido1.setEstado("ENVIADO");
    }
}
