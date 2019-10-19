package aula04;

public class Quadrado extends Retangulo{
	private double lado;

	public Quadrado(double x, double y, double lado){
		super(x,y,lado,lado);
	}
	public Quadrado(double lado){
		this(0,0,lado);
	}
	public double lado(){
		return lado;
	}
	public Quadrado(Quadrado q){
		this(q.pontos().get(0).x(),q.pontos().get(0).y(),q.lado());
	}
	public boolean equals(Quadrado q){
		boolean k=false;
		if(super.altura()==q.altura() && super.largura()==q.largura()){
			k=true;
		}
		return k;
		} 
}