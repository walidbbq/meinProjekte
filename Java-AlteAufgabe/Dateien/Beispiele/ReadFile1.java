package Beispiele;

import java.io.*;

public class ReadFile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader ("test.txt");
		BufferedReader br= new BufferedReader (fr);
		
		String zeile1 = br.readLine();
		System.out.println(zeile1);
		String zeile2 = br.readLine();
		System.out.println(zeile2);
		String zeile3= br.readLine();
		System.out.println(zeile3);
		
		String zeile4 = br.readLine();
		System.out.println(zeile4);
		
		br.close();

	}

}
