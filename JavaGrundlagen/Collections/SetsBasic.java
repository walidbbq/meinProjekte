import java.util.HashSet;
import java.util.Set;

public class SetsBasic {

	public static void main(String[] args) {	
		
		Set<Orange> orangen = new HashSet<Orange>();		
		
	
		// Hinzufügen von Elementen
		orangen.add(new Orange(5, "orange"));
		orangen.add(new Orange(8, "orange"));
		orangen.add(new Orange(9, "grün"));
		orangen.add(new Orange(5, "XX"));
		orangen.add(new Orange(6,"blau",6));
		
		System.out.println( orangen );
		
		// for each Schleife (for-Schleife funktioniert nicht!)
//		for (Orange orange : orangen) {
//			System.out.println(orange);
//		}
//		
//		// contains-Methode: Suchen von Objekten in Set
		boolean enthalten = orangen.contains(new Orange(6,"balu",6));
		System.out.println(enthalten);
	}

}


class Orange {
	
	int saftgehalt;
	String farbe = " ";
	int test;
	
	Orange(int saftgehalt) {
		this.saftgehalt=saftgehalt;
	}
	
	Orange(int saftgehalt, String farbe) {
		this.saftgehalt=saftgehalt;
		this.farbe = farbe;
	}
	
	
	
	public Orange(int saftgehalt, String farbe, int test) {

		this.saftgehalt = saftgehalt;
		this.farbe = farbe;
		this.test = test;
	}

	@Override
	public boolean equals(Object obj) {
		if (((Orange) obj).test == this.test) {
			return true;
		}
		return false;
	}	
	@Override
	public int hashCode() {
		return test;
	}
	@Override
	public String toString() {
		return "O: " + farbe + "/" + saftgehalt;
	}
	
	
	
	
}