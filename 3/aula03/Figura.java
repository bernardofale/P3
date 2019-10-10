package aula03;
import java.util.*;

public class Figura{
    private LinkedList<ponto> pontos;

    public Figura(ponto p1){
        pontos=new LinkedList<ponto>();
        this.pontos.add(p1);
    }
    public ponto p1(){
        return pontos.get(0);
    }
    public LinkedList<ponto> pontos(){
        return this.pontos;
    }
    @Override public String toString(){
        return "("+pontos.get(0).x()+","+pontos.get(0).y()+")";
    }

}