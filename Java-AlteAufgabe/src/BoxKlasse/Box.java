
public class Box {
	
	double Bereite;
	double Laenge;
	double Hoehe;
	
	
	
	//Konstruktoren
	Box(){
		
	}
	
	Box (double Bereite, double Laenge, double Hoehe){
		this.Bereite=Bereite;
		this.Laenge=Laenge;
		this.Hoehe=Hoehe;
	}
	
	
	//Methoden
	
	double VolumeBerechnen( ) {
		return Bereite*Laenge*Hoehe;
	}
	
	double GesamtoberflaecheBerechnen() {
		return (Bereite*Laenge) + (Bereite*Hoehe) + (Laenge*Hoehe);
	}

}

class BoxTester {
	
	public static void main(String[] args) {
		
		Box box =new Box(2.5, 5, 6) ;
		
		System.out.println("Flaeche: " + box.GesamtoberflaecheBerechnen() + "Volumen: " + box.VolumeBerechnen());
		
	}

}
