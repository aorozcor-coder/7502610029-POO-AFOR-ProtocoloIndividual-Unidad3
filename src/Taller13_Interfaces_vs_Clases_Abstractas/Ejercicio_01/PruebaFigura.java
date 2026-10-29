package Taller13_Interfaces_vs_Clases_Abstractas.Ejercicio_01;

public class PruebaFigura {
    public static void main(String[] args){
        Rectangulo rectangulo1 = new Rectangulo(12,6);
        Triangulo triangulo1 = new Triangulo(8,10);

        System.out.println("Area del Rectangulo: " + rectangulo1.calcularArea());
        System.out.println("Area del Triangulo: " + triangulo1.calcularArea());
    }
}
