package aula05;

public class Bicicleta extends Veiculo {
	
	public Bicicleta(int year, String color, int wheels) 
		{
			super(year, color, wheels);
		}

		@Override
		public String toString() {
			return "Bicicleta: " + super.toString();
		}
}
