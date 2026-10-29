package Taller13_Interfaces_vs_Clases_Abstractas.Ejercicio_02;

public class Pato implements Nadador, Volador{
    private String nombre;

    public Pato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar(){
        System.out.println("El pato " +nombre+" esta volando");
    }

    @Override
    public void nadar(){
        System.out.println("El pato "+nombre+" esta nadando");
    }
}
