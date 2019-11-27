import java.util.Iterator;

import aula09.BFIterator;
import aula09.Data;
import aula09.ListaPessoas;
import aula09.Pessoa;
import aula09.VectorPessoas;

public abstract class TesteIterador {
    public static void main(String[] args) {
        VectorPessoas vp = new VectorPessoas();
        for (int i=0; i<10; i++)
            vp.addPessoa(new Pessoa("Bebé no Vector "+i, 1000+i, Data.today()));
        
        
        Iterator vec = vp.iterador();
        BFIterator vect = vp.BFIterador();
        while(vect.hasPrevious())
            System.out.println(vect.previous());
        while ( vec.hasNext() )
            System.out.println( vec.next() );
        
        ListaPessoas lp = new ListaPessoas();
        for (int i=0; i<10; i++)
            lp.addPessoa(new Pessoa("Bebé na Lista "+i, 2000+i, Data.today()));
        
        
        Iterator lista = lp.iterador();
        BFIterator list=lp.BFiterador();
        while(list.hasPrevious())
            System.out.println(list.previous());
        while ( lista.hasNext() )
            System.out.println( lista.next() );
        }
    }