package aula02;
import java.util.*;
import java.io.*;

public class letterSoup {
	static private char[][] soup;
	private File file;
	static private LinkedList<String> words;
	static private LinkedList<String> letters;
	int s;
	
	
	public letterSoup(String nome) throws Exception{
		Scanner sc;
		this.words=new LinkedList<String>();
		this.letters=new LinkedList<String>();
		this.soup=new char[80][80];
		sc=new Scanner(new File(nome));

		String k=sc.nextLine();
		s=k.length();
		int coluna=0;
		for(int y=0; y<s; y++) {
			soup[coluna][y]=k.charAt(y);
		}
		coluna++;
		
		while(sc.hasNextLine()){
			String linha=sc.nextLine();
			if(linha.contains(",")) {
				String[] chave=linha.split(", ");
				for(int i=0; i<chave.length; i++){
					letters.add(chave[i]);
				}
			}else {
				for(int j=0; j<s; j++) {
					soup[coluna][j]=linha.charAt(j);
				}
				coluna++;
				}
			}
	
		}

//	public static void play(int s) {
//		String pal="";
//		for(int i=0; i<s; i++) {
//			for(int j=0; j<s; i++) {
//				if(soup[i][j]==letters.get(i).charAt(j)) {
//					pal+=soup[i][j];
//				}
//			}
//		}
//		System.out.print(pal);
//	}
}

