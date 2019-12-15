package aula11;

import aula09.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsGeneric {

    public static void main(String[] args){
        List<Pessoa> vp = new ArrayList<>();
        for (int i=0; i<10; i++)
            vp.add(new Pessoa("Bebé no Vector "+i,
                    1000+i, Data.today()));
        Iterator<Pessoa> vec = vp.iterator();
        printSet(vec);
        List<Pessoa> lp = new LinkedList<>();
        while ( vec.hasNext() )
            lp.add( vec.next() );
        Iterator<Pessoa> lista = lp.iterator();
        while ( lista.hasNext() )
            System.out.println( lista.next() );
        List<Figura> figList = new ArrayList<>();
        figList.add(new Circulo(1,3, 1));
        figList.add(new Quadrado(3,4, 2));
        figList.add(new Rectangulo(1,2, 2,5));
        printSet(figList.iterator());
        System.out.println("Soma da Area de Lista de Figuras: " +
                sumArea(figList));
// Partindo do principio que Quadrado extends Rectangulo:
        List< Rectangulo > quadList =
                new LinkedList<>();
        quadList.add(new Quadrado(3,4, 2));
        quadList.add(new Rectangulo(1,2, 2,5));
        System.out.printf("Soma da Area de Lista de Quadrados: ", sumArea(quadList)); //funciona ????
    }
    private static double sumArea(List<? extends Figura> list){
       /* double soma=0;
        Iterator<? extends Figura> iterador=list.iterador();
        while(iterador.hasNext()){
            soma+=iterador.next().area();
        }
        return soma;
        */

        double soma=list.stream()
                            .collect(Collectors.summingDouble(f->f.area()));

        return soma;
    }


    private static void printSet(Iterator i) {
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
