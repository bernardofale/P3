package aula11;

import aula09.Circulo;
import aula09.Figura;
import aula09.Rectangulo;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ex112 {

    public static void main(String[] args){
        String c = "Rectangulo";
        List<Figura> figuras=new LinkedList<>();
        Rectangulo r=new Rectangulo(10,5);
        Rectangulo x=new Rectangulo(10,10);
        Circulo y=new Circulo(30);

        figuras.add(x);
        figuras.add(r);
        figuras.add(y);


        System.out.print("A maior figura por área é " +maiorFiguraJ7(figuras));
        System.out.print("A maior figura por perímetro é "+maiorFiguraJ7b(figuras));
        System.out.printf("A soma da área das figuras é %.2f \n",areaTotalJ8(figuras));
        System.out.printf("A soma da área da figura-> %s <- é %.2f \n",c,areaTotalJ8b(figuras, c));
    }
    /* private static Figura maiorFiguraJ7(List<Figura> figs) {
        Figura maior = figs.get(0);
        for (Figura f : figs) {
            if (f.compareTo(maior) >= 1)
                maior = f;
        }
        return maior;
    }
    */
    private static Figura maiorFiguraJ7(List<Figura> figs){  //alinea a)
        Comparator<Figura> comp = (Figura f1, Figura f2)->f1.compareTo(f2);
        Figura max=figs.stream()
                    .max(comp)
                        .get();

        return max;
    }

   private static Figura maiorFiguraJ7b(List<Figura> figs){  //alinea b)
       Comparator<Figura> comp = (Figura f1, Figura f2)->{
           if(f1.perimetro()-f2.perimetro()<0) return -1;
           if(f1.perimetro()-f2.perimetro()>0) return 1;

           return 0;
       };
       Figura max=figs.stream()
                         .max(comp)
                            .get();

       return max;
   }
    private static double areaTotalJ8(List<Figura> figs) { //alinea c)
        double area=figs.stream()
                            .collect(Collectors.summingDouble(f->f.area()));
        return area;
    }
    private static double areaTotalJ8b(List<Figura> figs,String subtipoNome){  //alinea d)
        double area=figs.stream()
                            .filter(f->subtipoNome.equals(f.getClass().getSimpleName()))
                                .collect(Collectors.summingDouble(f->f.area()));

        return area;
    }


}
