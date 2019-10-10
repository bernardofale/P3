package aula03;
public class PesadoM extends Veiculo{
    public PesadoM(int cilindrada, int potencia, int peso, String carta, int lotacao){
        super(cilindrada, potencia, peso, "C", 750);
    }
    @Override public String toString(){
        return "Veículo Pesado de mercadoria \n"+"Cilindrada: "+this.cilindrada()+"\n"+"Poteência: "
                +this.potencia()+"Cv\n"+"Peso: "+this.peso()+"Kg\n"+"Lotação: "+this.lotacao()+"Kg\n";
    }
}