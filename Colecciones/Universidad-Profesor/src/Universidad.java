import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // --- Métodos de Alta y Baja (Simples) ---
    public void agregarProfesor(Profesor p) {
        this.profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        this.cursos.add(c);
    }

    // --- Métodos de Búsqueda (Simples) ---
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : this.profesores) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null; // No encontrado
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : this.cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null; // No encontrado
    }

    // --- Métodos de Listado ---
    public void listarProfesores() {
        System.out.println("\n=== PROFESORES DE LA UNIVERSIDAD: " + this.nombre + " ===");
        for (Profesor p : this.profesores) {
            p.mostrarInfo();
            p.listarCursos(); // Muestra los cursos asociados
        }
    }

    public void listarCursos() {
        System.out.println("\n=== CURSOS DE LA UNIVERSIDAD: " + this.nombre + " ===");
        for (Curso c : this.cursos) {
            c.mostrarInfo();
        }
    }

    // --- Métodos de Lógica de Negocio (Complejos) ---

    /**
     * Utiliza el método setProfesor() del curso, que maneja la sincronización.
     */
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        System.out.println("\n--- Asignando profesor " + idProfesor + " al curso " + codigoCurso + " ---");
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso != null && profesor != null) {
            curso.setProfesor(profesor); // Delega la sincronización al método del Curso
            System.out.println("Asignación exitosa.");
        } else {
            System.out.println("Error: No se encontró el curso o el profesor.");
        }
    }

    /**
     * Debe romper la relación bidireccional antes de eliminar el curso.
     */
    public void eliminarCurso(String codigo) {
        System.out.println("\n--- Eliminando curso " + codigo + " ---");
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // Rompe la relación (sincronizado)
            curso.setProfesor(null);
            // Elimina el curso de la lista maestra
            this.cursos.remove(curso);
            System.out.println("Curso eliminado.");
        }
    }

    /**
     * Debe desasignar al profesor de todos sus cursos antes de eliminarlo.
     */
    public void eliminarProfesor(String id) {
        System.out.println("\n--- Eliminando profesor " + id + " ---");
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // IMPORTANTE: Iterar sobre una COPIA de la lista para evitar ConcurrentModificationException
            // ya que setProfesor(null) modifica la lista original (p.getCursos())
            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());

            for (Curso c : cursosDelProfesor) {
                c.setProfesor(null); // Desasigna cada curso
            }

            // Elimina al profesor de la lista maestra
            this.profesores.remove(profesor);
            System.out.println("Profesor eliminado y cursos desasignados.");
        }
    }

    /**
     * Tarea 8: Reporte de cantidad de cursos por profesor.
     */
    public void mostrarReporteCargaHoraria() {
        System.out.println("\n--- REPORTE: Carga de Cursos por Profesor ---");
        for (Profesor p : this.profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos.");
        }
    }
}