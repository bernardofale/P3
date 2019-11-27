package aula09;
import java.util.Iterator;

public class VectorPessoas{
    private Pessoa[] pessoas;
    private int nPessoas; //index de posições do array de pessoas
    private final int ALLOC=50;
    private int dimClass=ALLOC;

    public VectorPessoas(){
        pessoas=new Pessoa[ALLOC];
        nPessoas=0;
    }
    public boolean addPessoa(Pessoa p){
        if(p==null){
            return false;
        }
        if(nPessoas>=dimClass){
            dimClass+=ALLOC;
            Pessoa[] newArray=new Pessoa[dimClass];
            System.arraycopy(pessoas, 0, newArray, 0, nPessoas);
            pessoas=newArray;
        }
        pessoas[nPessoas]=p;
        nPessoas++;
        return true;
    }
    public boolean removePessoa(Pessoa p){
        if(p==null){
            return false;
        }
        for (int i = 0; i < nPessoas; i++) {
            if (pessoas[i] == p) {
                nPessoas--;
                for (int j = i; j < nPessoas; j++) {
                    pessoas[j] = pessoas[j + 1];
                    return true;
                }
            }
        }
        return false;
    }
    public int totalPessoas(){
        return nPessoas;
    }
    public Iterator iterador(){
        return (this).new VIterator();
    }
    public BFIterator BFIterador(){
        return (this).new VBFIterator();
    }

    private class VIterator implements Iterator{
        private int i;
        VIterator(){
            i=0;
        }
        public boolean hasNext(){
            return i<nPessoas;
        }
        public Object next(){
            if(hasNext()){
                Object r=pessoas[i];
                i++;
                return r;
            }
            throw new IndexOutOfBoundsException("only "+nPessoas+" elements");
        }
        public void remove(){
            throw new UnsupportedOperationException("Operação não suportada!");
        }
    }
    private class VBFIterator implements BFIterator{
        private int i;
        VBFIterator(){
            i=0;
        }
        @Override
        public boolean hasPrevious() {
            return i>0;
        }

        @Override
        public Object previous() {
            if(hasPrevious()){
                Object r=pessoas[i-1];
                return r;
            }
            return null;
        }

        @Override
        public boolean hasNext() {
            return i<nPessoas;
        }

        @Override
        public Object next() {
            if(hasNext()){
                Object r=pessoas[i];
                i++;
                return r;
            }
            throw new IndexOutOfBoundsException("only "+nPessoas+" elements");

        }

    }
}