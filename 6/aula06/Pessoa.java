package aula06;
import java.util.*;

public abstract class Pessoa{
	private String nome;
	private int cc;
	private Data dataN;
	List<Pessoa> pessoas;


public Pessoa(String nome, int cc, Data dataN){
	
	assert nome.length()>0 : "invalid name";
	assert cc>0 :"invalid cc number";
	
	this.nome=nome;
	this.cc=cc;
	this.dataN=dataN;
	pessoas=new ArrayList<Pessoa>();
	}
public String nome(){
	
	return nome;
}

public int cc(){
	
	return this.cc;
}

public Data dat(){
	
	return this.dataN;
}
public boolean addPpl(Pessoa p){
	for (int i = 0; i < pessoas.size(); i++) {	
		if(p.cc()!=pessoas.get(i).cc()){
			pessoas.add(p);
			return true;
		}
	}
	return false;
}

@Override public String toString(){
	
	return "Nome: "+this.nome + ", BI: "+cc + ", Data: "+dataN;
}



}

