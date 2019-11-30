package aula08;
import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PergResp{
    private static List<String> perguntas;
    private static List<String> respostas;
    private static List<Integer> solucao;
    private static int nPerguntas=0;

    public PergResp() throws IOException{
        perguntas=new ArrayList<String>();
        respostas=new ArrayList<String>();
        solucao=new ArrayList<Integer>();
        addP();

    }
    public void addP() throws IOException{
        List<String> elem=Files.readAllLines(Paths.get("questions.txt"));
        for (String s : elem) {
            String[] linha=s.split("&&");
            perguntas.add(linha[1]);
            respostas.add(linha[2]);
            respostas.add(linha[3]);
            respostas.add(linha[3]);
            respostas.add(linha[5]);
            solucao.add(Integer.parseInt(linha[6]));
            nPerguntas++;
        }
    }
    public int nPerguntas(){
        return nPerguntas;
    }
    //pergunta
    public String q(int i){
        return String.format("%s", perguntas.get(i));
    }
    //respostas 4 a 4
    public String a(int i){
        return String.format("%s", respostas.get(i));
    }
    public int solucao(int i){
        return solucao.get(i);
    }

    }

