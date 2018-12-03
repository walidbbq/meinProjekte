import java.util.Scanner;

public class gesamtelaenge30 {

	public static void main(String[] args) {
		
		int gesamt;
		Scanner scan=new Scanner (System.in);
		System.out.println("Geben Sie das erste Wort ein: ");
		String ersteWort=scan.nextLine();
		int laenge1=ersteWort.length();
		
		System.out.println("Geben Sie das zweite Wort ein: ");
		String zweiteWort=scan.nextLine();
		int laenge2=zweiteWort.length();
		
		gesamt =laenge1+laenge2;
		
		System.out.print(ersteWort);

		while (gesamt<30) {
			
			System.out.print(".");
			gesamt ++ ;
		}
		
		System.out.print(zweiteWort);

	}

}
