package aula10;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListaGeneric<T> {
    private List<T> lista;

    public ListaGeneric() {
        lista =new LinkedList<T>();
    }
    public boolean addElem(T elem){
        if(elem==null){
            return false;
        }
        lista.add(elem);
        return true;

    }

    public void removeElem(T elem){
        for (T t : lista) {
            if(t==elem){
                lista.remove(elem);
            }
        }
    }

    public int totalElem(){
        return lista.size();
    }
    public LIterator<T> iterador() {
        return (this).new LIterator<T>();
    }

    public BFIterator<T> BFiterador(){
        return (this).new LBFIterator<T>();
    }

    private class LIterator<T> implements Iterator<T> {
        private int i;
        LIterator(){
            i=0;
        }

        @Override
        public boolean hasNext() {
            return i<lista.size();
        }

        @Override
        public T next() {
            if(hasNext()){
                T r= (T) lista.get(i);
                i++;
                return r;
            }
            throw new IndexOutOfBoundsException("only "+lista.size()+" elements");

        }
        @Override
        public void remove(){
            throw new UnsupportedOperationException("Operação não suportada!");
        }

    }
    private class LBFIterator<T> implements BFIterator<T>{
        private int i;
        LBFIterator(){
            i=0;
        }
        @Override
        public boolean hasPrevious() {
            return i>0;
        }

        @Override
        public T previous() {
            if(hasPrevious()){
                T r= (T) lista.get(i-1);
                return r;
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            return i<lista.size();
        }

        @Override
        public T next() {
            if(hasNext()){
                T r= (T) lista.get(i);
                i++;
                return r;
            }
            throw new IndexOutOfBoundsException("only "+lista.size()+" elements");

        }

    }

}
