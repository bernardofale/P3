import aula07.Hora;
import aula07.Voos;
import aula07.Aeroporto;
import aula07.Companhia;
import java.io.IOException;

public class teste {

	public static void main(String[] args) throws IOException{
        Aeroporto a=new Aeroporto();
        a.lerCompanhias();
        a.lerVoos();
        a.print();
        a.writeF("infopublico.txt");
        a.media();
        a.writeC("cidades.txt");        

        
        
    }
}