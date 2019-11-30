package aula05;

public class Quadrado extends Rectangulo{
	private double lado;

	public Quadrado(double x, double y, double lado){
		super(x,y,lado,lado);
		this.lado=lado;
	}
	public Quadrado(double lado){
		this(0,0,lado);
	}
	public Quadrado(Quadrado q){
		this(q.p().x(),q.p().y(),q.lado());
	}
	public double lado(){
		return lado;
	}
	public boolean equals(Quadrado q){
		boolean k=false;
		if(this.altura()==q.altura() && this.largura()==q.largura()){
			k=true;
		}
		return k;
		}
	public String toString(){
		return "Quadrado de centro ("+this.p().x()+","+this.p().y()+"), Lado: "+this.lado()+
				"\n";
	} 
}