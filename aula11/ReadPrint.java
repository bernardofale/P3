package aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadPrint {
    private Map<String, Integer> occurance; //alinea c)
    private Map<String, Integer> occuranceSort; //alinea d)
    private static Scanner sc;
    private String txt;

    public Map<String, Integer> getOccurance() {
        return occurance;
    }

    public void setOccurance(Map<String, Integer> occurance) {
        this.occurance = occurance;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public ReadPrint(String txt) throws FileNotFoundException {
        this.txt=txt;
        sc=new Scanner(new File(txt));
        occurance=new HashMap<>();
        occuranceSort=new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        readF();

        System.out.print("HashMap não ordenado-> \n");
        printMap(occurance);
        System.out.print("TreeMap ordenado-> \n");
        printMap(occuranceSort);
    }
    private void readF(){
        while(sc.hasNext()){
            String s=sc.next();
            if(occurance.containsKey(s)){
                occurance.put(s,occurance.get(s)+1);
                occuranceSort.put(s,occuranceSort.get(s)+1);
            }else{
                occurance.put(s,1);
                occuranceSort.put(s,1);
            }
        }
    }

    private void printMap(Map<String,Integer> occ) {
        Iterator it = occ.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry i = (Map.Entry) it.next();
            System.out.println(i.getKey() + "\t" + i.getValue());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        new ReadPrint("src/aula11/teste.txt");
    }

}

