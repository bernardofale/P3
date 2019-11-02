package aula06;
public class Bolseiro extends Estudante{
    private int bolsa;
    
    public Bolseiro(String nome, int cc, Data dataN){
        super(nome, cc, dataN);
    }

    public int bolsa(){
        return bolsa;
    }
    public void setBolsa(int bolsa){ //???
        this.bolsa=bolsa;
    }
    @Override public String toString(){
        return super.toString()+ ", Bolsa: " + bolsa +" euros";

    }

}