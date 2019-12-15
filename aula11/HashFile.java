package aula11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class HashFile {
    private static Set<String> words;
    private String txt;
    private static Scanner sc;

    public HashFile(String txt) throws IOException {
        this.txt = txt;
        sc=new Scanner(new File(txt));
        words=new HashSet<>();
        readFile();
    }
    public String getTxt() {
        return txt;
    }
    private void readFile() {
        int total=0;
        while(sc.hasNext()){
            total++;
            words.add(sc.next());
        }
        System.out.printf("Número total de palavras-> %d \n",total);
        System.out.printf("Número de diferentes palavras-> %d \n",total-words.size());

    }

    public static void main(String[] args) throws IOException {
        new HashFile("src/aula11/teste.txt");
    }
}

