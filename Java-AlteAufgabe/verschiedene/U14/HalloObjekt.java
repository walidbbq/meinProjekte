package U14;

class HalloTester{
	
	String mitteilung;
	int laenge;
	
    HalloTester(String mitteilung){

	this.mitteilung=mitteilung;
	}
	
	 void sprich () { 	 
		System.out.println(mitteilung);
			//System.out.println("Hallo von einem Objekt!"); 
		}
	 
	 int laenge () {
	 System.out.println(mitteilung.length());
     return laenge;
 }
	 
	
}


public class HalloObjekt 
{	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HalloTester objekt1 = new HalloTester("venus");
		HalloTester objekt2= new HalloTester("markus");
		HalloTester objekt3 = new HalloTester("erde");
		
		
		
		objekt1.laenge();
		objekt2.laenge();
		
		objekt1.sprich();
		objekt2.sprich ();
		objekt3.sprich();
		
		
	}
	

}