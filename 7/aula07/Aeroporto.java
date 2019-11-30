package aula07;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Aeroporto{
    private static ArrayList<Voos> v;
    private static Map<String,String> c;

    public Aeroporto() throws IOException{
        v=new ArrayList<Voos>();
        c=new HashMap<>();
        lerCompanhias();
        lerVoos();
        print();
        writeF("infopublico.txt");
        media();
        writeC("cidades.txt");
    }
    public void lerVoos() throws IOException{
        List<String> elem=Files.readAllLines(Paths.get("voos.txt"));
        for (String s : elem) {
            String[] linha = s.split("\t");
            String comp=c.get(linha[1].substring(0,2));
			if(linha[0].length() == 5) {
                if(linha.length == 3) addVoo(new Voos(new Hora(linha[0]), linha[1], comp, linha[2], new Hora()));
                else if(linha.length == 4) addVoo(new Voos(new Hora(linha[0]), linha[1],comp , linha[2], new Hora(linha[3])));
            }
        }

    }
    public void lerCompanhias() throws IOException{
        List<String> companhias=Files.readAllLines(Paths.get("companhias.txt"));
        
        for (String s : companhias) {
            String[] x=s.split("\t");
            if(x[0].length()==2){
                c.put(x[0],x[1]);
        }
    }
}
    public void writeF(String file) throws IOException{
        PrintWriter writer =new PrintWriter(new FileWriter(file));
        for (Voos voos : v) {
            writer.print(voos);
        }
        writer.close();

        
    }
           
    public void print(){
        System.out.print("Hora\tVoo\tCompanhia\tOrigem\tAtraso\tObs\n");
        for (Voos voos : v) {
            System.out.println(voos);
        }
    }

    public void media(){
        HashMap<String,Double> mapa=new HashMap<>();
        for (String companhia : c.values()) {
            int cont=0;
            int soma=0;

            for (Voos voos : v) {
                if (voos.companhia()==companhia) {
                    cont++;
                    soma+=voos.atraso().minutos();
                }
            }
            
            mapa.put(companhia, (double)((double)soma/(double)cont));
            
        }

        System.out.println(Arrays.asList(mapa));
    }
    public void writeC(String file) throws IOException{                 //resultado errado, nao consigo eliminar as cidades ja iteradas ateriormente
        PrintWriter writer=new PrintWriter(new FileWriter(file));
        writer.print("Origem Voos \n");
        int cont=0;
        for (Voos origem : v) {
            for (Voos x : v) {
                if(origem.origem().equals(x.origem())){
                    cont++;
                }
            }
            writer.print(origem.origem()+"\t"+cont+"\n");
            cont=0;
        }
        writer.close();
    }
    public boolean addVoo(Voos voo){
        return v.add(voo);
    }

}
