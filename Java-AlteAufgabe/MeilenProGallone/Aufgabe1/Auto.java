
public class Auto {

	// Instanzvarialblen
	private double startMeilen;
	private double endMeilen;
	private double gallonen;

	// Konstruktor
	Auto(double startTacho, double endTacho, double galls) {
		startMeilen = startTacho;
		endMeilen = endTacho;
		gallonen = galls;
	}

	// Methoden
	
	double berechneMPG() {
		return (endMeilen - startMeilen) / gallonen;

	}
	
	boolean benzinschwein() {
			if (berechneMPG() < 15) {
				return true;
			}
		
			else 
				return false;
	}
		

	
	
	
	boolean sparauto() {
			if (berechneMPG() > 30){
			return true;
		}
			else 
				return false;

}
	
	void auftanken (int aktuellerTacho, double getankteGalls)
	{
		startMeilen=endMeilen;
		endMeilen=aktuellerTacho;
		gallonen=getankteGalls;
	}
	
	
}
