import java.util.Scanner;

public class kassenbonE {

	public static void main(String[] args) {

		char ware;
		double wurst=4.20;
		double brot=2.10;
		double kaese=2.30;
		double dvd=12; 
		Scanner eingabe=new Scanner (System.in);
		
		System.out.println("Wieviel Geld haben Sie in Ihrer Brieftasche?" );
		int gegebenesGeld=eingabe.nextInt();
		
		System.out.println("Einkaufen : ");
		String str=eingabe.nextLine();
		//ware=str.charAt(0);
		
		
	
		
		int w=0, b=0, k=0, d=0;
		double gesamt = 0;
		while (gegebenesGeld > gesamt)
		{
		
		
			if(str=="w")
				str=str+1;
				System.out.println("ware = wurst");
				
//			if (ware=='b')
//				b=b+1;
//			
//			if (ware=='k')
//				k=k+1;
//				
//			if (ware=='d')
//			    d=d+1;
//			
			gesamt = (w*wurst + b*brot + k*kaese + d*dvd);
			
		
				
		}
		
		System.out.println("Ihr Brieftasche reicht nicht mehr aus !");
		
	}

}
