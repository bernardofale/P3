package aula06;
import java.util.*;

public class Ementa{
    public enum DiaSemana {SEG,TER,QUA,QUI,SEX,SAB,DOM;
        public static DiaSemana rand()
        {
            int i = (int) (Math.random() * (6 - 0)) + 0;
            return DiaSemana.values()[i];
        }
    }
    private String nome;
    private String place;
    private DiaSemana dia;
    private LinkedList<Prato> pratos;
    private static int i;

    public Ementa(String nome, String place){
        this.nome=nome;
        this.place=place;
        pratos=new LinkedList<Prato>();
    }
    public DiaSemana dia(){
        return dia;
    }
    public String nome(){
        return nome;
    }
    public String place(){
        return place;
    }

    public void addPrato(Prato prato, DiaSemana x){
        pratos.add(prato);
    } 
    public LinkedList<Prato> pratos(){
        return pratos;
    }
    @Override 
    public String toString(){
        return this.nome()+" no/a "+this.place()+"\n"+pratos+"\n";


    }
}