public enum CategoriaProducto {

    // Definición de constantes con sus atributos
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    // Atributo
    private final String descripcion;

    // Constructor (siempre privado para enums)
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método getter
    public String getDescripcion() {
        return descripcion;
    }
}