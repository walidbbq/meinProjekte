
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ReadWriteAufgabe {

	public static void main(String[] args) {
		// =====
		
		Person[] p = new Person[20];
		for (int i = 0; i < p.length; i++) {
			String vorname = "Vorname" + (i+1);
			String nachname = "Nachname" + (i+1);
			p[i] = new Person(vorname, nachname);
		}		
		System.out.println(Arrays.toString(p));

		// Pfad festlegen
		String pfad = "C:\\temp\\persont.txt";
		 schreibePersonArrayInDatei(p, pfad);
		
//		String[] splitZeile = "hallo;test;bla".split(";");
//		System.out.println( splitZeile );
		
//		Person[] erzPersonen = lesePersonenArrayAusDateiEin(pfad);		
//		System.out.println( Arrays.toString(erzPersonen) );
		
		// Vergleiche, ob die Inhalte von p (Array, das zu Beginn erzeugt wurde) und
		// Array erzPersonen gleich ist.
		
//		boolean gleich = vergleicheArrays(p, erzPersonen);
//		System.out.println("Arrays sind gleich " + gleich);

	}
	
//	public static boolean vergleicheArrays(Person[] p1, Person[] p2) {
//		if (p1.length != p2.length) {
//			return false;
//		}
//		// Zwei Person Objekte sind gleich, wenn
//		// Vorname und Nachname übereinstimmen
//		for (int i = 0; i < p1.length; i++) {
////			if (!p1[i].getVorname().equals(p2[i].getVorname()) || !p1[i].getNachname().equals(p2[i].getNachname())) {
////				return false;
////			}
//			// Mit equals-Methode in Klasse Person
//			if (! p1[i].equals(p2[i])) {
//				return false;
//			}
//			
//		}
//		return true;
//	}
	
//	public static Person[] lesePersonenArrayAusDateiEin(String pfad ) {
//		
//		Person[] person = null;
//		int anzZeilen = 0;
//		// Zeilen in der Textdatei zählen
//		try( BufferedReader br = new BufferedReader(new FileReader(pfad));
//			 BufferedReader br2 = new BufferedReader(new FileReader(pfad))
//			) {
//			// anzahl der Zeilen zählen
//			while (br.readLine() != null ) { 
//				anzZeilen++;
//			}
//			// Array deklinieren
//			person = new Person[anzZeilen];
//			
//			// Aus Datei lesen, in Array schreiben
//			String line = null;
//			int i = 0;
//			while( (line = br2.readLine()) != null ) {
//				System.out.println(line);
//				// Objektinstanz vom Typ person erzeugen
//				// Zeile: vorname / Nachname treffen
//				
//				// Split: splittet einen String anhand des übergebenen
//				// 		  Trennzeichens 
//				String[] splitZeile = line.split(";");
//				System.out.println("Vorname: " + splitZeile[0]);
//				System.out.println("Nachname: " + splitZeile[1]);
//				
//				// Erzeugung von Person Instanzen
//				Person pTemp = new Person();
//				pTemp.setVorname(splitZeile[0]);
//				pTemp.setNachname(splitZeile[1]);
//				
//				// Zuweisung der Person zu Array
//				person[i] = pTemp;
//				i++;
//			}
//			
//		} catch (IOException ioe) {
//			ioe.printStackTrace();
//		}
//	
//		return person;
//	}
	
	public static void schreibePersonArrayInDatei(Person[] array, String pfad) {
		try( BufferedWriter bw = new BufferedWriter( 
				new FileWriter(pfad, false))  ) {
			for (Person person : array) {
				bw.write(person.getVorname() + ";" + person.getNachname());
				bw.newLine();
			}
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
