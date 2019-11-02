package aula06;

public class Cereal extends Alimento implements PratoVeg {
	
	private String nome;
	
	public Cereal(String nome, double proteina, double kcal, double peso) {
		super(proteina,kcal,peso);
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Cereal [nome=" + nome + ", proteinas=" + this.getProteina() + 
				"gt, kcal=" + this.getKcal() + ", peso=" + this.getPeso() + "]";
	}
	
	public boolean equals(Cereal c) {
		if(this.nome.equals(c.getNome())) {
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
