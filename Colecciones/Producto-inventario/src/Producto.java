public class Producto {

    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    // Constructor
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    // Método solicitado por el TP para mostrar la info
    public void mostrarInfo() {
        System.out.println("--- Ficha de Producto ---");
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Stock: " + this.cantidad + " unidades");
        // Usamos el método del enum para mostrar la descripción
        System.out.println("Categoría: " + this.categoria + " (" + this.categoria.getDescripcion() + ")");
    }

    // Getters y Setters (necesarios para los métodos del inventario)
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }
}
