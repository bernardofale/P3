package aula05;
import java.util.*;

public class ColecaoFiguras{
    private double maxArea;
    private List<Figura> figuras;
    
    public ColecaoFiguras(double maxArea){
        this.maxArea=maxArea;
        figuras=new ArrayList<Figura>();
    }
    public double maxArea(){
        return maxArea;
    }
    public boolean addFigura(Figura f){
        int proof=0;
        int proof2=0;
        for (int i = 0; i < figuras.size(); i++) {
            if(this.figuras.get(i)==f){
                    proof++;
        }else if(this.areaTotal()>this.maxArea()){
            proof2++;
        }
    }
        if(proof<1 && proof2<1){
            figuras.add(f);
            return true;
        }
        return false;
    }
    public boolean delFigura(Figura f){
			return figuras.remove(f);
    }   

    public double areaTotal(){
        double areaTotal=0;
        for(Figura f : figuras){
		    areaTotal += f.area();
		}
		return areaTotal;
    }
    public boolean exists(Figura f){
        return figuras.contains(f);
    }
    public String toString(){
        return "Área máxima: "+this.maxArea();
    }

    public Figura[] getFiguras(){
        Figura[] figs=new Figura[figuras.size()];
        figs=figuras.toArray(figs);
        return figs;
    }
    public Ponto[] getCentros(){
        List<Ponto> pont=new ArrayList<Ponto>();
        for (Figura f : figuras) {
            pont.add(f.p());
        }
        Ponto[] pontos=new Ponto[pont.size()];
        pontos=pont.toArray(pontos);
        return pontos;
    }

}