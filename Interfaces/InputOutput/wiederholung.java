import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.IIOException;

public class wiederholung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z=0;
		Person [] p1 = new Person [21];
		for (int i=0; i<p1.length;i++) {
			
			String vorname = "Vorname" + (i+1);
			String nachname = "Nachname" + (i+1);
			p1 [i]= new Person(vorname, nachname);
			z++;
		}
		System.out.println(Arrays.toString(p1));
		System.out.println("Anzahl der Erzeugten Objekte: "+ z);
		
		String pfad= "C:\\temp\\wieder.txt";
		
		schreibePersonArrayInDatei(p1,pfad);
		
		Person [] erzP = (LesePesonAusDatei(pfad));
		
//		System.out.println(erzP);
		
		
		System.out.println(ArrayVergleichen (p1,LesePesonAusDatei(pfad)));
		
		
		

	}
	
	public static boolean ArrayVergleichen (Person [] p1, Person [] p2) {
		
		if (p1.length != p2.length) {
				return false;
		}
		
		
		for (int i =0 ;i<p2.length; i++) {
//			if (!p1[i].getVorname().equals(p2[i].getVorname()) || (!p1[i].getNachname().equals(p2[i].getNachname())))
			if (!p1[i].equals(p2[i]))
				return false;
		}
		
		
		return true;
	}
	
	public static void schreibePersonArrayInDatei(Person [] array, String pfad) {
		FileWriter fw = null;
		try {
			fw = new FileWriter (pfad,false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (BufferedWriter bf = new BufferedWriter(fw) ) {
			for (int i=0 ; i<array.length; i++) {
				
				bf.write(array[i].getVorname() + " " + array[i].getNachname());
				bf.newLine();
			}
			
		}
		
		catch (IOException ioe) {
			
		}
		
	}
	
	
	public static Person [] LesePesonAusDatei (String pfad) {
		
		Person [] p = null;
//		FileReader fr= null;
//		FileReader fr2= null;
//
//		try {
//			fr = new FileReader(pfad);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try (BufferedReader br = new BufferedReader( new FileReader (pfad)); BufferedReader br2 = new BufferedReader(new FileReader (pfad)) ) {
			
			String line=br.readLine();
			String line2=br2.readLine();
			
			int anzZeilen=0;
			
			
//			while (br.readLine() != null ) { 
//				anzZeilen++;
//			}
			

			do {
				anzZeilen++;
			} while (br.readLine()!=null);
			
			p= new Person [anzZeilen];
			
			System.out.println("Anzahl der Zeile aus Datei zählen und entsprechend ein "
					+ "Array Person erzeugen:  " + anzZeilen);
			
			int y=0;
			do {
				String [] splitzZeile = line.split(" ");
//				System.out.println("Vorname: " +splitzZeile[0] );
//				System.out.println("Nachname: " + splitzZeile[1] );
				//				System.out.println(line);
				Person pr = new Person ();
				pr.setVorname(splitzZeile[0]);
				pr.setNachname(splitzZeile[1]);
				p[y]=pr;
				y++;
				
			}while ((line=br2.readLine())!=null);
			System.out.println("Personen Objekte nach ausgefülltem Array erzeugen und "
					+ "im Array speichern: " + y);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

}
