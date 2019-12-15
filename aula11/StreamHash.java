package aula11;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class StreamHash {
        private static List<String> lines;
        private String txt;
        private static Scanner sc;

        public StreamHash(String txt) throws IOException {
            this.txt = txt;
            lines= Files.readAllLines(Paths.get(txt));
            readFile();
        }
        private void readFile() {
            long total=lines.stream()
                                .flatMap(line -> Arrays.stream(line.split(" ")))
                                    .count();

            long diff=lines.stream()
                                .flatMap(line -> Arrays.stream(line.split(" ")))
                                    .distinct()
                                        .count();
            System.out.printf("Número total de palavras-> %d \n",total);
            System.out.printf("Número de diferentes palavras-> %d \n",diff);

        }

        public static void main(String[] args) throws IOException {
            new StreamHash("src/aula11/teste.txt");
        }
    }
