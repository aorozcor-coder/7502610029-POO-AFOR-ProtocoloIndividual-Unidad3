package Taller11_Clases_Abstractas.Ejercicio_03;

public class Informe extends Documento {

    public Informe(String titulo) {
        super(titulo);
    }

    // Implementación obligatoria del método abstracto de la clase base
    @Override
    public void imprimir() {
        System.out.println("Imprimiendo el informe: " + titulo);
    }

    // Nota: No se sobreescribe exportarPDF() para evidenciar la falla de diseño
}