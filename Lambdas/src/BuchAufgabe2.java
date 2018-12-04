import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Buch implements Comparable <Buch> {
	private String vornamAutor;
	private String nachnameAutor;
	private String titel;
	private int seitenZahl;
	
	
	
	
	public Buch () {
		
	}
	
	
	public Buch(String vornamAutor, String nachnameAutor, String titel, int seitenZahl) {
		super();
		this.vornamAutor = vornamAutor;
		this.nachnameAutor = nachnameAutor;
		this.titel = titel;
		this.seitenZahl = seitenZahl;
	}
	
	public String getVornamAutor() {
		return vornamAutor;	
	}
	public void setVornamAutor(String vornamAutor) {
		this.vornamAutor = vornamAutor;
	}
	public String getNachnameAutor() {
		return nachnameAutor;
	}
	public void setNachnameAutor(String nachnameAutor) {
		this.nachnameAutor = nachnameAutor;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public int getSeitenZahl() {
		return seitenZahl;
	}
	public void setSeitenZahl(int seitenZahl) {
		this.seitenZahl = seitenZahl;
	}
	
	@Override
	public  String toString () {
		return getVornamAutor()  + " " + getNachnameAutor() + " " + getTitel() + " " + getSeitenZahl() ;
	}


	@Override
	public int compareTo(Buch b1) {
		
		if (this.nachnameAutor.equals(b1.nachnameAutor)) {
			return this.titel.compareTo(b1.titel);
		}
			
		
		return this.nachnameAutor.compareTo(b1.nachnameAutor);
	}
	
	@Override 
	
	public boolean equals (Object obj) {
		
		if (! (obj instanceof Buch) )
			return false;
		Buch b = (Buch) obj;
		if ( (this.getVornamAutor().equals(b.getVornamAutor()) )&& 
				(this.getNachnameAutor().equals(b.getNachnameAutor()) ) &&
						(this.getTitel().equals(b.getTitel()) ) &&
						(this.getSeitenZahl()==b.getSeitenZahl())  )
				return true;
		
		return false;
	}
	
}



public class BuchAufgabe2 {

	public static void main(String[] args) {
	
		
		Buch b1 = new Buch ("Jamal" , "cao" , "bogo" , 500);
		Buch b2 = new Buch ("Jamal" , "bao" , "dogo" , 340);
		Buch b5 = new Buch ("Jamal" , "cao" , "aogo" , 600);
		Buch b3 = new Buch ("Souso", "cxxx", "axxx", 400);
		Buch b4 = new Buch ("bouso", "cxxx", "bxxx", 180);
		
		
		Buch [] arr = {b1, b2, b3,b4,b5};
		
		ArrayList <Buch> lb= new ArrayList < > ();
		lb.add(b1);
		lb.add(b2);
		lb.add(b3);
		lb.add(b4);
		lb.add(b5);
		
		Arrays.sort(arr);
		
		Collections.sort(lb);
		System.out.println("Aus Comparable: " +lb );
		Collections.sort(lb, new Comparator <Buch> () {

			@Override
			public int compare(Buch b1, Buch b2) {
				if (b1.getNachnameAutor().equals(b2.getNachnameAutor())) {
				return b1.getSeitenZahl() - b2.getSeitenZahl();
				}
			return b1.getNachnameAutor().compareTo(b2.getNachnameAutor());
			}   
		});
		
		//Ab java 8 lb
		Collections.sort(lb,(  o1,  o2) -> { if (o1.getNachnameAutor().equals(o2.getNachnameAutor()) )
														return o1.getSeitenZahl() - o2.getSeitenZahl();
																return o1.getNachnameAutor().compareTo(o2.getNachnameAutor());
																
																
		} );
		
		Comparator<Buch> c = new Comparator<Buch>() 
        { @Override
            public int compare(Buch u1, Buch u2) 
            { 
   
        	return u2.compareTo(u2);
        			
        			
            } 
        };
        
        
       int i= Collections.binarySearch(lb, new Buch ("bouso", "cxxx", "bxxx", 180), c);
//		System.out.println(Arrays.toString(arr));
		
//		System.out.println("Aus Copmparator: " + lb);
		System.out.println(i);
		
	}

}
