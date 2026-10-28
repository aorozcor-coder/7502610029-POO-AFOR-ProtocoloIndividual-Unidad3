package Taller12_Herencia_Multiple.Ejercicio_03;

    /*
     * MALA PRÁCTICA DE DISEÑO:
     * Implementar una interfaz irrelevante para el dominio del objeto.
     * Un 'Carro' no vuela, pero la interfaz 'Volador' lo obliga a escribir
     * una implementación inservible.
     */
    public class Carro implements Volador {
        private String marca;

        public Carro(String marca) {
            this.marca = marca;
        }

        @Override
        public void volar() {
            System.out.println("Error de diseño: El vehículo (" + marca + ") es un carro terrestre y no puede volar.");
        }
    }

