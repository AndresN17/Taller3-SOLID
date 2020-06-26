/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author kenny
 */
public class Crema extends Aderezo{

    private String nombre;
 

    @Override
    public void setNombre() {
        this.nombre = "Crema";
    }
    
    @Override
    public String toString(){
        return "CREMA";
}
}
