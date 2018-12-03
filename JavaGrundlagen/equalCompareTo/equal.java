
import java.util.Arrays;
import java.util.Comparator;

class Hantel implements Comparable <Hantel>, Comparator<Hantel> {
	int gewicht;
	
	public Hantel () {
		
	}
	
	public Hantel (int gewicht) {
		this.gewicht=gewicht;
	}
	
	
	
	@Override
	public boolean equals (Object obj) {
		
		if (!(obj instanceof Hantel) ) {
			return false;
		}
		
		else {
			Hantel that = (Hantel)obj ;
			if (this.gewicht==(that.gewicht))
//				if (this.gewicht==((Hantel)obj).gewicht)
			{
				return true;

			}
		}
		return false;

	}



	@Override
	public int compareTo(Hantel other) {
		
//		if (this.gewicht == that.gewicht) {
//			return 0;
//		}
//		if (this.gewicht > that.gewicht) {
//			// this.gewicht = 9.7; that.gewicht = 4
//			return 1;
//		}
//		if (this.gewicht < that.gewicht) {
//			// this.gewicht = 4.7; that.gewicht = 9
//			return -1;
//		}
//		return 0;
//		}
		// TODO Auto-generated method stub
		return this.gewicht - other.gewicht;
	}
	
	
	
	
	@Override
	public String toString () {
		return "" + this.gewicht;
		
	}



	@Override
	public int compare(Hantel h1, Hantel h2) {
		// TODO Auto-generated method stub
		 return h1.gewicht - h2.gewicht;
	}
	
}


public class equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hantel h = new Hantel (5);
		Hantel h2 = new Hantel (5);
		Hantel h3 = new Hantel (6);
		Hantel h4 = new Hantel(9);
		Hantel h5 = new Hantel (1);
//		Object obj = new Object();
		
//		System.out.println((h.equals(h2)));
		
		
		
		Hantel [] hantel = {h,h2,h3,h4,h5};
		Hantel [] ArrayComp = {h,h2,h3,h4,h5};

		
//		System.out.println( "vor Sortierung" + 
//				Arrays.toString(hantel));
//		
		
//		System.out.println(hantel [0].gewicht);
		
		Arrays.sort(hantel);
		Arrays.sort(ArrayComp, new Hantel());
		
		//Über For Schleife Array ausgeben
//		for (Hantel han :hantel) {
//			System.out.println(han.gewicht);
//		}
		
		
		System.out.println(Arrays.toString(hantel));
		System.out.println(Arrays.toString(ArrayComp));
//		System.out.println(h.gewicht);
		
		
//		String[] array = new String[] {"John", "Mary", "Bob"};
//		System.out.println(Arrays.toString(array));

	}

}
