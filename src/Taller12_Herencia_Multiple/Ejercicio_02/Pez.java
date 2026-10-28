package Taller12_Herencia_Multiple.Ejercicio_02;

public class Pez implements Nadador, Respirador {

    @Override
    public void respirar(){
        System.out.println("El pez esta Respirando");
    }

    @Override
    public void nadar(){
        System.out.println("El pez esta nadando");
    }
}
