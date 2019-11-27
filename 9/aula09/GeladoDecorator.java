package aula09;

public abstract class GeladoDecorator implements Gelado{
    protected Gelado gelado;

    public GeladoDecorator(Gelado newGelado){
        gelado=newGelado;
    }
    @Override
    public void base(int x){
        gelado.base(x);
    }
}