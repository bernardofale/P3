package aula04;

public class Retangulo extends Figura{

	public Retangulo(double x, double y, double altura, double largura){
		super(new Ponto(x,y), altura, largura);
	}
	public Retangulo(double altura, double largura){
		this(0,0,altura,largura);
	}
	public Retangulo(Retangulo r){
		this(r.pontos().get(0).x(),r.pontos().get(0).y(),r.altura(),r.largura());
	}
	public boolean equals(Retangulo r){
		boolean k=false;
		if(super.altura()==r.altura() && super.largura()==r.largura()){
			k=true;
		}
		return k;
		}
}