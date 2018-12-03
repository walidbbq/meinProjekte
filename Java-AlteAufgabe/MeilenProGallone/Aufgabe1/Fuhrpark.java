
public class Fuhrpark {
	private Auto stadtwagen;
	private Auto gelaendewagen;
	
	
	
	//Konstruktoren
	
	Fuhrpark (int start1, int end1, double gal1, int start2, int end2, double gal2) 
	{
		stadtwagen= new Auto (start1, end1, gal1);
		gelaendewagen= new Auto (start2, end2,gal2);
	}
	
	//Methode
	
	double berechneMPG()
	{
		double summeMPG;
		summeMPG=stadtwagen.berechneMPG() + gelaendewagen.berechneMPG();
		return summeMPG/2;
	}
	
	void auftanken (int stadtTacho, double stadtGalls, int gelaendeTacho, double gelaendeGalls){
		
		stadtwagen.auftanken(stadtTacho,stadtGalls);
		gelaendewagen.auftanken(gelaendeTacho, gelaendeGalls);
	}
	
}
