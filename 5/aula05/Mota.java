package aula05;

public class Mota extends Motorizado{

	public Mota(int year, String color, int wheels, int displacement, String licensePlate, int maxSpeed, double fuel, int power, int consumption) 
	{
		super(year, color, wheels, displacement, licensePlate, maxSpeed, fuel, power, consumption);
	}

	@Override
	public String toString() {
		return "Mota : " + super.toString();
	}
	
}
