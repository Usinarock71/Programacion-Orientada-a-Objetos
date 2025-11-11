import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; // (1) Lista de los "Muchos"

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>(); // Importante: inicializar la lista
    }

    // --- Métodos de Sincronización ---

    /**
     * Delega la lógica de asignación al Curso para mantener el invariante.
     */
    public void agregarCurso(Curso c) {
        c.setProfesor(this);
    }

    /**
     * Delega la lógica de eliminación al Curso para mantener el invariante.
     */
    public void eliminarCurso(Curso c) {
        if (this.cursos.contains(c)) {
            c.setProfesor(null); // Asignar null rompe la relación en ambos lados
        }
    }

    // --- Métodos Internos (usados solo por la clase Curso) ---
    /**
     * Añade el curso a la lista. Solo debe ser llamado por Curso.setProfesor()
     */
    void _internalAddCurso(Curso c) {
        if (!this.cursos.contains(c)) {
            this.cursos.add(c);
        }
    }

    /**
     * Quita el curso de la lista. Solo debe ser llamado por Curso.setProfesor()
     */
    void _internalRemoveCurso(Curso c) {
        this.cursos.remove(c);
    }

    // --- Métodos Solicitados ---

    public void listarCursos() {
        System.out.println("  Cursos dictados por " + this.nombre + ":");
        if (this.cursos.isEmpty()) {
            System.out.println("    (Ninguno asignado)");
            return;
        }
        for (Curso c : this.cursos) {
            System.out.println("    - " + c.getCodigo() + ": " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("--- Ficha de Profesor ---");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Total de Cursos: " + this.cursos.size());
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
