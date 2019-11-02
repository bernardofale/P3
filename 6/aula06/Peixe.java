package aula06;

public class Peixe extends Alimento {
	public enum TIPO {fresco, congelado };
	
	private TIPO tipo;
	
	public Peixe(TIPO tipo, double proteina, double kcal, double peso) {
		super(proteina,kcal,peso);
		this.tipo=tipo;
	}
	
	public TIPO getTipo() {
		return this.tipo;
	}
	
	@Override
	public String toString() {
		return "Peixe [proteina=" + this.getProteina() + "gr, kcal=" + this.getKcal() + 
		"gr, peso=" + this.getPeso() + ", tipo=" + tipo + "]";
	}

	public boolean equals(Peixe p) {
		if(this.tipo == p.getTipo()) {
			if(this.getKcal() == p.getKcal()) {
				if(this.getPeso() == p.getPeso()) {
					if(this.getProteina() == p.getProteina()) {
						return true;
					}
				}
			}
		}
	return false;
	}
}
