
public class Person {
	private String vorname;
	private String nachname;
	
	public Person() { }
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person that = (Person) obj; // obj als Person casten
			// this mit that vergleichen
			if (this.vorname.equals(that.vorname) && this.nachname.equals(that.nachname)) {
				return true;
			}
		}
		return false;
	}
	
	public Person(String vorname, String nachname) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}	
	public String toString() {
		return vorname + " " + nachname;
	}
	
	
}
