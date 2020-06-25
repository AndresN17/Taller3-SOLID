package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class Postre {
	private ArrayList<Aderezo> aderezos;
	private String sabor;
	
	public Postre(String sabor) {
		this.sabor = sabor;
		this.aderezos = new ArrayList<>();
	}

	public ArrayList<Aderezo> getAderezos() {
		return aderezos;
	}
	
	public String getSabor() {
		return this.sabor;
	}
	public void anadirAderezo(Aderezo aderezo) {
		this.getAderezos().add(aderezo);
	};
	
	public void quitarAderezo(Aderezo aderezo) {
		this.getAderezos().remove(aderezo);
	};
	
	//se cre� la clase Postres para eliminar la clase operaciones aderezos y para que pastes y helado solo tengan explicitamente metodos que los diferencian
	//
}