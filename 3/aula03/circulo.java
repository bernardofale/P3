package aula03;
public class circulo extends Figura{
	private double raio;
	private double area;
	private double perimetro;
	
	public circulo(double x, double y, double raio) {
		super(new ponto(x,y));
		this.raio=raio;
		area=Math.PI*Math.pow(raio,2);
		perimetro=2*Math.PI*raio;
	}
	public circulo(double raio){
		this(0,0,raio);
	}
	public circulo(circulo c1){
		this(c1.pontos().get(0).x(),c1.pontos().get(0).y(),c1.raio());
	}
	public double raio() {
		return raio;
	}
	public double area(){
		return area;
	}
	public double perimetro(){
		return perimetro;
	}
	public boolean equals(circulo c){
		boolean k=false;
		if(this.raio==c.raio()){
			k=true;
		}
		return k;
		}

	
}
