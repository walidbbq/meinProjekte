import java.util.Scanner;

public class StartEndWert {

	public static void main(String[] args) {

		int startwert, endwert;
		
		System.out.println("Geben Sie ein Startwert und ein Endwert ein: ");
		Scanner scan=new Scanner (System.in);
		startwert=scan.nextInt();
		endwert=scan.nextInt();
		
				while (startwert<=endwert) {
			System.out.println(startwert);
			startwert=startwert+1;
	
		}
		

	}

}
