package aula09;
import java.util.*;

public class Pessoa{
	private String nome;
	private int cc;
	private Data dataN;


public Pessoa(String nome, int cc, Data dataN){
	
	assert nome.length()>0 : "invalid name";
	assert cc>0 :"invalid cc number";
	
	this.nome=nome;
	this.cc=cc;
	this.dataN=dataN;
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


@Override public String toString(){
	
	return "Nome: "+this.nome + ", BI: "+cc + ", Data: "+dataN;
}



}

