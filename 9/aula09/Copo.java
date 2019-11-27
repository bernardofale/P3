package aula09;
public class Copo extends GeladoDecorator{

    
    public Copo(Gelado newGelado) {
        super(newGelado);
    }
    @Override
    public void base(int x) {
        gelado.base(x);
        System.out.print(", em copo");
    }
}