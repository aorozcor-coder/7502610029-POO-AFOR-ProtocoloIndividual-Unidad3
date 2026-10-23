package Taller11_Clases_Abstractas.Ejercicio_01;

public abstract class Figura {

    public abstract double calcularArea();

    public void mostrarArea() {
        System.out.println("El área de la figura es: " + calcularArea());
    }
}
