package aula03;

import java.util.LinkedList;
public class Condutor{
    private LinkedList<String> cartas;
    private int idade;
    private String nome;

    public Condutor(String nome, int idade, String[] cartaIDs){
        assert idade>=16 : "Idade insuficiente para ter carta.";
        assert cartaIDs.length>0;
        assert (cartaIDs.equals("A") || cartaIDs.equals("B") || cartaIDs.equals("C") || cartaIDs.equals("D"));
        this.cartas=new LinkedList<String>(); //cria uma lista cada vez que é adicionado um condutor
        this.idade=idade;
        this.nome=nome;
        for(int i=0; i<cartaIDs.length; i++){ //adiciona o tipo de cartas que o condutor possui (pode ser mais que uma)
            if(cartaIDs[i].equals("A") && idade>=16){ //verifica se pode ter todo o tipo de carta
                cartas.add(cartaIDs[i]);
            }else if(cartaIDs[i].equals("B") && idade>=18){
                cartas.add(cartaIDs[i]);
            }else if(cartaIDs[i].equals("C") && idade>=21){
                cartas.add(cartaIDs[i]);
            }else if(cartaIDs[i].equals("D") && idade>=27){
                cartas.add(cartaIDs[i]);
            }
    }
    }
    public int idade(){
        return idade;
    }
    public String nome(){
        return nome;
    }
    public LinkedList<String> cartas(){
        return cartas;
    }
    public boolean valid(Veiculo v){
        for(int i=0; i<cartas.size(); i++){
            if(this.cartas().get(i)==v.carta()){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return "Nome: "+nome+", Idade: "+idade+", Cartas: "+cartas;
    }
}