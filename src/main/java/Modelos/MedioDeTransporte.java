package Modelos;

public abstract class MedioDeTransporte {

    private String marcaDeVehiculo;
    private String modeloDeVehiculo;
    private String placaDeVehiculo;
    private String velocidadMaxima;

    public MedioDeTransporte(){
        this.marcaDeVehiculo = "";
        this.modeloDeVehiculo = "";
        this.placaDeVehiculo = "";
        this.velocidadMaxima = "";
    }

    public MedioDeTransporte(String marcaDeVehiculo, String modeloDeVehiculo, String placaDeVehiculo, String velocidadMaxima) {
        this.marcaDeVehiculo = marcaDeVehiculo;
        this.modeloDeVehiculo = modeloDeVehiculo;
        this.placaDeVehiculo = placaDeVehiculo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarcaDeVehiculo() {
        return marcaDeVehiculo;
    }

    public void setMarcaDeVehiculo(String marcaDeVehiculo) {
        this.marcaDeVehiculo = marcaDeVehiculo;
    }

    public String getModeloDeVehiculo() {
        return modeloDeVehiculo;
    }

    public void setModeloDeVehiculo(String modeloDeVehiculo) {
        this.modeloDeVehiculo = modeloDeVehiculo;
    }

    public String getPlacaDeVehiculo() {
        return placaDeVehiculo;
    }

    public void setPlacaDeVehiculo(String placaDeVehiculo) {
        this.placaDeVehiculo = placaDeVehiculo;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(String velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "MedioDeTransporte{" +
                "marcaDeVehiculo='" + marcaDeVehiculo + '\'' +
                ", modeloDeVehiculo='" + modeloDeVehiculo + '\'' +
                ", placaDeVehiculo='" + placaDeVehiculo + '\'' +
                ", velocidadMaxima='" + velocidadMaxima + '\'' +
                '}';
    }
}
