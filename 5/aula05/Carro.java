package aula05;

public class Carro extends Motorizado{
	
	public Carro(int year, String color, int wheels, int displacement, String licensePlate, int maxSpeed, double fuel, int power, int consumption) 
	{
		super(year, color, wheels, displacement, licensePlate, maxSpeed, fuel, power, consumption);
	}

	@Override
	public String toString() 
	{
		return "Carro : " + super.toString();
	}
}
