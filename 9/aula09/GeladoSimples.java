package aula09;
public class GeladoSimples implements Gelado{
    private String sabor;
    public GeladoSimples(String sabor){
        this.sabor=sabor;
    }
    @Override
    public void base(int x){
        System.out.print("\n"+x+" bolas de gelado de "+sabor);
    }
}