package aula06;

import java.util.LinkedList;

public class Vegetariano extends Prato {
	private TIPO tipo;
	public Vegetariano(String nome) {
		super(nome);
		tipo=TIPO.VEG;
		
	}	
	@Override public String toString(){
		return super.toString()+"\n";
	}	
}
