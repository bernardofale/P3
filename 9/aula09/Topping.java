package aula09;

public class Topping extends GeladoDecorator{
    private String sabor;
    public Topping(Gelado newGelado, String sabor) {
        super(newGelado);
        this.sabor=sabor;
    }
    @Override
    public void base(int x){
        gelado.base(x);
        System.out.print(" com "+sabor);
    }

}