package Taller12_Herencia_Multiple.Ejercicio_01;

public class Ave implements Cantante, Volador{

    @Override
    public void cantar(){
        System.out.println("El ave esta cantando");
    }

    @Override
    public void volar(){
        System.out.println("El ave esta volando");
    }
}
