import java.util.*;


public class ex12 {
	
	  static Scanner sc = new Scanner(System.in);
	  static int k=0;

  public static void main(String[] args) {
	  
	  Pessoa[] ppl = new Pessoa[1000]; 
	  
	  String choice;


	  	do {
	  	 System.out.printf("1: Add people \n");
	  	 System.out.printf("2: Delete people \n");
	  	 System.out.printf("3: Show people's list \n");
	  	 System.out.printf("4: Sort people by CC \n");
	     System.out.print("Option: ");
	  	 choice = sc.nextLine();

		 switch(choice) {
			 case "1":
				 ppl[k]=addPpl();
				 k++;
				 break;
			 
			 case "2":
				 delPpl(ppl);
				 ppl=delPpl(ppl);
				 break;
			 case "3": 
				 showPpl(ppl);
				 break;
			 case "4":
				 sortArr(ppl);
		 }
	  }while(!choice.equals("q"));
  }
  
  public static Pessoa addPpl() {
	  	  
	  System.out.print("Name: ");
	  String nome = sc.nextLine();
	  
	  System.out.print("CC: ");
	  int cc = Integer.parseInt(sc.nextLine());
	  
	  System.out.print("Date of Birth(dd-mm-yyyy): ");
	  String date = sc.nextLine();
	  String[] da = date.split("-");
	  
	  Data d = new Data(Integer.parseInt(da[0]), Integer.parseInt(da[1]), Integer.parseInt(da[2]));
	  Pessoa p = new Pessoa(nome, cc, d);
	  
	  System.out.print("Person added \n");
	  return p;
  }
  
  public static Pessoa[] delPpl(Pessoa[] ppl) {
	  System.out.print("CC number to delete: ");
	  int CC = Integer.parseInt(sc.nextLine());
	  	  
	  for(int i=0; i<ppl.length; i++) {
		  if(ppl[i].cc() == CC) {
			  ppl[i]=null;
			  
		  }
		  
	  }
	  for(int j=0; j<ppl.length; j++) {
		  if(ppl[j] == null) {
			  ppl[j] = ppl[j+1];
			  
		  }
	  }
	  Pessoa[] ppl1 = Arrays.copyOf(ppl, ppl.length-1);
	  
	  System.out.print("Person deleted \n");
	  k--;
	  return ppl1;
  }
  
  public static void showPpl(Pessoa[] ppl){
	  for(int i=0; i<ppl.length; i++) {
			System.out.println(ppl[i].toString());
			
		}
    }
  
  public static void sortArr(Pessoa[] ppl){
	    for (int j=1; j<ppl.length; j++) {
	        int cc = ppl[j].cc();
	        int i = j-1;
	        while ((i>-1) && (ppl[i].cc()>cc) ) {
	            ppl[i+1] = ppl[i];
	            i--;
	        }
	        ppl[i+1]=ppl[j];
 	    }
	  }
  	}
 

  	
  
	  
 



