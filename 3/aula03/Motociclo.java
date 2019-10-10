package aula03;
public class Motociclo extends Veiculo{
    public Motociclo(int cilindrada, int potencia, int peso, String carta, int lotacao){
        super(cilindrada, potencia, peso, "A", 2);
    }
    @Override public String toString(){
        return "Motociclo: \n"+"Cilindrada: "+this.cilindrada()+"\n"+"Poteência: "
                +this.potencia()+"Cv\n"+"Peso: "+this.peso()+"Kg\n"+"Lotação: "+this.lotacao()+" pessoas\n";
    }
}