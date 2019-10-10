package aula03;
public class Ligeiro extends Veiculo{
    public Ligeiro(int cilindrada, int potencia, int peso, String carta, int lotacao){
        super(cilindrada, potencia, peso, "B", 4);
    }
    @Override public String toString(){
        return "Veículo Ligeiro: \n"+"Cilindrada: "+this.cilindrada()+"\n"+"Potência: "
                +this.potencia()+"Cv\n"+"Peso: "+this.peso()+"Kg\n"+"Lotação: "+this.lotacao()+" pessoas\n";
    }
}