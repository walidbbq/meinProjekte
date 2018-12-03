package ueberwachungsgesteuerteSchleife;

import java.util.Scanner;
public class MilenProGallone {

	public static void main(String[] args) {

		
		System.out.println("Programm Meile pro Gallone: "+"\n"+ "Anfangsstand Meilen: ");
		Scanner scan = new Scanner(System.in);
		int anfagsstandM=scan.nextInt();
		
		
		
		while (anfagsstandM>=0) {
			
			
			System.out.println("Endstand Meile: ");
			int endstandM=scan.nextInt();
			
			System.out.println("Gallonen: ");
			int gallonen=scan.nextInt();
			
			int unterschied=(endstandM-anfagsstandM )/gallonen;
		    System.out.println("Meilen pro Gallone: " + unterschied);
		    
		    System.out.println("Meilen pro Gallone: " + unterschied);
		    System.out.println("Anfangsstand Meilen:");
		    anfagsstandM=scan.nextInt();
		    
		
			}
	
				System.out.println("bye");
	}

}
