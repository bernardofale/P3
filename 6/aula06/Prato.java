package aula06;

import java.util.LinkedList;

public class Prato{
	
	enum TIPO {VEG, DIETA, REG}
	private String nome;
	private LinkedList<Alimento> composition;
	private TIPO tipo;
	
	public Prato(String nome) {
		super();
		this.nome = nome;
		this.composition = new LinkedList<Alimento>();
	}

	public String getNome() {
		return nome;
	}

	public LinkedList<Alimento> getComposição() {
		return composition;
	}
	public TIPO tipo(){
		return tipo;
	}
	
	public boolean addPrato(Alimento e) {
		if(composition.add(e)) return true;
		return false;
	}
	
	
	public double getkcal() {
		double kcal=0;
		
		for(Alimento p : composition) {
			kcal += p.getKcal();
		}
		return kcal;
	}
	
	public double getProteina() {
		double proteina=0;
		
		for(Alimento p : composition) {
			proteina += p.getProteina();
		}
		return proteina;
	}
	
	public double getPeso() {
		double peso=0;
		
		for(Alimento p : composition) {
			peso += p.getPeso();
		}
		return peso;
	}
	@Override public String toString(){
		return "Nome: "+this.getNome()+", Prato "+this.tipo()+"\n";
	}
	
	
	
	
	
}
