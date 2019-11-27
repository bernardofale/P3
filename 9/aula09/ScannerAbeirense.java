package aula09;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class ScannerAbeirense implements Iterator<String>, Closeable {
	private Scanner sci;
	
	public ScannerAbeirense(InputStream in) {
		sci=new Scanner(in);
	}
	
	public ScannerAbeirense(File f) throws FileNotFoundException {
		sci = new Scanner(f);
	}
	
	@Override
	public boolean hasNext() {
		return sci.hasNext();
	}
	
	@Override
	public String next() {
		String str = sci.next();
		str=str.replace('v','b');
		str=str.replace('V', 'B');
		
		return str;
	}
	
	public String nextLine() {
		String str = sci.next();
		str=str.replace('v','b');
		str=str.replace('V', 'B');
		return str;
	}
	
	@Override
	public void close() throws IOException {
		sci.close();
	}
	
	
	
	
}
