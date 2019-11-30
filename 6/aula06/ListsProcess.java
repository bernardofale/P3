package aula06;
import java.util.*;
import java.util.function.Predicate;


public interface ListsProcess{
    public static <T> List<T> filter(List<T> lista, Predicate<T> p){
		List<T> filtro = new ArrayList<T>();
		for(T t : lista){ 
			if(p.test(t)){
				filtro.add(t);
			}
		}
		return filtro;
	}
}