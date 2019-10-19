package aula04;

public class Professor extends Pessoa{
    private Data dataInsc=new Data(10,10,2010);
    private Data dataA;
    private int nfunc;

    public Professor(String nome, int cc, Data dataN, int nfunc, Data dataA){
        super(nome,cc,dataN);
        this.nfunc=nfunc;
        this.dataA=dataA;
    }
    public Professor(String nome, int cc, Data dataN) {
        super(nome, cc, dataN);
        dataA=dataInsc.today();
    }
    public int nfunc(){
        return nfunc;
    }
    public Data dataA(){
        return dataA;
    }

    @Override 
    public String toString(){
        return super.toString()+", Admitido em: "+dataA.toString();
    }
}