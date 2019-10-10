package aula03;

public class quadrado extends retangulo{
	private double lado;
	private double area;
	private double perimetro;
	
	public quadrado(double x, double y, double lado){
		super(x,y,lado,lado);
		this.lado=lado;
		area=lado*lado;
		perimetro=lado*4;
	}
	public quadrado(double lado){
		this(0,0,lado);
	}
	public quadrado(quadrado q){
		this(q.pontos().get(0).x(),q.pontos().get(0).y(),q.lado());
	}
	public double lado() {
		return this.lado;
	}
	public double area() {
		return this.area;
	}
	public double perimetro() {
		return this.perimetro;
	}
	public boolean equals(quadrado q){
		boolean k=false;
		if(this.lado()==q.lado() && this.lado==q.lado()){
			k=true;
		}
		return k;
		} 
}