package aula05;
import java.io.*;
import java.nio.*;
import java.util.*;
import aula05.Pessoa;

public class Nokia implements loadF  {
    String txt;
    List<String> agenda;
    List<Pessoa> pessoas;
    public Nokia(String txt){
        this.txt=txt;
        agenda=new ArrayList<String>();
        pessoas=new ArrayList<Pessoa>();
    }
    public String txt(){
        return txt;
    }
    public void loadFile() throws FileNotFoundException {        
       Scanner in=new Scanner(new File(this.txt()));
        while (in.hasNextLine()) {
            agenda.add(in.nextLine());
        }
        agenda.remove("Nokia");
        for (int i = 0; i < agenda.size(); i++) {
            agenda.remove("");
        }
        for (int i = 0; i < agenda.size(); i++) {
            pessoas.add(new Pessoa(agenda.get(i), Integer.parseInt(agenda.get(i+1)), new Data(agenda.get(i+2))));
            i+=2;

        }
        System.out.print(pessoas+"\n");
    }
    
}
