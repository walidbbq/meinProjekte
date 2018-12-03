
public class Person implements Comparable<Person> {

	private String vorname;
	private String nachname;
	
	Person (String vorname , String nachname) {
		this.vorname=vorname;
		this.nachname=nachname;
	}
	
	public String getVorname () {
		return this.vorname;
	}
	
	public String getNachname () {
		return this.nachname;
	}
	
	@Override
	public String toString() {
		return ("Vonrname: " + this.vorname + " Nachname:" + this.nachname);
		
	}
	
	
	@Override
	public boolean equals(Object o) {
		
		if (! (o instanceof Person) ) {
			return false;
		}
		
		else 
		{
			Person p = (Person) o ;
			if ( (this.vorname == p.vorname) && 
				 (this.nachname==p.nachname)  ){
					 return true;
				 }
				 

		}
		
		return false;

	}

	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		int sortvorname= this.vorname.compareTo(p.vorname);
		
		if (sortvorname==0) {
			return this.nachname.compareTo(p.nachname);
		}
		return sortvorname;
	}

//	@Override
//	public int compareTo(Person that) {	
//		
//		if (this.vorname.equals(that.vorname)) {
//			return 0;
//		}
////		return this.vorname - that.vorname;
//		
//		return 0;
//	}
}
