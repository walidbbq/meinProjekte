import java.util.Scanner;

public class kassenbon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double wurst=4.20;
		double brot=2.10;
		double kaese=2.30;
		double dvd=12; 
		Scanner eingabe=new Scanner (System.in);

		System.out.println("Wieviel Wurstst�ck brauchen Sie ?");
		int AnzahlW=eingabe.nextInt();
		
		System.out.println("Wieviele K�asestuck brauchen Sie ?");
		int AnzahlK=eingabe.nextInt();
		
		System.out.println("Wieviel BrotSt�ck brauchen Sie ?");
		int AnzahlB=eingabe.nextInt();
		
		System.out.println("Wieviel Dvdst�ck brauchen Sie ?");
		int AnzahlD=eingabe.nextInt();
		
		System.out.println("Wieviel Geld haben Sie in Ihrer Brieftasche?" );
		int gegebenesGeld=eingabe.nextInt();
		

		System.out.println("Wurst " + "\t\t" +AnzahlW+ " x "+ wurst+ "  "+" Euro " +"\n"+ "\t\t\t\t" +AnzahlW*wurst+ " Euro" + "\n"+
							"K�se " + "\t\t" +AnzahlK+ " x "+ kaese+ "  "+" Euro " +"\n"+ "\t\t\t\t" +AnzahlK*kaese+ " Euro" + "\n"+
							"Brot " + "\t\t" +AnzahlB+ " x "+ brot+ "  "+" Euro " +"\n"+ "\t\t\t\t" +AnzahlB*brot+ " Euro" + "\n"+
							"DVD " + "\t\t" +AnzahlD+ " x "+ dvd+ "  "+" Euro " +"\n"+ "\t\t\t\t" +AnzahlD*dvd+ " Euro" + "\n"+
							"----------------------------------------" + "\n"+
							"Gesamt"+ "\t\t\t\t" + (AnzahlW*wurst + AnzahlK*kaese+ AnzahlB*brot+ AnzahlD*dvd) + " Euro" + "\n" + 
							"Gegeben" + "\t\t\t\t" + gegebenesGeld + " Euro"+ "\n"+
							"Zur�ck" + "\t\t\t\t" + (gegebenesGeld - (AnzahlW*wurst + AnzahlK*kaese+ AnzahlB*brot+ AnzahlD*dvd)) + " Euro");
		
	}
	
	}

