package aula10;

import java.util.Iterator;

public class VectorGeneric<T> {
     private T[] arr;
        private int index; //index de posições do array de pessoas
        private final int ALLOC=50;
        private int dimClass=ALLOC;

        public VectorGeneric(){
            arr=(T[])new Object[ALLOC];
            index=0;
        }
        public boolean addElem(T elem){
            if(elem==null){
                return false;
            }
            if(index>=dimClass){
                dimClass+=ALLOC;
                T[] newArray=(T[])new Object[dimClass];
                System.arraycopy(arr, 0, newArray, 0, index);
                arr=newArray;
            }
            arr[index]=elem;
            index++;
            return true;
        }
        public boolean removeElem(T elem){
            if(elem==null){
                return false;
            }
            for (int i = 0; i < index; i++) {
                if (arr[i] == elem) {
                    index--;
                    for (int j = i; j < index; j++) {
                        arr[j] = arr[j + 1];
                        return true;
                    }
                }
            }
            return false;
        }
        public int totalElem(){
            return index;
        }
        public VIterator<T> iterador(){
            return (this).new VIterator<T>();
        }
        public BFIterator<T> BFIterador(){
            return (this).new VBFIterator<T>();
        }

        private class VIterator<T> implements Iterator<T> {
            private int i;
            VIterator(){
                i=0;
            }
            public boolean hasNext(){
                return i<index;
            }
            public T next(){
                if(hasNext()){
                    T r= (T) arr[i];
                    i++;
                    return r;
                }
                throw new IndexOutOfBoundsException("only "+index+" elements");
            }
            public void remove(){
                throw new UnsupportedOperationException("Operação não suportada!");
            }
        }
        private class VBFIterator<T> implements BFIterator<T>{
            private int i;
            VBFIterator(){
                i=0;
            }
            @Override
            public boolean hasPrevious() {
                return i>0;
            }

            @Override
            public T previous() {
                if(hasPrevious()){
                    T r= (T) arr[i-1];
                    return r;
                }
                return null;
            }

            @Override
            public boolean hasNext() {
                return i<index;
            }

            @Override
            public T next() {
                if(hasNext()){
                    T r= (T) arr[i];
                    i++;
                    return r;
                }
                throw new IndexOutOfBoundsException("only "+index+" elements");

            }

        }
    }
