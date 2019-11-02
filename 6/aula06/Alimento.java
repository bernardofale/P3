package aula06;

public abstract class Alimento{
    private double proteina;
    private double kcal;
    private double peso;

    public Alimento(double proteina, double kcal, double peso){
        this.proteina=proteina;
        this.kcal=kcal;
        this.peso=peso;
    }
    public double getProteina(){
        return proteina;
    }
    public double getKcal(){
        return kcal;
    }
    public double getPeso(){
        return peso;
    }
    @Override
    public String toString(){
        return "Calorias: "+kcal+", Proteina: "+proteina+", Peso: "+peso+"\n";
    }

}