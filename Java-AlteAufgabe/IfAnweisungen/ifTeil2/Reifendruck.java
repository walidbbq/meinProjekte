package ifTeil2;

import java.util.Scanner;

public class Reifendruck {

	public static void main(String[] args) {

		int RVR, LVR, RHR, LHR;
		Scanner scan=new Scanner(System.in);
		System.out.println("Reifendruck: rechter Vorderreifen: ");
		RVR=scan.nextInt();
		
		System.out.println("Reifendruck: linker Vorderreifen: ");
		LVR=scan.nextInt();
		
		System.out.println("Reifendruck: rechter Hinterreifen: ");
		RHR=scan.nextInt();
		
		System.out.println("Reifendruck: linker Hinterreifen: ");
		LHR=scan.nextInt();
		
		if (RVR==LVR && RHR==LHR)
			System.out.println("Reifendruck ist OK !");
		else
			System.out.println("Reifendruck ist nicht OK -_- ");
		
	}

}
