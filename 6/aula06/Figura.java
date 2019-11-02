package aula06;
import java.util.*;

public abstract class Figura implements Comparable<Figura>{
    Ponto k;
    public Figura(double x, double y){
        k=new Ponto(x,y);
    }
    public abstract double area();
    public abstract double perimetro(); 
    public abstract String toString();
    public Ponto p(){
        return k;
    }  
    public int compareTo(Figura f){
       if((int)(this.area()-f.area())<0) return -1; 
       if((int)(this.area()-f.area())>0) return 1;

       return 0;
    }
}