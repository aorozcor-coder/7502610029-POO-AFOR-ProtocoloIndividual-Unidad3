package Taller11_Clases_Abstractas.Ejercicio_03;

public abstract class Documento {
    protected String titulo;

    public Documento(String titulo) {
        this.titulo = titulo;
    }

    // Metodo abstracto obligatorio
    public abstract void imprimir();

    /*
     * MALA PRACTICA: Definir un metodo concreto cuando debería ser abstracto.
     * Si la clase base proporciona un cuerpo vacío o genérico, las subclases no están
     * obligadas a sobrescribirlo, rompiendo la restricción del diseño.
     */
    public void exportarPDF() {
        System.out.println("Exportación por defecto a PDF no configurada.");
    }
}
