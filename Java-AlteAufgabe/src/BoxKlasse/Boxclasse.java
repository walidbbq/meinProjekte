



  class Box {
	
	private double Laenge;
	private double Hoehe;
	private double Bereite;

	
	
	
	//Konstruktoren
	
	Box (double Laenge, double Hoehe, double Bereite){
		this.Laenge=Laenge;
		this.Hoehe=Hoehe;
		this.Bereite=Bereite;
	}
	
	Box(double seite){
	
		Laenge=seite;
		Hoehe=seite;
		Bereite = seite;

	}
	
	Box (Box alteBox) {
		Laenge=alteBox.Laenge;
		Hoehe=alteBox.Hoehe;
		Bereite=alteBox.Bereite;

	}
	
	
	
	// Methoden
	
	public boolean passtIn(Box aeussereBox) 
	{
		if  (this.Bereite < aeussereBox.Bereite &&
			this.Laenge < aeussereBox.Laenge &&
		     this.Hoehe < aeussereBox.Hoehe )
			
			return true;
		
			else 
				return false;

		}
		    
	


	
	public Box groessereBox() {
		return new Box(1.25 * this.Laenge, 1.25 * this.Hoehe, 1.25 * this.Bereite);
	}
	
	
	public Box kleinerBox() {
		return new Box (0.75*this.Laenge, 0.75*this.Hoehe,0.75*this.Bereite );
	}
	
	
	public double getLaenge() {
		return Laenge;
	}
	
	
	public double getHoehe() {
		return Hoehe;
	}
	
	public double getBreite() {
		return Bereite;
	}
	
	
	double berechneVolumen( ) {
		return Bereite*Laenge*Hoehe;
	}
	
	
	private double berechneFlaecheVorn() {
		return Bereite*Laenge;
	}
	
	
	private double berechneFlaecheOben() {
		return Bereite*Hoehe;
	}
	
	private double berechneFlaecheSeitelich() {
		return Laenge*Hoehe;
	}
	
	
	double berechneFlaeche() {
		//return (Bereite*Laenge) + (Bereite*Hoehe) + (Laenge*Hoehe);
		return 2* berechneFlaecheVorn() +
               2* berechneFlaecheOben() + 
               2* berechneFlaecheSeitelich();
		
	}
	
	public void anzeigen () {
		
	System.out.println("Länge: " + Laenge + "\t Höhe: " + Hoehe+ "\t Breite: " + Bereite);
		
	}

}

public class Boxclasse {

		
		public static void main(String[] args) {
			
			Box box = new Box(2.5, 5, 6) ;
			
			Box box1=new Box(box);
			
			Box boxs= new Box (3.2);
		
			System.out.println(box.passtIn(box1));
			
			Box box2=box.kleinerBox();
			
			System.out.println(box2.passtIn(box));

			Box boxG=box.groessereBox();
			System.out.println(box.passtIn(boxG));
			
			
			box2.anzeigen();
			boxs.anzeigen();
		
			
			
//			//Box box2 = new Box(3,6,7);
//			
//			Box box2 = new Box(2, 5, 6);
//			
//			System.out.println("BoxPastInoder nicht : " + box.passtIn(box2));
//			
//			//System.out.println("Box2: " + box2.anzeigen() );
//			
//			box2.anzeigen();
//			box.anzeigen();
//		
//			
//			Box box3= box.groessereBox();
			
//			box3.anzeigen();
//			
//			System.out.println("Flaeche: " + box.berechneFlaeche() + "  Volumen: " + box.berechneVolumen());
//			
//			Box box1 =new Box(3);
//			System.out.println("Flaeche: " + box1.berechneFlaeche()+ " Volumen: " + box1.berechneVolumen());
//			
//			System.out.println("Fläche: " + box.berechneFlaeche() + "Volumen: " + box.berechneVolumen()); 
//			
//			System.out.println( "Laenge: " + box.Bereite +
//                    " Hoehe: " + box.Laenge +
//                    "Breite: " + box.Hoehe );
//			box.anzeigen();
			
//			System.out.println("Laenge box : " + box.getLaenge());
		}
	

}

