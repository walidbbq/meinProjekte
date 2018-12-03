package Beispiele;

class SimpleBank {
	
	static int[] konten = { 30, 50, 100 };

	public void überweisung(int von, int nach, int betrag) 
	{
		int neuerBetrag;
		// mögliche Inkonsistenz, da Zeitraum zwischen Aus- und Einzahlung
		neuerBetrag = konten[von] - betrag;
//		try 
//		{
//			Thread.sleep((int) Math.random() * 1000);
//		}
//
//		catch (InterruptedException e)
//		{
//			System.out.println(e.toString());
//		}

		konten[von] = neuerBetrag;

		// mögliche Inkonsistenz, da Zeitraum zwischen Aus- und Einzahlung
		neuerBetrag = konten[nach] + betrag;
//		try
//		{
//			Thread.sleep((int) Math.random() * 1000);
//		}
//
//		catch (InterruptedException e)
//		{
//			System.out.println(e.toString());
//		}

		konten[nach] = neuerBetrag;
	}

	public void kontostand() 
	{
	for(int i = 0; i < konten.length; i++)
		System.out.println("Konto "+ i +": " + konten[i]);
	}
}

class Angestellter extends Thread {
	SimpleBank bank;
	int von, nach, betrag;

	public Angestellter(SimpleBank bank, int von, int nach, int betrag) {
		this.bank = bank;
		this.von = von;
		this.nach = nach;
		this.betrag = betrag;
	}

	public void run() {
		// Überweisung vornehmen
		bank.überweisung(von, nach, betrag);
		// Kontostand ausgeben
		System.out.println("Nachher:");
		bank.kontostand();
	}
}

	public class SimpleBankDemo {
	
		public static void main(String[] args) {
			
			System.out.println("Vorher:");
			SimpleBank b = new SimpleBank();
			b.kontostand();
//			// Eine ringförmige Überweisung
			Angestellter A1 = new Angestellter(b, 0, 1, 20);
			Angestellter A2 = new Angestellter(b, 1, 2, 20);
			Angestellter A3 = new Angestellter(b, 2, 0, 20);
			A1.start();
			A2.start();
			A3.start();
//			
		}
	
	}
	
	