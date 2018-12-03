
	import java.util.Scanner;
	import java.awt.* ;
	import java.awt.event.*;
	import javax.swing.*;
	import java.sql.*;

	 class DBVerbindung {
		private final String treiber = "com.mysql.jdbc.Driver";
		private String dBase= "jdbc:mysql://localhost:3306/";
		private String benutzer;
		private String passwort;
		
		private Connection con;
		private Statement stmt;
		private ResultSet result;
		
		// Konstruktor stellt die Daten zum Verbindungsafubau zusammen
		
		public DBVerbindung (String dBase, String benutzer, String passwort)
		{
			this.dBase= this.dBase+dBase;			
			this.benutzer=benutzer;
			this.passwort=passwort;
		}
		
		public void erstelleVerbindung() {
			try {
				//lädt den Datenbanktreiber
				Class.forName(treiber);
				
				//Stellt die Verbindung her
				con = DriverManager.getConnection(dBase, benutzer, passwort);
				
				//Erzeugt ein Objekt für Abfragen und Aenderungen der Datenbank
				stmt = con.createStatement();
				
//				 result = stmt.executeQuery(abfrage);
				}
			
			catch (ClassNotFoundException cnfe)
			{
			
				System.out.println((cnfe.toString()));
			}
			
			catch (SQLException sqle)
			{
				System.out.println(sqle.toString());
			}
		
	}
		
		public void schliesseVerbindung()
		{
			try
			{
				stmt.close();
				con.close();
			}
			catch (SQLException sqle)
			{
				System.out.println(sqle.toString());
			}
		}
		public void holenDaten()
		{
			try
			{
			ResultSet result = stmt.executeQuery("SELECT * FROM bankkonto.konto, bankkonto.kunden");
			System.out.println("die Karten daten : ");
			System.out.println("-------------------------------------------");
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
			
			catch (SQLException sqle)
			{
				System.out.println(sqle.toString());
			}
			
		}
		
		// liefert das Anweisungsobjekt zu Abfragen und Änderungen der DB.
		public Statement gibStmt()
		{
			return stmt;
		}
		
		
	 }
		
	 
	 // Klasse Abfrage um Datenbankfragen zu implementieren
	 
	 class DBAbfrage {
		 private DBVerbindung dbVerbindung;
		 
		 public DBAbfrage()
		 {
			 dbVerbindung = new DBVerbindung ("bankkonto", "root","");
		 }
		 
		 // zeigt Inhalte einiger Datenfelder aus der gewuenschten Tabelle.
		 public void holeDaten()
		 {
			 String qryAlleDaten = "SELECT * " + "FROM bankkonto.konto, bankkonto.kunden";
			 dbVerbindung.erstelleVerbindung();
			 Statement stmt =dbVerbindung.gibStmt();
			 
			 try {
				 ResultSet result=stmt.executeQuery(qryAlleDaten);
				 System.out.println("die Karten daten : ");
					System.out.println("-------------------------------------------");
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
					
					catch (SQLException sqle)
					{
						System.out.println(sqle.toString());
					}
			 dbVerbindung.schliesseVerbindung();
		 }
		 
		 
		 // hole konto daten durch Kundenname
		 public void holeInfo(String kundenname)
		 {
			 String qryName = "SELECT *" +  "FROM kunden ku ,konto ko" + 
					" WHERE ku.Name LIKE \'" + kundenname +"\'";
			 dbVerbindung.erstelleVerbindung();
			 Statement stmt =dbVerbindung.gibStmt();
			 
			 try {
				 ResultSet result=stmt.executeQuery(qryName);
				 System.out.println("die Karten daten : ");
					System.out.println("-------------------------------------------");
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
					
					catch (SQLException sqle)
					{
						System.out.println(sqle.toString());
					}
			 dbVerbindung.schliesseVerbindung();
		 
		 	}
		 
		 
		 
		 
		 
		 public void aendereIBAN(String IBAN)
		 {
			 
			 String aIBAN = "UPDATE konto ko, kunden ku SET IBAN=\'" + IBAN + "\' WHERE ku.Id = ko.Kunden_Id";
//			 String aIBAN = "UPDATE konto SET IBAN=\'" + IBAN + "\' WHERE Kunden_Id =" + Id;
			 dbVerbindung.erstelleVerbindung();
			 Statement stmt =dbVerbindung.gibStmt();
			 
			 try 
			 {
				 stmt.executeUpdate(aIBAN);
			 }
			 
			 catch (SQLException sqle)
			 {
				 System.out.println(sqle.toString());
			 }
			 
			 dbVerbindung.schliesseVerbindung();
		 }
		 
		 
		 		 
		 public void nueKunde (String Name)
		 {
			 String neuKunde="insert into kunden (Name) values (\'" + Name +"\')";
			 
			 dbVerbindung.erstelleVerbindung();
			 Statement stmt =dbVerbindung.gibStmt();
			 
		 try 
		 {
			 stmt.executeUpdate(neuKunde);
		 }
		 
		 catch (SQLException sqle)
		 {
			 System.out.println(sqle.toString());
		 }
		 
		 dbVerbindung.schliesseVerbindung();
	 }
		 
		 // fügt einen weiteren Datensatz in der Tabelle koto bzw kunden
		 
//		 public void nueKunde (int Id,String Name)
//		 {
//			 String neuKunde="insert into kunden (Id,Name) values (\'"+ Id +"\',\'" + Name +"\')";
//			 
//			 dbVerbindung.erstelleVerbindung();
//			 Statement stmt =dbVerbindung.gibStmt();
//			 
//		 try 
//		 {
//			 stmt.executeUpdate(neuKunde);
//		 }
//		 
//		 catch (SQLException sqle)
//		 {
//			 System.out.println(sqle.toString());
//		 }
//		 
//		 dbVerbindung.schliesseVerbindung();
//	 }
		 
		 public void neuKonto (int idKonto, String IBAN, int Kontostand,int Kunden_Id)
		 {
			 String neuKonto = " insert into konto (idKonto,IBAN,Kontostand,Kunden_Id) values (\'"+idKonto+"\',"+ "\'"+IBAN+"\'," +"\'"+Kontostand+"\',"+ "\'"+Kunden_Id+ "\')";
			 dbVerbindung.erstelleVerbindung();
			 Statement stmt =dbVerbindung.gibStmt();
			 try 
			 {
				 stmt.executeUpdate(neuKonto);
			 }
			 
			 catch (SQLException sqle)
			 {
				 System.out.println(sqle.toString());
			 }
			 
			 dbVerbindung.schliesseVerbindung();
		 }
		 
	 }
	 
			
class Bankk extends JFrame implements ActionListener
{

	
	JLabel kopfLabel = new JLabel ("Bankkonto Voränge. ");
	JLabel kNameLabel= new JLabel ("die Name eingeben : ");
	JLabel kNrLabel= new JLabel ("IBAN Nummer eingeben: ");
	JLabel einzahlungLabel = new JLabel ("Einzahlung: ");
	JLabel auszahlungLabel= new JLabel ("Auszahlung: ");
	
	JTextField kName = new JTextField(10);
	JTextField kNr = new JTextField(16);
	JTextField einzahlung = new JTextField(10);
	JTextField auszahlung = new JTextField (10);
	JTextField kstand = new JTextField (10);
	
	JButton kstandB = new JButton ("Kontostand");
	JButton doitB = new JButton ("Do it !");
	
	JPanel kopfPanel= new JPanel ();
	JPanel kNamePanel = new JPanel ();
	JPanel kNrPanel = new JPanel ();
	JPanel einzahlungPanel = new JPanel ();
	JPanel auszahlungPanel = new JPanel (); 
	JPanel kstandBPanel = new JPanel ();
	JPanel doitBPanel = new JPanel ();
	
	
	// Instanzvariablen
	
	private String kontonummer;
	
	private String kontoinhaber;
	
	private int kontostand;
	
	private int zaehler=0;

	
	
	// Konstruktoren
	Bankk( String ktoNummer, String ktoInhaber, int start )
		{
		setTitle ("Bannkkonto");
		setLayout( new FlowLayout() );

 		kontonummer = ktoNummer;
		kontoinhaber = ktoInhaber;
		kontostand = start;
		
		
		add( kopfLabel );
		
		 // den Panels Komponenten hinzufügen
		kopfPanel.add(kopfLabel);
		kNamePanel.add(kNameLabel);
		kNamePanel.add(kName);
		kNrPanel.add(kNrLabel);
		kNrPanel.add(kNr);
		einzahlungPanel.add(einzahlungLabel);
		einzahlungPanel.add(einzahlung);
		auszahlungPanel.add(auszahlungLabel);
		auszahlungPanel.add(auszahlung);
		kstandBPanel.add(kstandB);
		kstandBPanel.add(kstand);
		doitBPanel.add(doitB);
		
	    // dem Frame Panels hinzufügen
		add (kopfPanel);
		add (kNamePanel);
		add (einzahlungPanel);
		add (auszahlungPanel);
		add (kNrPanel);
		add (kstandBPanel);
		add (doitBPanel);
		
		kstandB.setActionCommand("kstand");
		doitB.setActionCommand("doit");
		
		
		kstandB.addActionListener(this);
		doitB.addActionListener(this);
		kstand.setEditable(false);
		setSize( 360, 300 );
		setVisible(true);

				
		 setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		}
	

	// Methoden
	
	public void actionPerformed( ActionEvent evt) 
	{
		
		String BaNr="", Name="";
		int AnfangB=0;
		Bankk newKunde = null;
		String tempAktuellK = null;
		int tempeinzahlung ;
		int tempauszahlung;
		
		//neue Kundenkonto erstellen
	if  ( evt.getActionCommand().equals("doit") && (! kName.getText().equals("")) && (! kNr.getText().equals("")) && (! einzahlung.getText().equals("")) )
		{
		AnfangB = Integer.parseInt(einzahlung.getText());
		newKunde = new Bankk (BaNr,Name,AnfangB);
		DBAbfrage abfrage = null;
//		abfrage.nueKunde(7, kName.getText());
		
		}
	
	else if (evt.getActionCommand().equals("doit") && (! einzahlung.getText().equals("")) )
		{
		tempeinzahlung=Integer.parseInt(einzahlung.getText());
		verarbeiteEinzahlung(tempeinzahlung);
		}
	
	else if (evt.getActionCommand().equals("doit") && (! auszahlung.getText().equals("")) )
		{
		tempauszahlung=Integer.parseInt(auszahlung.getText());
		verarbeiteAuszahlung(tempauszahlung);
		}

	else if (evt.getActionCommand().equals("kstand") ) 
		tempAktuellK =("" + aktuellerKontostand());
		kstand.setText(tempAktuellK);
		
		
		
	}
	
	private void nueKunde() {
		// TODO Auto-generated method stub
		
	}


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

public class BankkontoGUI {

	public static void main(String[] args) {
		
		DBVerbindung con = new DBVerbindung("bankkonto","root","");
		con.erstelleVerbindung();
		con.holenDaten();
		
		DBAbfrage ab = new DBAbfrage();
		ab.holeDaten();
		
		ab.holeInfo("omar");
		
//		ab.aendereIBAN("DE7Z893038303883", 0);
//		
//		ab.holeInfo("walid");
		
//	ab.neuKonto(5, "73847834", 400000, 6);

//		try 
//		{
//			Class.forName(treiber);
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
		String BaNr="", Name="";
		int AnfangB=0;
		
		Bankk konto;
		konto  = new Bankk (BaNr,Name,AnfangB);

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
//		konto  = new Bankk (BaNr,Name,AnfangB);
//		
//		konto.anzeigen();
		
	}
}
