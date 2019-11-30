package aula07;
public class Hora implements Comparable<Hora>{
    private int minutos;
    private static Hora midnight=new Hora(0); //ou 0 minutos de atraso

    public Hora() {
		this(0,0);
	}
    public Hora(int minutos){
        this.minutos=minutos;
    }
    public Hora(String hora){
        this(Integer.parseInt(hora.split(":")[0]), Integer.parseInt(hora.split(":")[1]));
    }
    public Hora(int hora, int minutos){
        this(hora*60+minutos);
    }
    public int minutos(){
        if(minutos>59){
            return minutos%60;
        }
        return minutos;

    }
    public int hora(){
        return minutos/60;
    }

    public static Hora previsto(Hora h, Hora h2){
        int nHora=h.hora()+h2.hora();
        int nMins=h.minutos()+h2.minutos();
        if(nHora>23) return new Hora(nHora-24,nMins);
        return new Hora(nHora,nMins);

    }
    @Override
    public int compareTo(Hora h){
        return this.minutos()-h.minutos(); 
    }
    @Override
    public boolean equals(Object h){
        if(this== h){
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return hora()+":"+minutos();
    }

}