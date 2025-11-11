public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Ana López", "Gerente", 250000);
        Empleado e2 = new Empleado("Juan Pérez", "Desarrollador");
        Empleado e3 = new Empleado("María Gómez", "Diseñadora");

        e1.actualizarSalario(10);
        e2.actualizarSalario(20000);
        e3.actualizarSalario(5);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}