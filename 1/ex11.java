import static java.lang.System.*;
import java.util.*;

public class ex11 {

  public static void main(String[] args) {
	Scanner sc = new Scanner(in);
	System.out.print("Palvra: ");
	String word = sc.nextLine();
	String[] words = word.split(" ");	
    
    System.out.printf("Número de dígitos: %d \n",countNum(word));
    System.out.println("Palavras originais: "+Arrays.toString(words));
    System.out.printf("Palavra mínuscula: %b \n", (word.toLowerCase().equals(word)));
    System.out.printf("Palavra maiúscula: %b \n", (word.toUpperCase().equals(word)));
    System.out.printf("String trocado: %s \n", troca(word));



}

  public static int countNum(String s) {

    int contador = 0;

    for(int i=0 ; i < s.length() ; i++){
      if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
        contador++;
      }
    }

    return contador;
  }


  public static String troca(String s){
    String a = "";
    for(int i=0; i<s.length()-1; i++){
      if(i%2 == 0){
        a += s.charAt(i+1);
      }else{
        a+= s.charAt(i-1);
      }
    }
    return a;
  }
}
