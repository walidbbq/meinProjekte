import java.util.Arrays;
import java.util.Comparator;

class Tier {
	int gewicht;

	public Tier(int gewicht) {
		super();
		this.gewicht = gewicht;
	}
	
	
	@Override
	public String toString () {
		return "Tier: " + gewicht; 
	}
}

public class CompartorMitAnynomeKlasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tier [] tiere = {new Tier(12), new Tier(10), new Tier (11) };
		
		//Anynome Klasse
		Arrays.sort(tiere , new Comparator <Tier> () { public int compare(Tier o1 , Tier o2)
														{ return o1.gewicht - o2.gewicht; }    }    );
		System.out.println(Arrays.toString(tiere));
		
		
		// Comparator Mit Lambda
		Arrays.sort(tiere , (t1,t2) -> t1.gewicht -t2.gewicht );
		System.out.println(Arrays.toString(tiere));
	}
}

