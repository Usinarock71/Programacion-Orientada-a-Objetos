public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // (N) Referencia al "Uno"

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // Un curso puede crearse sin profesor
    }

    /**
     * Sincroniza ambos lados de la relación.
     */
    public void setProfesor(Profesor nuevoProfesor) {
        Profesor profesorViejo = this.profesor;

        // 1. Si el nuevo profesor es el mismo que el viejo, no hacer nada.
        if (profesorViejo == nuevoProfesor) {
            return;
        }

        // 2. Desvincularse del profesor viejo (si existía)
        if (profesorViejo != null) {
            profesorViejo._internalRemoveCurso(this);
        }

        // 3. Vincularse al profesor nuevo
        this.profesor = nuevoProfesor;

        // 4. Sincronizar al profesor nuevo (si no es null)
        if (nuevoProfesor != null) {
            nuevoProfesor._internalAddCurso(this);
        }
    }

    /**
     * Muestra la información del curso y el nombre del profesor (si lo tiene).
     */
    public void mostrarInfo() {
        System.out.println("--- Ficha de Curso ---");
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);

        String nombreProfesor = (this.profesor != null) ? this.profesor.getNombre() : "Sin asignar";
        System.out.println("Profesor: " + nombreProfesor);
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
