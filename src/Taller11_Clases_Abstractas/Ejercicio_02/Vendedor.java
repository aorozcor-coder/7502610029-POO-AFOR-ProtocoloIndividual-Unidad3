package Taller11_Clases_Abstractas.Ejercicio_02;

public class Vendedor extends Empleado {
    private double ventasTotales;
    private double porcentajeComision;

    public Vendedor(String nombre, double salarioBase, double ventasTotales, double porcentajeComision) {
        super(nombre, salarioBase);
        this.ventasTotales = ventasTotales;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (ventasTotales * porcentajeComision);
    }
}
