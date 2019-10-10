import aula03.*;

public class ex33 {
    public static void main(String[] args) {

        Condutor c=new Condutor("Bernardo",18,new String[] {"A", "B", "C", "D"});
        Condutor c1=new Condutor("Diogo", 27, new String[] {"D", "A"});
        System.out.println(c);
        System.out.println(c1);

        PesadoM mercadorias = new PesadoM(1000, 1000, 2000,"C", 5300);
        System.out.println(mercadorias);
        PesadoP pessoas=new PesadoP(1000,1000,2000,"D",5300);

        Motociclo mota=new Motociclo(75, 120, 200, "A", 2);
        System.out.println(mota);

        if(c.valid(mercadorias))
		{
			System.out.println(c.nome() + " pode conduzir o seguinte veículo: ");
			System.out.println(mercadorias.toString());
        }
        if(c1.valid(pessoas))
		{
			System.out.println(c1.nome() + " pode conduzir o seguinte veículo: ");
			System.out.println(mercadorias.toString());
		}

    }
} 