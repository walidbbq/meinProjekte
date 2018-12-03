package U14;

import java.util.Scanner;

class HalloObjekt1 {

	String mitteilung; // Instanzvariable (Attribut)

	// 1.Konstruktor
	HalloObjekt1() {
		mitteilung = "Hallo";
	}

	// 2.Kosntruktor
	HalloObjekt1(String mitteilung) {
		this.mitteilung = mitteilung;
	}
	
	//3.Konstruktor
	HalloObjekt1(HalloObjekt1 einHalloObjekt){
		// zwei Referenzen auf desselbe String Objekt 
		//erzeugung, auf das die Instanzvariable mitteilung 
		// des Objektes (2.Konstruktor) einHalloObjekt verweist
		//mitteilung = new String (einHalloObjekt.mitteilung)
		this.mitteilung=einHalloObjekt.mitteilung;
		//mitteilung= new String ( einHalloObjekt.mitteilung);
	}

	// MethodenDefinition
	void sprich() {
		int i = 0;
		while (i < mitteilung.length()) {
			System.out.println(mitteilung);
			i = i + 1;
		}

	}

}

public class HalloDemo {

	public static void main(String[] args) {
		
		String inData;
		Scanner scan = new Scanner(System.in);
		System.out.println("Los einhacken !!!");
		inData=scan.nextLine();
		
		
		HalloObjekt1 einObjekt3 = new HalloObjekt1(inData);
		einObjekt3.sprich();
		
		/*// 1.Konstruktor ohne Parameter
		HalloObjekt1 einObjekt = new HalloObjekt1();
		einObjekt.sprich();*/

		/*// 2.Kontruktor mit Parameter
		HalloObjekt1 einObjekt2 = new HalloObjekt1("Hallo Objekt");
		einObjekt2.sprich();*/
		
		HalloObjekt1 hallo2= new HalloObjekt1(einObjekt3);
		einObjekt3.sprich();
		//hallo2.sprich();
		

	}
}
