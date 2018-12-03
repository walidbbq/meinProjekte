package U14;

import java.util.Scanner;

public class CentZuDollar {

	public static void main(String[] args) {

		double cent;
		double dollar;

		System.out.println(" Geben Sie die Cent ein: ");
		Scanner scan = new Scanner(System.in);
//		cent=scan.nextInt();
//		dollar = cent /100;
//		
//		System.out.println("Das ergibt " +dollar + " Dollar" + " und " + cent%100 + " Cents " );
//		
		cent = scan.nextDouble();
		dollar = cent * 0.01;
		System.out.println("Das ergeibt " + dollar + " dollar");

	}

}
