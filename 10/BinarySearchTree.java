package aula10;

import java.util.Iterator;
import java.util.Stack;

public class BinarySearchTree<T extends Comparable<? super T>>
        implements Iterable<T> {




    // o elemento do tipo T deve ser comparável para efectuar pesquisas
// mas como pode herdar a implementação de compareTo() é mais correcto
// usar <? super T>
    private static class BSTNode<T> {
        T element;
        BSTNode<T> left;    //elemento menor ou igual ao root (left child)
        BSTNode<T> right; //elemento maior que o root (right child)
        BSTNode(T theElement) {
            this(theElement, null, null);
        }
        BSTNode(T theElement, BSTNode<T> left, BSTNode<T> right){
            theElement=element;
            this.left=left;
            this.right=right;
        }
    }
    private BSTNode<T> root; //root node da bst
    private int numNodes;
    public BinarySearchTree() {
        root = null;
        numNodes = 0;
    }
    public void insert(T value) {
        root = insert(value, root);
    }

    private BSTNode<T> insert(T value, BSTNode<T> root) {
        BSTNode<T> newNode = new BSTNode(value);

        if(root==null){
            root=newNode;
        }else{
            BSTNode<T> focusNode=root;  //comeca pelo root
            BSTNode<T> parent; //super node
            numNodes++;

            while(true){
                parent=focusNode;

                if(value.compareTo(focusNode.element)<=0){
                    focusNode=focusNode.left;

                    if(focusNode==null){
                        parent.left=newNode;
                        return parent;
                    }
                }else{
                    focusNode=focusNode.right;


                    if(focusNode==null){
                        parent.right=newNode;
                        return parent;
                    }
                }
            }
        }

        return root;


    }

    public void remove(T value) {
        root = remove(value, root);
    }

    private BSTNode<T> remove(T value, BSTNode<T> root) {
        BSTNode<T> focusNode=root;
        BSTNode<T> parent=root;
        boolean isleft=true;

        while(focusNode.element!=value){
            parent=focusNode;

            if(value.compareTo(focusNode.element)<=0){
                isleft=true;

                focusNode=focusNode.left;
            }else{
                isleft=false;

                focusNode=focusNode.right;
            }

            if(focusNode==null){
                return root;
            }

            if(focusNode.left==null && focusNode.right==null){
                if(focusNode==root){
                    root=null;
                }else if(isleft){
                    parent.left=null;

                }else{
                    parent.right=null;
                }
            }else if(focusNode.right==null){
                if(focusNode==root){
                    root=focusNode.left;
                }else if(isleft){
                    parent.left=focusNode.left;
                }else{
                    parent.right=focusNode.right;
                }
            }else if(focusNode.left==null){
                if(focusNode==root){
                    root=focusNode.right;

                }else if(isleft){
                    parent.left=focusNode.right;
                }else{
                    parent.right=focusNode.left;
                }
            }

        }

        return focusNode;

    }

    public boolean contains(T value) {
        return valueOf(find(value, root)) != null;
    }

    private T valueOf(BSTNode<T> node) {
        return node.element;
    }

    private BSTNode<T> find(T value, BSTNode<T> root) {
        BSTNode<T> focusNode=root;

        while(focusNode.element!=value){
            if(value.compareTo(focusNode.element)<=0){
                focusNode=focusNode.left;
            }else{
                focusNode=focusNode.right;
            }

            if(focusNode==null){
                return null;
            }
        }

        return focusNode;

    }
    @Override
    public Iterator<T> iterator() {
        return (this).new BSTIterator<T>(root);
    }

    private class BSTIterator<T extends Comparable<? super T>> implements Iterator<T>{
        Stack<BSTNode<T>> stack;

        BSTIterator(BSTNode<T> root){
            stack=new Stack<BSTNode<T>>();
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
        }
        public boolean hasNext(){
            return !stack.isEmpty();
        }
        public T next(){
            BSTNode<T> newNode=stack.pop();
            T r=newNode.element;

            if(newNode.right!=null){
                newNode=newNode.right;
                while(newNode!=null){
                    stack.push(newNode);
                    newNode=newNode.left;
                }
            }
            return r;
        }
    }
    }
