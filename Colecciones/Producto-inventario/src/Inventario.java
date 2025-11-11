import java.util.ArrayList;

public class Inventario {

    // Atributo: Colección de Productos (Relación 1 a N)
    private ArrayList<Producto> productos;

    // Constructor: Inicializa la lista
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // --- Métodos Requeridos ---

    public void agregarProducto(Producto p) {
        this.productos.add(p);
        System.out.println("Producto '" + p.getNombre() + "' agregado.");
    }

    public void listarProductos() {
        System.out.println("\n=== LISTADO TOTAL DE PRODUCTOS (" + productos.size() + ") ===");
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        for (Producto p : this.productos) {
            p.mostrarInfo();
        }
    }

    // Método auxiliar (privado) para la búsqueda, reutiliza código
    private Producto buscar(String id) {
        for (Producto p : this.productos) {
            if (p.getId().equals(id)) {
                return p; // Devuelve el objeto encontrado
            }
        }
        return null; // No encontrado
    }

    public Producto buscarProductoPorId(String id) {
        Producto p = buscar(id);
        if (p != null) {
            System.out.println("\n--- Producto encontrado (ID: " + id + ") ---");
            p.mostrarInfo();
        } else {
            System.out.println("\nERROR: Producto con ID " + id + " no encontrado.");
        }
        return p;
    }

    public void eliminarProducto(String id) {
        Producto p = buscar(id);
        if (p != null) {
            this.productos.remove(p);
            System.out.println("\nProducto '" + p.getNombre() + "' eliminado correctamente.");
        } else {
            System.out.println("\nERROR: No se pudo eliminar el producto " + id + " (no existe).");
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscar(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("\nStock de '" + p.getNombre() + "' actualizado a " + nuevaCantidad + ".");
        } else {
            System.out.println("\nERROR: No se pudo actualizar el stock (ID " + id + " no existe).");
        }
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n--- Productos de la categoría: " + categoria + " ---");
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : this.productos) {
            if (p.getCategoria() == categoria) {
                filtrados.add(p);
                p.mostrarInfo();
            }
        }
        if (filtrados.isEmpty()) {
            System.out.println("No se encontraron productos en esta categoría.");
        }
        return filtrados;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : this.productos) {
            total += p.getCantidad(); // Acumula el stock
        }
        System.out.println("\nEl stock total de todos los productos es: " + total + " unidades.");
        return total;
    }

    public Producto obtenerProductoConMayorStock() {
        Producto maxProducto = null;
        if (productos.isEmpty()) {
            System.out.println("\nNo hay productos para evaluar el stock máximo.");
            return null;
        }

        // Algoritmo de Máximo
        for (Producto p : this.productos) {
            if (maxProducto == null || p.getCantidad() > maxProducto.getCantidad()) {
                maxProducto = p;
            }
        }

        System.out.println("\n--- Producto con Mayor Stock ---");
        maxProducto.mostrarInfo();
        return maxProducto;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        System.out.println("\n--- Productos con precio entre $" + min + " y $" + max + " ---");
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto p : this.productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                filtrados.add(p);
                p.mostrarInfo();
            }
        }
        if (filtrados.isEmpty()) {
            System.out.println("No se encontraron productos en ese rango de precios.");
        }
        return filtrados;
    }

    public void mostrarCategoriasDisponibles() {
        System.out.println("\n--- Categorías Disponibles en el Sistema ---");
        // Usamos el método .values() del enum para iterar
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat + ": " + cat.getDescripcion());
        }
    }
}