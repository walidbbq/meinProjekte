import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class PersonWork {

	public static void main(String[] args) {
		
		
		Set <Person> hs = new HashSet<> ();
		
////		Person [] pr = new Person [5];
//		for (int i=1 ; i<6 ; i++) {
//			Random rn = new Random ();
//			String vorname = "vorname" + i ;
//			String nachname = "nachname" + i ;
//			int telefonnummer = rn.nextInt(987387383);
//			
////			pr[i].setNachname(nachname);
////			pr[i].setVorname(vorname);
////			pr[i].setTelefonnummer(telefonnummer);
////			
//			Person p = new Person(vorname,nachname,telefonnummer);
			
			hs.add( new Person ("Schickentanz","Lara", "012112099"));
			hs.add ( new Person ("Rehfeld" , "Jan", "0221408987"));
//		}
		
//		System.out.println(hs);
		
			//1.erste Augabe
//		System.out.println(sucheNameTelefonnr(hs,"Lara","Schickentanz"));
			
			Scanner sc = new Scanner(System.in);		
			System.out.println("Wie lautet der Vorname der Person, die Die suchen?");
			String vorname = sc.next();
			System.out.println("Wie lautet der Nachname der Person, die Die suchen?");
			String nachname = sc.next();
			
		String tel =sucheNameTelefonnr(hs,vorname,nachname);
		
		System.out.println("Die Telefonnummer von " +vorname + " " + nachname + "lautet: " + tel);

			
		
	}
	
	public static String sucheNameTelefonnr (Set <Person> personen , String vorname, String nachname) {
		
		for (Person p : personen) {
			String vor = p.getVorname();
			String nach = p.getNachname();
			String tel = p.getTelefonnummer();
			
			if (vor.equals(vorname) && (nach.equals(nachname))){
				return tel;
			}
		}
		
		return "Nicht gefunden! " ;
		
	}

}
