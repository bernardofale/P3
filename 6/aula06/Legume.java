package aula06;

public class Legume extends Alimento implements PratoVeg {
	private String nome;

	public Legume(String nome, double proteina, double kcal, double peso) {
		super(proteina,kcal,peso);
		this.nome = nome;

	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Legume [nome=" + nome + ", proteina=" + this.getProteina() + 
		"gr, kcal=" + this.getKcal() + "gr, peso=" + this.getPeso() + "]";
	}
	
	public boolean equals(Legume l) {
		if(this.nome.equals(l.getNome())) {
			if(this.getKcal() == l.getKcal()) {
				if(this.getPeso() == l.getPeso()) {
					if(this.getProteina() == l.getProteina()) {
						return true;
					}
				}
			}
		}
	return false;
	}
}
