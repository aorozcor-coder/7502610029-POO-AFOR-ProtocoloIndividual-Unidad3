package Taller13_Interfaces_vs_Clases_Abstractas.Ejercicio_03;

public abstract class VehiculoAbstracto {

    /*
     * DEMOSTRACIÓN DE ERROR DE COMPILACIÓN
     * La palabra clave 'default' está reservada ÚNICAMENTE para interfaces.
     * //Si se intenta escribir:
     *
     * default void encender() {
     *     System.out.println("Encendiendo...");
     * }
     *
     * //El compilador arrojará error
     */

    // Forma correcta en una clase abstracta (método concreto estándar con cuerpo)
    public void encender() {
        System.out.println("El vehículo ha sido encendido correctamente.");
    }
}
