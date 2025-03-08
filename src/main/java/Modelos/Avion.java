package Modelos;

public class Avion extends MedioDeTransporte {

    private int capacidadMaxima;

    public Avion(String marcaDeVehiculo, String modeloDeVehiculo, String placaDeVehiculo, String velocidadMaxima, int capacidadMaxima) {
        super(marcaDeVehiculo, modeloDeVehiculo, placaDeVehiculo, velocidadMaxima);
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    @Override
    public String toString() {
        return super.toString() + "CapacidadMaxima=" + capacidadMaxima;
    }
}
