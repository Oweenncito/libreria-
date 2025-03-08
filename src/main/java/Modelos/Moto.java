/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author PC
 */
public class Moto extends MedioDeTransporte{
    
    protected String cilindraje;
   
    public Moto (){
        
        this.cilindraje ="";
        
        
    }

    
    
    public Moto(String marcaDeVehiculo, String modeloDeVehiculo, String placaDeVehiculo, String velocidadMaxima) {
        super(marcaDeVehiculo, modeloDeVehiculo, placaDeVehiculo, velocidadMaxima);
        
        
                this.cilindraje = cilindraje;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    @Override
    public String toString() {
        return "Moto{" + "cilindraje=" + cilindraje + '}';
    }
    
}
