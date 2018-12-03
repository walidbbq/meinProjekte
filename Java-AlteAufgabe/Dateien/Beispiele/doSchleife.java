package Beispiele;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class doSchleife {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br= new BufferedReader ( new FileReader ("test.txt"));
		
		String zeile = "";
		zeile = br.readLine();
		
		while (zeile!=null) {
			
			System.out.println(zeile);	
			zeile = br.readLine();
		}
		
		br.close();
		

	}

}
