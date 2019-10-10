package aula03;
public class Veiculo{
    private int cilindrada;
    private int potencia;
    private int peso;
    private String carta;
    private int lotacao;

    public Veiculo(int cilindrada, int potencia, int peso, String carta, int lotacao){
        this.cilindrada=cilindrada;
        this.potencia=potencia;
        this.peso=peso;
        assert carta.equals("A") || carta.equals("B") || carta.equals("C") || carta.equals("D");
        this.carta=carta;
        this.lotacao=lotacao;
    }
    public int cilindrada(){
        return cilindrada;
    }
    public int potencia(){
        return potencia;
    }
    public int peso(){
        return peso;
    }
    public String carta(){
        return carta;
    }
    public int lotacao(){
        return lotacao;
    }
}