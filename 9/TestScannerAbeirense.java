package aula09;

import java.io.File;
import java.io.FileNotFoundException;
public class TestScannerAbeirense {

		public static void main(String[] args) throws FileNotFoundException {
			
			ScannerAbeirense sc = new ScannerAbeirense(System.in);
			
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}			
			
			
			
			
		
		}
}

