import java.util.Scanner;

import aula01.circulo;
import aula01.ponto;
import aula01.quadrado;
import aula01.retangulo;


public class ex13 {

	  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
	  String nmr;
	  do {
		  System.out.print("1-> Circle \n");
		  System.out.print("2-> Rectangle \n");
		  System.out.print("3-> Square \n");
		  System.out.print("Option-> ");
		  nmr=sc.nextLine();
		  switch(nmr) {
		  case "1":
			  String nmr2;
			  System.out.print("1-> Check if circles intersect \n");
			  System.out.print("2-> Check if circles are equal \n");
			  System.out.print("3-> Calculate area and perimeter \n");
			  System.out.print("Option-> ");
			  nmr2=sc.nextLine();
			  switch(nmr2) {
			  	case "1":
			  		if(intersection()){
			  			System.out.print("Circles intersect \n");
			  		}else{
			  			System.out.print("Circles don't intersect \n");
			  		}
			  		break;
			  	case "2":
			  		if(rEqual()){
			  			System.out.print("Circles are equal");
			  		}else{
			  			System.out.print("Circles are not equal");
			  		}
			  		break;
			  	case "3":
			  		circulo();
			  }
			  break;
		  case "2":
			  retangulo();
			  break;
		  case "3":
			  quadrado();
			  break;

		  }
	  }while(!nmr.equals("q"));
   }


  public static void circulo() {
	  double raio;
	  String point;
	  System.out.print("Insert radius: ");
	  raio=Double.parseDouble(sc.nextLine());
	  System.out.print("Insert coordinates(x,y): ");
	  point=sc.nextLine();
	  String[] pontos=point.split(",");

	  ponto c=new ponto(Double.parseDouble(pontos[0]), Double.parseDouble(pontos[1]));
	  circulo c1=new circulo(c, raio);

	  System.out.printf("Circle area: %s \n", c1.area());
	  System.out.printf("Circle perimeter: %s \n", c1.perimetro());

   }

  public static void retangulo() {
	  double altura, largura;
	  String point;
	  System.out.print("Insert rectangle height: ");
	  altura=Double.parseDouble(sc.nextLine());
	  System.out.print("Insert rectangle width: ");
	  largura=Double.parseDouble(sc.nextLine());
	  System.out.print("Insert coordinates(x,y): ");
	  point=sc.nextLine();
	  String[] pontos=point.split(",");

	  ponto c=new ponto(Double.parseDouble(pontos[0]), Double.parseDouble(pontos[1]));
	  retangulo r1=new retangulo(c, altura, largura);

	  System.out.printf("Rectangle area: %s \n", r1.area());
	  System.out.printf("Rectangle perimeter: %s \n", r1.perimetro());

  		}
  public static void quadrado(){
	  double lado;
	  String point;
	  System.out.print("Insert square side length: ");
	  lado=Double.parseDouble(sc.nextLine());
	  System.out.print("Insert coordinates(x,y): ");
	  point=sc.nextLine();
	  String[] pontos=point.split(",");

	  ponto c=new ponto(Double.parseDouble(pontos[0]), Double.parseDouble(pontos[1]));
	  quadrado q1=new quadrado(lado, c);

	  System.out.printf("Square area: %s \n", q1.area());
	  System.out.printf("Square perimeter: %s \n", q1.perimetro());

	  	}

  public static boolean intersection() {
	  boolean inter=true;
	  double raio;
	  double raio2;
	  String point;
	  String point2;
	  System.out.print("Insert radius of circle one: ");
	  raio=Double.parseDouble(sc.nextLine());
	  System.out.print("Insert coordinates(x1,y1): ");
	  point=sc.nextLine();
	  String[] pontos=point.split(",");

	  ponto centro1=new ponto(Double.parseDouble(pontos[0]), Double.parseDouble(pontos[1]));

	  System.out.print("Insert radius of circle two: ");
	  raio2=Double.parseDouble(sc.nextLine());
	  System.out.print("Insert coordinates(x2,y2): ");
	  point2=sc.nextLine();
	  String[] pontos2=point2.split(",");

	  ponto centro2=new ponto(Double.parseDouble(pontos2[0]), Double.parseDouble(pontos2[1]));

	  double dist=centro2.distancia2pontos(centro1);
	  if(dist == raio+raio2) { inter=true; }
	  if(dist > raio+raio2) { inter=false; }
	  if(dist < raio+raio2) { inter=true; }

	  return inter;

  	}
  public static boolean rEqual() {
	  boolean inter=true;
	  double raio;
	  double raio2;

	  System.out.print("Insert radius of circle one: ");
	  raio=Double.parseDouble(sc.nextLine());

	  System.out.print("Insert radius of circle two: ");
	  raio2=Double.parseDouble(sc.nextLine());

	  if(raio==raio2) { inter=true; }else{ inter=false; }

	  return inter;

  }
}
