/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import Postres.Helado;
import Postres.Pastel;
import Postres.Postre;

/**
 *
 * @author andresn17
 */
public class ManejadorDePrecio {
    private static double precioFinal;
    
    private static double CalcularPrecioFinal(Postre postre){
        if(postre instanceof Helado){
            Helado helado=(Helado)postre;
            double precioParcial=helado.getPrecioParcial();
            int numeroAderezos=helado.getAderezos().size();
            precioFinal=(precioParcial+(precioParcial*0.12))+(numeroAderezos*0.50);
            return precioFinal;
            
        }if(postre instanceof Pastel){
            Pastel pastel=(Pastel)postre;
            double precioParcial=pastel.getPrecioParcial();
            int numeroAderezos=pastel.getAderezos().size();
            precioFinal=(precioParcial+(precioParcial*0.12))+(numeroAderezos*0.50);
            return precioFinal;
        }
       
        return precioFinal;
    }
    
    public static String ShowPrecioFinal(Postre postre){
        return "Precio Final: $"+CalcularPrecioFinal(postre);
        
    }
    
}
