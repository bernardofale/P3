package aula07;
public class Voos{
    private final Hora partida;
    private final String companhia;
    private String origem;
    private String voo;
    private Hora atraso=new Hora();
    private String obs;
    
    public Voos(Hora partida, String voo, String companhia, String origem, Hora atraso){
        this.partida=partida;
        this.voo=voo;
        this.companhia=companhia;
        this.origem=origem;
        this.atraso=atraso;
        obs="Previsto: "+Hora.previsto(partida, atraso);
    }
    public Hora atraso(){
        return atraso;
    } 
    public String voo(){
        return voo;
    }
    public Hora partida(){
        return partida;
    }
    public String companhia(){
        return companhia;
    }
    public String origem(){
        return origem;
    }
    @Override
    public String toString(){
        if(atraso.minutos()==0) return partida + "\t" + voo + "\t" + companhia + "\t" + origem +"\n";
        else return partida + "\t" + voo + "\t" + companhia + "\t" + origem + "\t" + atraso + "\t" + obs+"\n";
    }
}