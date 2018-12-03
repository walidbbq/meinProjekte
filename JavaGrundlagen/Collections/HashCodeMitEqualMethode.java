import java.util.HashSet;
import java.util.Set;

class Klappentext {
	String beschreibung;
	int nummer;
	
	
	
	
	public Klappentext(String beschreibung) {
		super();
		this.beschreibung = beschreibung;
	}
	
	




	public Klappentext(String beschreibung, int nummer) {
		super();
		this.beschreibung = beschreibung;
		this.nummer = nummer;
	}






	@Override
	public boolean equals (Object obj) {
		Klappentext k2 = (Klappentext)obj;
		if (this.nummer==k2.nummer)
			return true;
		
		return false;
		
	}




	@Override
	public String toString() {
		return  beschreibung + " " + nummer ;
	}
	
	
	
	@Override
	public int hashCode() {
		return nummer;
		
	}
}




public class HashCodeMitEqualMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Klappentext t1= new Klappentext("test");
		t1.nummer=10;
		Set <Klappentext> s= new HashSet();
		s.add(new Klappentext("Walid",5));
		s.add(new Klappentext("Walid",6));
		s.add(new Klappentext("Wissam",7));
		s.add(new Klappentext("Jamal",8));
		s.add(new Klappentext("Mohammad",9));
		s.add(new Klappentext ("Ahmed",6));
		s.add(new Klappentext ("Jamal"));
		s.add(t1);
		
		Set <String> str = new HashSet ();
		str.add("Kora");
		str.add("DW");
		str.add("RT");
		str.add("RT");
		System.out.println(str);
		boolean b2 =str.contains("Kora");
		System.out.println(b2);
//		Klappentext k1 = new Klappentext();
//		Klappentext k2 = new Klappentext();

		
//		k1.beschreibung="Walid";
//		k2.beschreibung="Walid";
		
//		System.out.println(k1.equals(k2));
		Klappentext t2 = new Klappentext ("test");
		t2.nummer=10;
		
		boolean b = s.contains( new Klappentext("Jamal"));
		
		System.out.println(s);

		System.out.println(b);
	}

}
