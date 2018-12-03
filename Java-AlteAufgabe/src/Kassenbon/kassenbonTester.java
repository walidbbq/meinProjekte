import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

class kassenbon1 {
	
	double wurst=4.20;
	double käse=2.30;
	double brot=2.10;
	double dvd=12;
	
	void berechnen (){
	
	}
	
}



public class kassenbonTester {

	public static void main(String[] args) {

		char ware;
		kassenbon1 k1= new kassenbon1();
		
		System.out.println("Geben Sie die Ware ein: ");
		Scanner eingabe = new Scanner (System.in);
		String strEingabe=eingabe.nextLine();
		
		ware=strEingabe.charAt(0);
		
		//char [] moeglich = {'w','k','b','d'} ;
		
			
	
		for (char ch : "wbkd".toCharArray())
			
			System.out.println("Geben Sie die Stückanzahl der ware ein: ");
		int stueckA=eingabe.nextInt(); 
		
		
		switch (ware) {
		
			
			case 'w' :
			case 'W' :
				strEingabe="Wurst";
				double wurst=k1.wurst;
				if (stueckA > 0)
					wurst=wurst*stueckA;
				k1.wurst=wurst; 
				
			case 'k' :
			case 'K':
				strEingabe="Käse";
				double kaese=k1.käse;
				if (stueckA > 0)
					kaese=kaese*stueckA;
				k1.käse=kaese;
				
			case 'b':
			case 'B':
				strEingabe="Brot";
				double brot=k1.brot;
				if (stueckA > 0)
					brot=brot*stueckA;
				k1.brot=brot;
				
			case 'd':
			case 'D':
			    strEingabe="DVD";
			    double dvd=k1.dvd;
			    if (stueckA>0)
			    	dvd=dvd*stueckA;
			    k1.dvd=dvd;
			    
			    
			    
				System.out.println("Geben Sie die Ware ein: ");
			    strEingabe=eingabe.nextLine();
			   // ware=strEingabe.charAt(0);


		}
		System.out.println("keine!");
		
		}
		
		
		
	}

