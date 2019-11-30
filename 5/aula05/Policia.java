package aula05;

public class Policia extends Motorizado {
	
	public enum TYPE { INEM, FIREMAN, GNR, PSP, PJ};
	
	public static int idbase = 0;
	private int identificacao;
	private TYPE type;
	
	public Policia(int year, String color, int wheels, int displacement, String licensePlate, int maxSpeed, double fuel, int power, int consumption, TYPE type) 
	{
		super(year, color, wheels, displacement, licensePlate, maxSpeed, fuel, power, consumption);
		this.type = type;
		this.identificacao = ++Policia.idbase;
	}

	public int getId() 
	{
		return identificacao;
	}

	public TYPE getType() 
	{
		return type;
	}

	@Override
	public String toString() {
		return "Policia: " + "[id=" + identificacao + ", type=" + type + "]" + super.toString();
	}
}
