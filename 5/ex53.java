import java.util.*;
import aula05.Nokia;
import aula05.Data;
import aula05.Pessoa;

public class ex53 {
	static Scanner sc=new Scanner(System.in);
  public static void main(String[] args) {
	  String choice;
	do{
		System.out.print("1-> Nokia \n");
		System.out.print("Option-> ");
		choice=sc.nextLine();
	switch (choice) {
		case "1":
			System.out.print("Nome do ficheiro: ");
			String x=sc.nextLine();
			addNokia(x);
			break;
	
		default:
			break;
	}
  }while(!choice.equals("q"));
}
  
  public static void addNokia(String txt){
	Nokia n=new Nokia(txt);
	try {
		n.loadFile();

	} catch (Exception FileNotFound) {
	}

  }
}
