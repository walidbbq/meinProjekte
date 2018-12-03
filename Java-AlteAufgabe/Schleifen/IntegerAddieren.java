import java.util.Scanner;

public class IntegerAddieren {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Wie viele Integer sollen adderiet werden: ");
		int AnzahlN=scan.nextInt();
		
		int i=0;
		int summe=0;

		while (i< AnzahlN) {
			System.out.println("Geben Sie einen Integer ein: ");
			int IntEingeabe=scan.nextInt();
		    summe=summe+IntEingeabe;
		    i++;
			
		}
		
		
		System.out.println("Die Summe ist: " +summe);
		
	}

}
