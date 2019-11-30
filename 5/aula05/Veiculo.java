package aula05;

public class Veiculo {
	private int year;
	private String color;
	private int wheels;
	
	public Veiculo(int year, String color, int wheels) 
	{
		this.year = year;
		this.color = color;
		this.wheels = wheels;
	}

	public String getColor() 
	{
		return color;
	}
	
	public void setColor(String color) 
	{
		this.color = color;
	}
	
	public int getYear() 
	{
		return year;
	}

	public int getWheels() 
	{
		return wheels;
	}
	
	@Override
	public String toString() {
		return "[year=" + year + ", color=" + color + ", wheels=" + wheels + "]";
	}
	
	public int compareTo(Veiculo v)
	{
		if(this.getYear() > v.getYear())
		{
			return 1;
		}
		else if(this.getYear() < v.getYear())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
