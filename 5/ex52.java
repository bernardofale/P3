package aula05;

public class ex52 {

	public static void main(String args[])
	{
		Bicicleta b1 = new Bicicleta(2010, "Black", 2);
		System.out.println(b1);
		
		Carro c1 = new Carro(1992, "White", 4, 220, "21-DB-12", 210, 45, 210, 7);
		System.out.println(c1);
		
		Policia policeCar = new Policia(2012, "White", 4, 240, "21-DB-12", 250, 90, 250, 9, Policia.TYPE.GNR);
		System.out.println(policeCar);
		
		System.out.println(b1.compareTo(policeCar));
		
		//Travel 600km with the police car
		policeCar.travel(600);
		
		System.out.println("Police Car traveled 600km ");
		System.out.println("Current fuel -> " + (int) policeCar.getFuel() + "L");
		System.out.println("Fuel used -> " + (int) Math.floor(policeCar.getConsumption() * 6) + "L\n");
	
		Veiculo[] veh = new Veiculo[3];
		veh[0] = b1;
		veh[1] = c1;
		veh[2] = policeCar;
		
		

		System.out.println("Lista de veículos organizados por ano\n");
		for(Veiculo v : veh)
		{
			System.out.println(v.toString());
		}
	}
}
