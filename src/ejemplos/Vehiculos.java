/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author rox_g
 */
//Primera clase
public class Vehiculos {
    //Atributos privados para aplicar encapsulamiento (necesitan get y set)
    private String tipoVehiculo;
    private int numLlantas;
    
    //Método publico
    public void arrancar(){
        System.out.println("Estoy arrancando, ruuun, ruuun!");
    }
    // Método privado
    private void encender(){
        System.out.println("Estoy encendiendoooo!");
    }
    //Metodos set y get para tipoVehiculo para la lectura y modificación del atributo desde el exterior de la clase
    public void setTipoVehiculo(String tipo){
        this.tipoVehiculo = tipo;
    }
    
    public String getTipoVehiculo(){
        return this.tipoVehiculo;
    }
    
    //Metodos set y get para numLlantas para la lectura y modificación del atributo desde el exterior de la clase
    public void setNumLlantas(int numero){
        this.numLlantas = numero;
    }
    
    public int getNumLlantas(){
        return this.numLlantas;
    }
    
}