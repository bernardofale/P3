package aula04;
import java.util.*;

public class Figura{
    private LinkedList<Ponto> pontos;
    private double altura;
    private double largura;

    public Figura(Ponto p1, double altura, double largura){
        pontos=new LinkedList<Ponto>();
        this.pontos.add(p1);
        this.altura=altura;
        this.largura=largura;
    }
    public Ponto p1(){
        return pontos.get(0);
    }
    public double altura(){
        return altura;
    }
    public double largura(){
        return largura;
    }
    public double area(){
        double area=altura*largura;
        if(this.getClass().getSimpleName().equals("Circulo")){
            double area1=Math.PI*Math.pow(altura,2);
            return area1;
        }
        return area;
    }
    public LinkedList<Ponto> pontos(){
        return this.pontos;
    }
    @Override public String toString(){
        if(this.getClass().getSimpleName().equals("Circulo")){
            return this.getClass().getSimpleName()+" de centro ("+pontos.get(0).x()+","+pontos.get(0).y()+") e raio: "+altura;
        }else if(this.getClass().getSimpleName().equals("Quadrado")){
            return this.getClass().getSimpleName()+" de centro ("+pontos.get(0).x()+","+pontos.get(0).y()+") e lado: "+altura;
        }
        return this.getClass().getSimpleName()+" de centro ("+pontos.get(0).x()+","+pontos.get(0).y()+"), altura: "+altura+", largura: "+largura;
    }

}