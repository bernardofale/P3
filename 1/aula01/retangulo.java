package aula01;

public class retangulo{
	private ponto c;
	private double altura;
	private double largura;
	private double area;
	private double perimetro;
	
	public retangulo(double altura, double largura, double x, double y){
		this.largura=largura;
		this.altura=altura;
		area=altura*largura;
		perimetro=(altura*2)+(largura*2);
		c=new ponto(x,y);
	
	}
	public retangulo(ponto c, double altura, double largura) {
		this.c=c;
		this.altura=altura;
		this.largura=largura;
		area=altura*largura;
		perimetro=(altura*2)+(largura*2);
	}
	
	public ponto c() {
		return this.c;
	}
	public double altura() {
		return this.altura;
	}
	public double largura() {
		return this.altura;
	}
	public double area() {
		return this.area;
	}
	public double perimetro() {
		return this.perimetro;
	}
	public String toString() {
		return "Retângulo --> \n"+
				"\nComprimento: "+altura+
				"\nLargura: "+largura+
				"\nCentro: "+c+
				"\nÁrea: "+area+
				"\nPerimetro: "+perimetro;
				
	}
}