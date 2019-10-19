package aula04;
public class Circulo extends Figura{
	private double raio;

	public Circulo(double x, double y, double raio) {
		super(new Ponto(x,y), raio, 0);
		this.raio=raio;
	}
	public Circulo(double raio){
		this(0,0,raio);
	}
	public Circulo(Circulo c1){
		this(c1.pontos().get(0).x(),c1.pontos().get(0).y(),c1.raio());
	}
	public double raio() {
		return raio;
	}
	public boolean equals(Circulo c){
		boolean k=false;
		if(this.raio==c.raio()){
			k=true;
		}
		return k;
		}

	
}
