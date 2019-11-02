package aula06;

public class Carne extends Alimento {
	
	public enum TIPO {vaca, porco, peru, frango, outro };
	
	private TIPO tipo;
	
	public Carne(TIPO tipo, double proteina, double kcal, double peso) {
		super(proteina,kcal,peso);
		this.tipo=tipo;
	}
	
	public TIPO getTipo() {
		return this.tipo;
	}

	@Override
	public String toString() {
		return "Carne [proteina=" + this.getProteina() + "gr, kcal=" + this.getKcal() + 
				"gr, peso=" + this.getPeso() + ", tipo=" + tipo + "]";
	}
	
	public boolean equals(Carne c) {
		if(this.tipo == c.getTipo()) {
			if(this.getKcal() == c.getKcal()) {
				if(this.getPeso() == c.getPeso()) {
					if(this.getProteina() == c.getProteina()) {
						return true;
					}
				}
			}
		}
	return false;
	}
	
	
}
