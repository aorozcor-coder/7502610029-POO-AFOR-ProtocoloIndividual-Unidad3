package Taller11_Clases_Abstractas.Ejercicio_01;

public class PruebaFigura {
    public static void main(String[] args) {

        Figura circulo = new Circulo(5.0);
        Figura rectangulo = new Rectangulo(4.0, 6.0);

        System.out.println("--- Cálculo de Áreas ---");
        circulo.mostrarArea();
        rectangulo.mostrarArea();
    }
}
