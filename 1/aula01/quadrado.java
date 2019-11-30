package aula01;

public class quadrado{
	private ponto c;
	private double lado;
	private double area;
	private double perimetro;
	
	public quadrado(double lado, double x, double y){
		this.lado=lado;
		c=new ponto(x,y);
		area=lado*lado;
		perimetro=lado*4;
		
	}
	public quadrado(double lado, ponto c){
		this.c=c;
		this.lado=lado;
		area=lado*lado;
		perimetro=lado*4;
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
	public ponto c() {
		return this.c;
	}
	
	public String toString() {
		return "Retângulo --> \n"+
				"\nComprimento: "+lado+
				"\nCentro: "+c+
				"\nÁrea: "+area+
				"\nPerimetro: "+perimetro;
				
	}
}