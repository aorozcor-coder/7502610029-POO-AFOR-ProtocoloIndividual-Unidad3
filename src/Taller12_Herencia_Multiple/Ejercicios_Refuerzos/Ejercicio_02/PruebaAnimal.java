package Taller12_Herencia_Multiple.Ejercicios_Refuerzos.Ejercicio_02;

public class PruebaAnimal {
    public static void main(String[] args) {
        Animal pato = new Animal("Pato Silvestre");

        System.out.println("--- Clase Animal ---");
        pato.volar();
        pato.nadar();
    }
}
