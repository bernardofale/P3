package aula03;

public class retangulo extends Figura{
	private double altura;
	private double largura;
	private double area;
	private double perimetro;
	
	public retangulo(double x, double y, double altura, double largura){
		super(new ponto(x,y));
		this.altura=altura;
		this.largura=largura;
		area=largura*altura;
		perimetro=(2*largura)+(2*altura);
	}
	public retangulo(double altura, double largura){
		this(0,0,altura,largura);
	}
	public retangulo(retangulo r){
		this(r.pontos().get(0).x(),r.pontos().get(0).y(),r.altura(),r.largura());
	}

	public double altura() {
		return this.altura;
	}
	public double largura() {
		return this.largura;
	}
	public double area() {
		return this.area;
	}
	public double perimetro() {
		return this.perimetro;
	}
	public boolean equals(retangulo r){
		boolean k=false;
		if(this.altura==r.altura() && this.largura==r.largura()){
			k=true;
		}
		return k;
		}
}