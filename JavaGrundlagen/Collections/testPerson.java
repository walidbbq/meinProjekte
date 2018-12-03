import java.util.ArrayList;
import java.util.Collections;

public class testPerson   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Person> personen = new ArrayList <Person> ();
		
		personen.add( new Person("Sigmund", "Freud"));
		personen.add( new Person("Ernst", "Jünger"));
		personen.add( new Person("Thomas", "Bernhard"));
		personen.add( new Person("Max", "Weber"));
		personen.add( new Person("Paula", "Weber"));
		personen.add( new Person("Augusta", "Weber"));
		personen.add( new Person("Augusta", "Beber"));
		personen.add( new Person("Stefan", "George"));
		
		System.out.println(personen);
		Collections.sort(personen);
		System.out.println(personen);

		
		boolean c = personen.contains(new Person ("Ernst", "Jünger"));
		System.out.println(c);
		
		int c2 = Collections.binarySearch(personen, new Person ("Ernst", "Jünger"));
		System.out.println(c2);
		
		
	}

}
