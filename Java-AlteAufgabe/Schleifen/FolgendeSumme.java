import java.util.Scanner;

public class FolgendeSumme {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Geben Sie n ein: ");
		int n=scan.nextInt();
		
		double i=1;
		double summe=0;

		while (i<=n) {
			summe=summe + 1/i;
			i++;
		}
		
		System.out.println("Die Summe ist : " +summe);
	}

}
