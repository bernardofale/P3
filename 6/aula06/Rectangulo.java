package aula06;

public class Rectangulo extends Figura{
	private double altura;
	private double largura;

	public Rectangulo(double x, double y, double altura, double largura){
		super(x,y);
		this.altura=altura;
		this.largura=largura;
	}
	public Rectangulo(double altura, double largura){
		this(0,0,altura,largura);
	}
	public Rectangulo(Rectangulo r){
		this(r.p().x(),r.p().y(),r.altura(),r.largura());
	}
	public double largura(){
		return largura;
	}
	public double altura(){
		return altura;
	}
	public double area(){
		double area=altura*largura;
		return area;
	}
	public double perimetro(){
		double perimetro=largura*2+altura*2;
		return perimetro;
	}
	public boolean equals(Rectangulo r){
		boolean k=false;
		if(this.getClass().getSimpleName().equals("Rectangulo") && this.area()==r.area()){
			k=true;
		}
		return k;
		}
	public String toString(){
		return "Retângulo de centro ("+this.p().x()+","+this.p().y()+"), Largura: "+this.largura()+
				", Altura: "+this.altura()+"\n";
	}
}