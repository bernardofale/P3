package aula04;
public class Estudante extends Pessoa{
    private Data dataInsc=new Data(10,10,2010);
    private static int nMecID=100;
    private int nmec;
    

    public Estudante(String nome, int cc, Data dataN, Data dataInsc) {
        super(nome, cc, dataN);
        nmec=nMecID++;
        this.dataInsc=dataInsc;
    }
    public Estudante(String nome, int cc, Data dataN) {
        super(nome, cc, dataN);
        nmec=nMecID++;
        dataInsc=dataInsc.today();
    }
    public int nmec(){
        return nmec;
    }
    public Data dataInsc(){
        return dataInsc;
    }
    @Override public String toString() {
        return super.toString()+", NMec: "+this.nmec()+", Inscrito em Data: " +dataInsc.toString();
    }
    

    
}