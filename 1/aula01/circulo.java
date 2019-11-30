package aula01;
public class circulo {
	private double raio;
	private ponto c;
	private double area;
	private double perimetro;
	
	public circulo(double x, double y, double raio){
		c=new ponto(x,y);
		this.raio=raio;
		area= Math.PI*raio*raio; 
		perimetro=2*Math.PI*raio;
	}
	public circulo(ponto c, double raio) {
		this.c=c;
		this.raio=raio;
		area= Math.PI*raio*raio; 
		perimetro=2*Math.PI*raio;
	}
	public double raio() {
		return this.raio;
	}
	public ponto c() {
		return this.c;
	}
	public double area() {
		return this.area;
	}
	public double perimetro() {
		return this.perimetro;
	}
	public String toString() {
		return "Retângulo --> \n"+
				"\nRaio: "+raio+
				"\nCentro: "+c+
				"\nÁrea: "+area+
				"\nPerimetro: "+perimetro;
				
	}
	
}
