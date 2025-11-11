public class Main {
    public static void main(String[] args) {

        // 1. Crear Universidad
        Universidad miUniversidad = new Universidad("UTN - FRA");

        // 2. Crear profesores y cursos
        System.out.println("--- Tarea 1 y 2: Creando entidades ---");
        Profesor prof1 = new Profesor("P001", "Ana Torres", "Sistemas");
        Profesor prof2 = new Profesor("P002", "Carlos Ruiz", "Matemática");
        Profesor prof3 = new Profesor("P003", "Laura Mendi", "Física");

        Curso curso1 = new Curso("C101", "Programación I");
        Curso curso2 = new Curso("C102", "Bases de Datos I");
        Curso curso3 = new Curso("C103", "Álgebra");
        Curso curso4 = new Curso("C104", "Física I");
        Curso curso5 = new Curso("C105", "Programación II");

        // Agregar entidades a la Universidad
        miUniversidad.agregarProfesor(prof1);
        miUniversidad.agregarProfesor(prof2);
        miUniversidad.agregarProfesor(prof3);
        miUniversidad.agregarCurso(curso1);
        miUniversidad.agregarCurso(curso2);
        miUniversidad.agregarCurso(curso3);
        miUniversidad.agregarCurso(curso4);
        miUniversidad.agregarCurso(curso5);

        // 3. Asignar profesores a cursos
        System.out.println("\n--- Tarea 3: Asignando profesores ---");
        miUniversidad.asignarProfesorACurso("C101", "P001"); // Prog I -> Ana
        miUniversidad.asignarProfesorACurso("C102", "P001"); // BD I -> Ana
        miUniversidad.asignarProfesorACurso("C105", "P001"); // Prog II -> Ana
        miUniversidad.asignarProfesorACurso("C103", "P002"); // Álgebra -> Carlos

        // 4. Listar cursos y profesores (para verificar sincronización)
        System.out.println("\n--- Tarea 4: Listados (Estado Inicial) ---");
        miUniversidad.listarCursos();
        miUniversidad.listarProfesores();

        // 5. Cambiar el profesor de un curso (Prueba de Invariante)
        System.out.println("\n--- Tarea 5: Re-asignando Prog II a Prof. Laura Mendi ---");
        miUniversidad.asignarProfesorACurso("C105", "P003"); // Prog II -> Laura

        System.out.println("\n--- Verificando Sincronización (Tarea 5) ---");
        System.out.println("... Cursos de Ana Torres (P001) (Debe tener 2 cursos ahora) ...");
        miUniversidad.buscarProfesorPorId("P001").listarCursos();
        System.out.println("\n... Cursos de Laura Mendi (P003) (Debe tener 1 curso ahora) ...");
        miUniversidad.buscarProfesorPorId("P003").listarCursos();
        System.out.println("\n... Profesor de Prog II (C105) (Debe ser Laura Mendi) ...");
        miUniversidad.buscarCursoPorCodigo("C105").mostrarInfo();


        // 6. Remover un curso
        System.out.println("\n--- Tarea 6: Eliminando Curso Álgebra (C103) ---");
        miUniversidad.eliminarCurso("C103");

        System.out.println("\n--- Verificando Sincronización (Tarea 6) ---");
        System.out.println("... Cursos de Carlos Ruiz (P002) (Debe tener 0 cursos) ...");
        miUniversidad.buscarProfesorPorId("P002").listarCursos();


        // 7. Remover un profesor
        System.out.println("\n--- Tarea 7: Eliminando Profesora Ana Torres (P001) ---");
        miUniversidad.eliminarProfesor("P001");

        System.out.println("\n--- Verificando Sincronización (Tarea 7) ---");
        System.out.println("... Profesor de BD I (C102) (Debe ser 'Sin asignar') ...");
        miUniversidad.buscarCursoPorCodigo("C102").mostrarInfo();


        // 8. Mostrar reporte
        System.out.println("\n--- Tarea 8: Reporte Final de Carga Horaria ---");
        miUniversidad.mostrarReporteCargaHoraria(); // Solo deben quedar Carlos (0) y Laura (1)
    }
}
