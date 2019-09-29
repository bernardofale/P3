
public class Data{
	
	private int dia, mes, ano;

public Data(int dia, int mes, int ano) {
	
	assert dia>0 && dia<diasDoMes(mes, ano) : "invalid day";
	assert mes>0 && mes<=12 : "invalid month";
	assert ano>0 : "invalid year";
	
	dia=this.dia;
	mes=this.mes;
	ano=this.ano;
	
}

public int dia() { return dia; }
public int mes() { return mes; }
public int ano() { return ano; }

public static boolean bissexto(int ano) {
  return ano%4 == 0 && ano%100 != 0 || ano%400 == 0;
}

private static final int[] diasMesComum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

public static int diasDoMes(int mes, int ano) {
  int result = diasMesComum[mes-1];
  if (mes == 2 && bissexto(ano))
    result++;
  return result;
}

public String toString(){
	return String.format("%02d-%02d-%04d", dia, mes, ano);
}
}












