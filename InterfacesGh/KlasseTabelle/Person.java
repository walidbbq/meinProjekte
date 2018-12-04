
public class Person {

	private String nachname;
	private String vorname;
	private String telefonnummer;
	
	Person () {}

	public Person(String nachname, String vorname, String telefonnummer) {
		super();
		this.nachname = nachname;
		this.vorname = vorname;
		this.telefonnummer = telefonnummer;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	
	

	
	
	@Override
	public String toString() {
		return "Person [nachname=" + nachname + ", vorname=" + vorname + ", telefonnummer=" + telefonnummer + "]";
	}

	@Override
	public boolean equals (Object obj) {
		if (!(obj instanceof Person))
		{
			return false;
		}
		Person pr = (Person) obj;
		if ( (this.nachname == pr.nachname) && (this.vorname==pr.vorname) )
			return true;

		return false;
	}
	
	
	@Override
	public int hashCode() {
		return vorname.length() * nachname.length();
		
	}
	
}
	
