import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

interface Ausgabe {
	void ausgeben(String x) throws IOException;
}

class AusgabeKonsole implements Ausgabe {

	public void ausgeben(String ak) {
		System.out.println(ak);
	}
}

class AusgabeDatei implements Ausgabe {
	
	public void ausgeben (String ad) throws IOException {
		FileWriter fw = new FileWriter("test.txt");
		BufferedWriter bf = new BufferedWriter (fw);
		bf.write(ad);
		bf.close();
		
//		System.out.println(ad);
	}
	
}

class Dokument {
	private String text;
	private Ausgabe ausgabe;
	
	Dokument (String text, Ausgabe ausgabe) {
		this.text=text;
//		this.ausgabe=ausgabe;
	}
	
	void produziereAusgabe() {
		System.out.println(this.text+ " " +this.ausgabe);
	}
}

public class DokumentLesen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		AusgabeKonsole ak = new AusgabeKonsole();
//		ak.ausgeben("Ausgabe aus AusgabeKonsole");
//		
//		AusgabeDatei ad = new AusgabeDatei ();
//		ad.ausgeben("Ausgabe aus AusgabeDaetei!");
		
		Dokument d1= new Dokument("d1",new AusgabeDatei() );
		Dokument d2 = new Dokument ("d2", new AusgabeDatei() );
		
		Dokument d3 = new Dokument ("d3", new AusgabeKonsole());
		Dokument d4 = new Dokument ("d4", new AusgabeKonsole() );
		Dokument d5 = new Dokument ("d5", new AusgabeKonsole() );

		
		Dokument [] dokument = {d1,d2,d3,d4,d5};
		
//		d3.produziereAusgabe();
		
		for (Dokument tempd : dokument ) {
			tempd.produziereAusgabe();
		}

	}

}
