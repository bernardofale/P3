package aula03;
public class PesadoP extends Veiculo{
    public PesadoP(int cilindrada, int potencia, int peso, String carta, int lotacao){
        super(cilindrada, potencia, peso, "D", 750);
    }
    @Override public String toString(){
        return "Veículo Pesado de Pessoas: \n"+"Cilindrada: "+this.cilindrada()+"\n"+"Poteência: "
                +this.potencia()+"Cv\n"+"Peso: "+this.peso()+"Kg\n"+"Lotação: "+this.lotacao()+"Kg\n";
    }
}