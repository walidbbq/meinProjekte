package Ausnahmen;
import java.util.Random;

public class ExceptionBeispiel15 {

	public static void main(String[] args) {
		
		final int zahl = 10;
		int erg;
		
			
//			int random = (int)((Math.random()) * 10 + -5);
//			System.out.println(random);
			
			try {	
				
				for (int i = 0; i<10; i++) {
					int random = (int)(Math.random()*11)-5;
					System.out.println(zahl/random);

//					erg=zahl/random;
//					System.out.println("Ergebnis: " + erg);
				}
			}
			
			catch (ArithmeticException e) 
				{
					System.out.println("Division durch null ist nich m�chlich! ");	
				}
			
			finally 
			{
				System.err.println("Ende der Ausgabe. ");
			}

		}
		

	}


//
//int r= (int) Math.random();
// r = (int) new Random().nextDouble();
//int z = r * (5 - -5) + -5;

//System.out.println(z);

//Random rand = new Random ();

//int random = (int)( Math.random(i) );

//int random = (int)((Math.random()) * 10 + -5);
//System.out.println(zahl);

