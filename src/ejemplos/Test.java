/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author rox_g
 */
public class Test {
    public static void main(String[] args) {
        //Crear primer objeto de la clase Vehiculos, será moto
        Vehiculos moto= new Vehiculos();
        
        //Sólo el método arrancar es público, encender es privado
        moto.arrancar();
        
        //Definir cuantas llantas tiene y que tipo es
        moto.setNumLlantas(2);
        moto.setTipoVehiculo("Motocicleta");
        System.out.println(moto.getTipoVehiculo());
        System.out.println(moto.getNumLlantas());
        
    }
}
