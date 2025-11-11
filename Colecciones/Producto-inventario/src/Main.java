public class Main {

    public static void main(String[] args) {

        Inventario miInventario = new Inventario();

        // 1. Crear al menos cinco productos y agregarlos
        System.out.println("--- Tarea 1: Agregando productos ---");
        miInventario.agregarProducto(new Producto("A001", "Notebook Gamer", 2500.00, 10, CategoriaProducto.ELECTRONICA));
        miInventario.agregarProducto(new Producto("A002", "Remera Algodón", 150.00, 50, CategoriaProducto.ROPA));
        miInventario.agregarProducto(new Producto("A003", "Tomate Kilo", 2.50, 200, CategoriaProducto.ALIMENTOS));
        miInventario.agregarProducto(new Producto("A004", "Silla de Oficina", 1800.00, 20, CategoriaProducto.HOGAR));
        miInventario.agregarProducto(new Producto("A005", "Mouse Inalámbrico", 900.00, 30, CategoriaProducto.ELECTRONICA));

        // 2. Listar todos los productos
        miInventario.listarProductos();

        // 3. Buscar un producto por ID
        miInventario.buscarProductoPorId("A004"); // Busca la Silla

        // 4. Filtrar por categoría
        miInventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // 5. Eliminar un producto por ID y listar restantes
        miInventario.eliminarProducto("A003"); // Elimina el Tomate
        miInventario.listarProductos(); // Muestra la lista actualizada

        // 6. Actualizar el stock
        miInventario.actualizarStock("A001", 15); // Actualiza stock de la Notebook

        // 7. Mostrar el total de stock
        miInventario.obtenerTotalStock();

        // 8. Obtener producto con mayor stock
        miInventario.obtenerProductoConMayorStock(); // Debería ser la Remera (50)

        // 9. Filtrar productos por precio ($1000 y $3000)
        miInventario.filtrarProductosPorPrecio(1000.0, 3000.0); // Notebook y Silla

        // 10. Mostrar categorías disponibles
        miInventario.mostrarCategoriasDisponibles();
    }
}