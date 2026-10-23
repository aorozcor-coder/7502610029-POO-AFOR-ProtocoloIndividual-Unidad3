package Taller11_Clases_Abstractas.Ejercicio_02;

public class PruebaEmpleado {
    public static void main(String[] args) {
        // Uso de polimorfismo con referencias de la clase abstracta Empleado
        Empleado gerente = new Gerente("Carlos Mendoza", 3500.0, 1200.0);
        Empleado vendedor = new Vendedor("Ana Gomez", 1500.0, 20000.0, 0.05);

        System.out.println("--- Liquidación de Nomina ---");
        gerente.mostrarInformacion();
        vendedor.mostrarInformacion();
    }
}
