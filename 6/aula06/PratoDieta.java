package aula06;

import java.util.LinkedList;

public class PratoDieta extends Prato {
	private TIPO tipo;
	private double mkcal;

	public PratoDieta(String nome, double mkcal) {
		super(nome);
		this.mkcal=mkcal;
		tipo=TIPO.DIETA;
		
	}

	public double getMkcal() {
		return mkcal;
	}

	@Override
	public String toString() {
		return super.toString()+ "PratoDieta " +"[mkcal=" + mkcal + "]";
	}
	
	

	
}
	
	


