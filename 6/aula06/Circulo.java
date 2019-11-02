package aula06;
public class Circulo extends Figura{
	private double raio;
	private double area;
	private double perimetro;

	public Circulo(double x, double y, double raio) {
		super(x,y);
		this.raio=raio;
	}
	public Circulo(double raio){
		this(0,0,raio);
	}
	public Circulo(Circulo c1){
		this(c1.p().x(),c1.p().y(),c1.raio());
	}
	public double raio() {
		return raio;
	}
	public double area(){
		area=Math.PI*Math.pow(raio,2);

		return area;
	}
	public double perimetro(){
		perimetro=Math.PI*2*raio;

		return perimetro;
	}
	public boolean equals(Circulo c){
		boolean k=false;
		if(this.getClass().getSimpleName().equals("Circulo") && this.area()==c.area()){
			k=true;
		}
		return k;
		}
	public String toString(){
		return "Círculo de centro ("+this.p().x()+","+this.p().y()+"), Raio: "+this.raio()
				+"\n";
	}

	
}
