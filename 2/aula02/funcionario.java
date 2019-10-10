package aula02;

public class funcionario {
	private Pessoa p;
	private func f;
	
	public funcionario(Pessoa p, func f) {
		this.p=p;
		this.f=f;
	}
	
	public Pessoa p() {
		return this.p;
	}
}
