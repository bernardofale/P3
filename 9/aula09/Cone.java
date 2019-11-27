package aula09;
public class Cone extends GeladoDecorator{

    
    public Cone(Gelado newGelado) {
        super(newGelado);
    }
    @Override
    public void base(int x) {
        gelado.base(x);
        System.out.print(", em cone");
    }
}