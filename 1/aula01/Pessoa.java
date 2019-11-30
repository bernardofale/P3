package aula01;

public class Pessoa{
	private String nome;
	private int cc;
	private Data dataN;


public Pessoa(String nome, int cc, Data dataN){
	
	assert nome.length()>0 : "invalid name";
	assert cc>0 :"invalid cc number";
	
	nome = this.nome;
	cc = this.cc;
	dataN = this.dataN;
	}
public String nome(){
	
	return this.nome;
}

public int cc(){
	
	return this.cc;
}

public Data dat(){
	
	return this.dataN;
}

public String toString(){
	
	return String.format("%1$"+12+"s", nome)+" | "+String.format("%1$"+11+"s", cc)+" | "+String.format("%1$"+8+ "s", dataN);
}



}

