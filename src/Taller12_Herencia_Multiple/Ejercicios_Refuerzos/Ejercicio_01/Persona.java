package Taller12_Herencia_Multiple.Ejercicios_Refuerzos.Ejercicio_01;

public class Persona implements Hablador, Trabajador {
    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void hablar(){
        System.out.println( nombre + " Esta entablando una conversación");
    }

    @Override
    public void trabajar(){
        System.out.println( nombre + " Esta cumpliendo con sus funciones laborales ");
    }
}
