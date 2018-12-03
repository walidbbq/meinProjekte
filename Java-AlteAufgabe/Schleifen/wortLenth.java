import java.util.Scanner;

public class wortLenth {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
		System.out.println("Geben Sie ein wort ein: ");
		String wort=scan.nextLine();
		int laenge=wort.length();
		
		int i=0;
		while (i<laenge) {
		System.out.println(wort);
		i++;
		}
	}

}
