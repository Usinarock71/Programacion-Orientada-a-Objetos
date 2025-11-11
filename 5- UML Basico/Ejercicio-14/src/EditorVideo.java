public class EditorVideo {
    // Dependencia de Creación: El método 'exportar' crea una instancia de Render.
    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("Iniciando exportación del proyecto: " + proyecto.toString());
        // El objeto Render es creado aquí.
        Render renderFinal = new Render(formato, proyecto);
        System.out.println("Render finalizado con éxito.");
        return renderFinal;
    }
}
