package aula09;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListaPessoas {
    private List<Pessoa> pessoas;

    public ListaPessoas() {
        pessoas =new LinkedList<Pessoa>();
    }
    public boolean addPessoa(Pessoa p){
        if(p==null){
            return false;
        }
        pessoas.add(p);
        return true;

    }

    public void removePessoa(Pessoa p){
        for (Pessoa pess : pessoas) {
            if(pess==p){
                pessoas.remove(pess);
            }
        }
    }

    public int totalPessoas(){
        return pessoas.size();
    }
    public Iterator iterador() {
		return (this).new LIterator();
    }
    
    public BFIterator BFiterador(){
        return (this).new LBFIterator();
    }

    private class LIterator implements Iterator{
        private int i;
        LIterator(){
            i=0;
        }

        @Override
        public boolean hasNext() {
            return i<pessoas.size();
        }

        @Override
        public Object next() {
            if(hasNext()){
                Object r=pessoas.get(i);
                i++;
                return r;
            }
            throw new IndexOutOfBoundsException("only "+pessoas.size()+" elements");

        }
        @Override
        public void remove(){
            throw new UnsupportedOperationException("Operação não suportada!");
        }
        
    }
    private class LBFIterator implements BFIterator{
        private int i;
        LBFIterator(){
            i=0;
        }
        @Override
        public boolean hasPrevious() {
            return i>0;
        }

        @Override
        public Object previous() {
            if(hasPrevious()){
                Object r=pessoas.get(i-1);
                return r;
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            return i<pessoas.size();
        }

        @Override
        public Object next() {
            if(hasNext()){
                Object r=pessoas.get(i);
                i++;
                return r;
            }
            throw new IndexOutOfBoundsException("only "+pessoas.size()+" elements");

        }

    }

	
}