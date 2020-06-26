/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche;

import Postres.*;

/**
 *
 * @author Pedro Mendoza
 */
public class LecheDeslactosada extends LecheEntera {
   /* 
    @Override
    public void usarHelado() {
        System.out.println("Usando leche deslactosada");
    }

    @Override
    public void usarPastel() {
        // Lanzar error No se puede usar en pastel
        throw new RuntimeException(this.getClass() + ": No se puede usar en pastel");
        
    }
     */
    @Override
    public void usar(Object postre){
        if(postre.getClass() == Pastel.class){
            System.out.println("Pastel no puede usar deslactosada, se usara leche descremada");
            LecheEntera lechetemp = new LecheDescremada();
            lechetemp.usar(postre);
        }
        else{
            System.out.println("Usando leche deslactosada");
        }
        
    }
    
}
