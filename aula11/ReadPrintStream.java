package aula11;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class ReadPrintStream {
    private Map<String, Integer> occurance; //alinea c)
    private Map<String, Integer> occuranceSort; //alinea d)
    private List<String> lines;
    private String txt;

    public Map<String, Integer> getOccurance() {
        return occurance;
    }

    public ReadPrintStream(String txt) throws IOException {
        this.txt=txt;
        lines= Files.readAllLines(Paths.get(txt));
        occurance=new HashMap<>();
        occuranceSort=new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        readF1();
        System.out.print("HashMap não ordenado-> \n");
        printMap(occurance);
        System.out.print("TreeMap ordenado-> \n");
        printMap(occuranceSort);
    }
    private void readF1(){
        List<String> words=lines.stream()
                            .flatMap(line -> Arrays.stream(line.split(" ")))
                            .collect(Collectors.toList());

        words.forEach(s -> occurance.put(s,0));
        words.forEach(s -> occuranceSort.put(s,0));

        words.stream()
                .filter(s -> occurance.containsKey(s))
                    .forEach(s -> occurance.put(s,occurance.get(s)+1));
        words.stream()
                .filter(s -> occuranceSort.containsKey(s))
                    .forEach(s -> occuranceSort.put(s,occuranceSort.get(s)+1));

    }

    private void printMap(Map<String,Integer> occ) {
        Iterator it = occ.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry i = (Map.Entry) it.next();
            System.out.println(i.getKey() + "\t" + i.getValue());
        }
    }

    public static void main(String[] args) throws IOException {
        new ReadPrintStream("src/aula11/teste.txt");
    }

}


