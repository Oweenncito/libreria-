package Modelos;

public class Auto extends MedioDeTransporte{
    private double capacidadDeCombustible;

    public Auto(String marcaDeVehiculo, String modeloDeVehiculo, String placaDeVehiculo, String velocidadMaxima, double capacidadDeCombustible) {
        super(marcaDeVehiculo, modeloDeVehiculo, placaDeVehiculo, velocidadMaxima);
        this.capacidadDeCombustible = capacidadDeCombustible;
    }

    public double getCapacidadDeCombustible() {
        return capacidadDeCombustible;
    }

    public void setCapacidadDeCombustible(double capacidadDeCombustible) {
        this.capacidadDeCombustible = capacidadDeCombustible;
    }
    @Override
    public String toString() {
        return super.toString() + "Capacidad de combustible=" + capacidadDeCombustible;
    }
}
