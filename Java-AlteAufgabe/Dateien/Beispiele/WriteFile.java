package Beispiele;

import java.io.*;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter (new FileWriter ("ausgabe.txt"));
		
		bw.write(" test test test ");
//		bw.write("\r\n");
		String n = System.getProperty("line.separator");
		bw.write(n);
//		bw.newLine();
		bw.write("test test test");
		
		bw.close();

	}

}
