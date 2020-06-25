/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

/**
 *
 * @author Pedro Mendoza
 */
public class Helado extends Postre{
    //private String sabor;
    private double precioParcial;
    //private ArrayList<Aderezo> aderezos;
    
    public Helado(String sabor){
    	super(sabor);
    	//aderezos= new ArrayList<>();
        //this.sabor=sabor;
        this.precioParcial = 7.85;
    }
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(super.getAderezos().size()*0.50);
        return precioFinal;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }
    
    

    /*public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }*/

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + super.getSabor() + ", precioParcial=" + precioParcial + ", aderezos=" + super.getAderezos().toString() + '}';
    }
    
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
    
    
    
}
