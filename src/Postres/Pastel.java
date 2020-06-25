/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;


/**
 *
 * @author Pedro Mendoza
 */public class Pastel extends Postre{
	   
		//private String sabor;
	    private double precioParcial;
	    //private ArrayList<Aderezo> aderezos;
	    
	    
	    public Pastel(String sabor) {
			super(sabor);
			//this.sabor = sabor;
			this.precioParcial = 15.55;
		}
	    
	    //
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

            @Override
            public String toString() {
                return "Pastel{" + "sabor=" + super.getSabor() + ", precioParcial=" + precioParcial + ", aderezos=" + super.getAderezos().toString() + '}';
            }
            
	    public String showPrecioFinal(){
	        return "Precio Final: $ " + calcularPrecioFinal();
	    }
	    
	}
