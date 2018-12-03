import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

class Bankkonto {
	
	// Instanzvariablen
	
	private String kontonummer;
	
	private String kontoinhaber;
	
	private int kontostand;
	
	private int zaehler=0;

	// Konstruktoren
	Bankkonto( String ktoNummer, String ktoInhaber, int start )
		{
		kontonummer = ktoNummer;
		kontoinhaber = ktoInhaber;
		kontostand = start;
		}

	// Methoden
	
	
	private void inkrementZaehler() {
		zaehler ++;
	}
	
	
	int aktuellerKontostand() {
		return kontostand;
	}

	void verarbeiteEinzahlung(int betrag) {
		inkrementZaehler();
		kontostand = kontostand + betrag;
	}

	void verarbeiteAuszahlung(int betrag) {
		
		inkrementZaehler();
		
		int gebuehr;
		if (kontostand < 100000)
			gebuehr = 15;
		else
			gebuehr = 0;
		kontostand = kontostand - betrag - gebuehr;
	}
	
	int  anzeigen( ) {
		System.out.println(kontonummer + "\t" + kontoinhaber + "\t" +kontostand + "\t" + zaehler);
		return 0 ;
	}
	
}

public class BankTester {

	public static void main(String[] args) {

		
		
//		try 
//		{
//			//Class.forName("Com.mysql.jdbc.Driver").newInstance();
//			Connection con = DriverManager.getConnection
//					("jdbc:mysql://localhost:3306/bankkonto","root","");
//			System.out.println("Connected!");
//			
//		}
//		
//		catch (Exception e)
//		{
//			System.out.println("**** Fehlermeldung ****");
//		}
//		
//		
		
		
		try {
			Statement stmt = null;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankkonto", "root", "");
			stmt = (Statement) con.createStatement();
		ResultSet result = stmt.executeQuery("SELECT * FROM bankkonto.konto, bankkonto.kunden");
//		System.out.println(stmt.execute("SELECT * FROM bankkonto.konto"));
		while (result.next()) {
			int id = result.getInt("idKonto");
			String name= result.getString("Name");
			String Kontonummer = result.getString("IBAN");
			int Kstand = result.getInt("Kontostand");
			int Kid = result.getInt("Kunden_Id");
			System.out.println(id + "\t"+ name +"\t" + Kontonummer + "\t" 
					+ Kstand + "\t" + Kid);
		}
		System.out.println();
			
			
		}
		
		
		catch (ClassNotFoundException cnfe)
		{
		
			System.out.println((cnfe.toString()));
		}
		
		catch (SQLException sqle)
		{
			System.out.println(sqle.toString());
		}
//		Bankkonto konto;
//		Scanner scn = new Scanner(System.in);
//		
//		System.out.println(" ***Neue Bankkonto Erstellne*** ");
//		System.out.println("Ihre Name: ");
//		String Name=scn.nextLine();
//		
//		System.out.println("Bankkonto Nummer: ");
//		String BaNr=scn.nextLine();
//		
//		System.out.println("Anfangsbestand: ");
//		int AnfangB=scn.nextInt();
//		
//		konto  = new Bankkonto (BaNr,Name,AnfangB);
//		
//		konto.anzeigen();
		
//		Bankkonto laura = new Bankkonto("1123","hoeller", 2000);
//		System.out.println(laura.aktuellerKontostand());
//		
//		Bankkonto bobsKonto = new Bankkonto("999","Bob", 100);
//		Bankkonto jillskonto = new Bankkonto ("111", "jill", 500);
//		
//		bobsKonto.verarbeiteAuszahlung(50);
//		bobsKonto.verarbeiteEinzahlung(150);
//		bobsKonto.verarbeiteAuszahlung(50);
//		
//		jillskonto.verarbeiteEinzahlung(500);
//		jillskonto.verarbeiteAuszahlung(100);
//		jillskonto.verarbeiteAuszahlung(100);
//		jillskonto.verarbeiteEinzahlung(100);
//		
//		bobsKonto.anzeigen();
//		jillskonto.anzeigen();
//		System.out.println(laura.aktuellerKontostand());
//		
	}

}
