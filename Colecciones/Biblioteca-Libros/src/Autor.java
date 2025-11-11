public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    /**
     * Muestra la información del autor en consola.
     */
    public void mostrarInfo() {
        System.out.println("  [Autor] ID: " + id + ", Nombre: " + nombre + ", Nacionalidad: " + nacionalidad);
    }

    // Getters (necesarios para que el Libro acceda a ellos)
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    // hashCode/equals (Esencial para el HashSet de 'mostrarAutoresDisponibles')
    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Autor autor = (Autor) obj;
        return id.equals(autor.id);
    }
}