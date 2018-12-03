package aufgabe2;


public class Auto {

// Instanzvarialblen
	double startMeilen;
	double endMeilen;
	double gallonen;

// Konstruktor
	Auto(double startTacho) {
		startMeilen = startTacho;
	//	endMeilen = startTacho;
    //    gallonen = 0;
	}
	
	
	

	
// Methoden
	
	void auftanken (double aktTacho, double gallonen) {
		startMeilen=endMeilen;
		endMeilen=aktTacho;
		this.gallonen=gallonen;
//		System.out.println("von void endmeilen" + endMeilen);
//		System.out.println("von void aktTacho" + aktTacho);
//		System.out.println("von void startmeilen" + startMeilen);
	}
	

	double berechneMPG() {
		return (endMeilen - startMeilen) / gallonen;
	}
	
	
	boolean benzinschwein() {
			System.out.println("benzinschwein!");
			return true;
	}
		

	
	
	
	boolean sparauto() {
			System.out.println("sparauto!");
			return true;
		}
	

}

