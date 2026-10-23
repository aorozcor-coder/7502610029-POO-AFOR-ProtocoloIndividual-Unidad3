package Taller11_Clases_Abstractas.Ejercicio_03;

public class PruebaUsoIncorrecto {
    public static void main(String[] args) {
        /*
         * ERROR DE COMPILACIÓN 1:
         * Intentar instanciar directamente una clase abstracta.
         *
         * Documento doc = new Documento("Archivo"); // ERROR: Documento is abstract; cannot be instantiated
         *
         * Explicación: Las clases abstractas no representan objetos concretos y no pueden
         * ser creadas directamente con el operador 'new'.
         */

        // Uso correcto a través de una subclase concreta
        Documento informe = new Informe("Informe Trimestral");
        informe.imprimir();

        // Evidencia del problema de diseño por definir como concreto un método que debía ser abstracto
        informe.exportarPDF(); // Ejecuta el método por defecto de la clase base en lugar de obligar a implementar
    }
}