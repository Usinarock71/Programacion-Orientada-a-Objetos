import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private Cliente cliente; // Asociación para notificar (Tarea 5)
    private String estado;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "PENDIENTE";
    }

    public void agregarProducto(Producto p) {
        this.productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        // Itera y usa el polimorfismo de p.calcularTotal()
        for (Producto p : this.productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    // Tarea 5: Notificar al cliente cuando cambia el estado
    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        // Usa la interfaz notificable del cliente
        this.cliente.notificar("El estado de su pedido ha cambiado a: " + nuevoEstado);
    }
}
