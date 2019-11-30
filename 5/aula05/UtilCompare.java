package aula05;
import java.util.*;

public class UtilCompare{

    public static Figura findMax(Figura[] array){
        int topo=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].compareTo(array[topo])>0){
                i=topo;
            }
        }
        return array[topo];
    }
    public static void sortArray(Figura[] f){
        Arrays.sort(f);
    }
}