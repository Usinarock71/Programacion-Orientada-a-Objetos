public class Empleado {
    // Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0; // contador global

    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor sobrecargado (solo nombre y puesto)
    public Empleado(String nombre, String puesto) {
        this.id = ++totalEmpleados; // ID automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100000; // salario por defecto
    }

    // Métodos sobrecargados para actualizar salario

    // 1) Porcentaje de aumento
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // 2) Cantidad fija
    public void actualizarSalario(int aumento) {
        this.salario += aumento;
    }

    // Metodo estático para mostrar el total de empleados creados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre +
                ", Puesto=" + puesto + ", Salario=$" + salario + "]";
    }
}
