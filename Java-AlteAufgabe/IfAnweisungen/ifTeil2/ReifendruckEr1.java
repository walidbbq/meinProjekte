package ifTeil2;

import java.util.Scanner;

public class ReifendruckEr1 {

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
		
		if ((RVR==LVR && RHR==LHR) &&
			(RVR>=35 && RVR<=45) &&
			(LVR>=35 && LVR<=45) &&
			(RHR>=35 && RHR<=45) &&
			(LHR>=35 && LHR<=45)
				)
			
			System.out.println("Reifendruck ist OK !");
		
		else
			System.out.println("Der Reifendruck ist nicht in Ordnung -_- ");
		
	}

}
