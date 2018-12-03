import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.*;
class PersonFit {
	
	private int gewicht;
	private int groesse;
	
	PersonFit () {
		
	}
	

	public PersonFit(int gewicht, int groesse) {
		super();
		this.gewicht = gewicht;
		this.groesse = groesse;
	}



	

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public int getGroesse() {
		return groesse;
	}

	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}
	
	@Override
	public String toString() {
		return "PersonFit [gewicht=" + gewicht + ", groesse=" + groesse + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gewicht;
		result = prime * result + groesse;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonFit other = (PersonFit) obj;
		if (gewicht != other.gewicht)
			return false;
		if (groesse != other.groesse)
			return false;
		return true;
	}

	

}


  class PersonFitMain {

	public static void main(String[] args) {

//		PersonFit tst = new PersonFit(100,80);
//		float bmi = bmiBerechnen(tst);
//		System.out.println(bmi);
		
		
//		PersonFit [] pf = new PersonFit[100];
//		for (int i = 0 ; i < pf.length; i++) {
//			
//			int kGewicht= erzeugeZufallRandom(50,120);
//			int kGroesse= erzeugeZufallRandom(145,210);
//			
//			PersonFit p = new PersonFit(kGewicht,kGroesse);
//			pf[i]=p;
//		}
		
		
		ArrayList <Object> arl = new ArrayList <>();
		
		for (int i = 0; i<100; i++) {
			int kGewicht= erzeugeZufallRandom(50,120);
			int kGroesse= erzeugeZufallRandom(145,210);
			
			PersonFit p = new PersonFit(kGewicht,kGroesse);
			arl.add(i,p);
		}
//		System.out.println(arl.size());
		System.out.println(arl.toString());
		
		
		HashMap <PersonFit,Float>hm = new HashMap <> ();

				for (Object obj: arl) {
					PersonFit pf = (PersonFit) obj;
					hm.put(pf, bmiBerechnen(pf) );
					
				}
				System.out.println(hm);
		
		boolean istDa1= hm.containsKey(new PersonFit(79,180));
		boolean istDa2= hm.containsKey(new PersonFit(50,140));
		boolean istDa3= hm.containsKey(new PersonFit(89,170));
		boolean istDa4= hm.containsKey(new PersonFit(78,190));

	
		
		System.out.println(istDa1);
		System.out.println(istDa2);
		System.out.println(istDa3);
		System.out.println(istDa4);

		getBmi(hm,istDa1);
		getBmi(hm,istDa2);
		getBmi(hm,istDa3);
		getBmi(hm,istDa4);
		
		String pfad = "C:\\temp\\HashMap.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter (pfad) ) ) {
			for (PersonFit pf : hm.keySet()) {
				bw.write(pf + " " + hm.get(pf));
				bw.newLine();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		System.out.println(pf.length);
//		System.out.println(Arrays.toString(pf));	
	}
	
public static float bmiBerechnen(PersonFit pf) {
		
		float bmi=0;
//		 Math.pow ( 10,  3);
		bmi= (float) (pf.getGewicht()/
				(Math.pow(pf.getGroesse()*0.01, 2) ) ) ;
		
		return bmi ;
	}
	
	static int erzeugeZufallRandom(int untereGrenze, int obereGrenze){
		Random zufall = new Random(); // neues Objekte der Random Klasse
		int zufallZahl = zufall.nextInt(obereGrenze); // next Int Methode mit Argument
		 
		while (zufallZahl < untereGrenze){ //Beding. zufallsZahl muss kleiner als Argument sein
		zufallZahl = zufall.nextInt(obereGrenze); //finde nächste Zahl
		}
//		System.out.println(zufallZahl); //Gib Zufallszahl aus
		return zufallZahl;
		}
	
	
	
	static void getBmi (HashMap <PersonFit,Float> hm, boolean bl) {
		if(bl)
			System.out.println(hm.keySet());	
	}
	
	

}
