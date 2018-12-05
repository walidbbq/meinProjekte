package regexAufgabe;

import java.util.ArrayList;

public class Rezept {

	String name;
	ArrayList <String> zutaten;
//	@Override
//	public String toString() {
//		return "Rezept [name=" + name + ", zutaten=" + zutaten + "]";
//	}
	
	@Override
	public String toString () {
		
		return "Name " + name + " Zutaten" + zutaten;
		
	}
	
}

