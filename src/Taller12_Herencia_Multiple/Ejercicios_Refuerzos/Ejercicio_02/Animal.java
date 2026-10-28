package Taller12_Herencia_Multiple.Ejercicios_Refuerzos.Ejercicio_02;

public class Animal implements Nadador, Volador{
    private String especie;

    public Animal(String especie){
        this.especie = especie;
    }

    @Override
    public void nadar(){
        System.out.println("El animal (" + especie + ") está volando por el aire");
    }

    @Override
    public void volar(){
        System.out.println("El animal (" + especie + ") está nadando en el agua");
    }
}
