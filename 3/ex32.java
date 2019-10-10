import aula03.*;

public class ex32 {
    public static void main(String[] args) { 
        
        circulo c1 = new circulo (2);
        circulo c2 = new circulo (1,3,2); 
        circulo c3 = new circulo (c1);
        
        System.out.println(c1 + " tem area: " + c1.area()+ " e perimetro: " + c1. perimetro());
        System.out.println(c3 + " tem area: " + c2.area()+ " e perimetro: " + c2. perimetro());
        System.out.println("c1 equals to c3? -> " + c1.equals(c3)); // True

        quadrado q1 = new quadrado(2); 
        quadrado q2 = new quadrado(3,4,2); 
        quadrado q3 = new quadrado(q2);
        
        System.out.println(q1 + " tem area: " + q1.area()+ " e perimetro: " + q1.perimetro());
        System.out.println(q3 + " tem area: " + q3.area()+ " e perimetro: " + q3.perimetro());
        System.out.println("q1 equals to q3? -> "+ q1.equals(q3)); // True

        retangulo r1 = new retangulo(2,3); 
        retangulo r2 = new retangulo(3,4,2,3); 
        retangulo r3 = new retangulo(r2);

        System.out.println(r1 + " tem area: " + r1.area()+ " e perimetro: " + r1. perimetro());
        System.out.println(r3 + " tem area: " + r3.area()+ " e perimetro: " + r3. perimetro()); 
        System.out.println("r2 equals to r3? -> " + r2.equals(r3)); // True

    }
}