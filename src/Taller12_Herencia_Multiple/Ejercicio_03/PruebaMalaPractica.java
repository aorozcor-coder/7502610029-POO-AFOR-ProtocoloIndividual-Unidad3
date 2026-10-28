package Taller12_Herencia_Multiple.Ejercicio_03;

public class PruebaMalaPractica {
    public static void main(String[] args) {
        Carro miCarro = new Carro("TOYOTA");

        System.out.println("--- Demostración de Mala Práctica de Interfaces ---");
        // Se ejecuta un metodo incoherente asignado por una mala arquitectura de interfaces
        miCarro.volar();
    }
}
