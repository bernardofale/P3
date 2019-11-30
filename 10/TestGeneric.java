package aula10;

import aula09.Pessoa;
import aula09.Data;
import aula09.Figura;
import aula09.Quadrado;
import aula09.Rectangulo;
import aula09.Circulo;
import java.util.Iterator;

public abstract class TestGeneric {
    public static void main(String[] args) {
        VectorGeneric<Pessoa> vp = new VectorGeneric<Pessoa>();
        for (int i=0; i<10; i++)
            vp.addElem(new Pessoa("Bebé no Vector "+i,
                    1000+i, Data.today()));
        Iterator<Pessoa> vec = vp.iterador();
        printSet(vp.iterador());
        ListaGeneric<Pessoa> lp = new ListaGeneric<Pessoa>();
        while ( vec.hasNext() )
            lp.addElem( vec.next() );
        Iterator<Pessoa> lista = lp.iterador();
        while ( lista.hasNext() )
            System.out.println( lista.next() );
        ListaGeneric<Figura> figList = new ListaGeneric<Figura>();
        figList.addElem(new Circulo(1,3, 1));
        figList.addElem(new Quadrado(3,4, 2));
        figList.addElem(new Rectangulo(1,2, 2,5));
        printSet(figList.iterador());
        System.out.println("Soma da Area de Lista de Figuras: " +
                sumArea(figList));
// Partindo do principio que Quadrado extends Rectangulo:
        ListaGeneric< Rectangulo > quadList =
                new ListaGeneric<Rectangulo>();
        quadList.addElem(new Quadrado(3,4, 2));
        quadList.addElem(new Rectangulo(1,2, 2,5));
        System.out.printf("Soma da Area de Lista de Quadrados: ", sumArea(quadList)+"/n"); //funciona ????
    }
    private static double sumArea(ListaGeneric<? extends Figura> list){
        double soma=0;
        Iterator<? extends Figura> iterador=list.iterador();
        while(iterador.hasNext()){
            soma+=iterador.next().area();
        }
        return soma;
    }


    private static void printSet(Iterator i) {
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
