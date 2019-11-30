package aula07;
public class Companhia{
    private String sigla;
    private String nome;
    private String companhia;
    public Companhia(String sigla, String nome){
        this.sigla=sigla;
        this.nome=nome;
    }
    public String sigla(){
        return sigla;
    }
    public String nome(){
        return nome;
    }
    @Override
    public String toString(){
        return nome;
    }
}