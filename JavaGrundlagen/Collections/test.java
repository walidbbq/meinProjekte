import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ArrayList toArray Methode
		
		ArrayList <String> sList = new ArrayList <>();
		
		sList.add("Alpha");
		sList.add("Charlie");
		sList.add("Bravo");
			
		System.out.println("ArrayList: " + sList);
		
		//Umwandlung in Array
		Object [] objectArray = sList.toArray();
		System.out.println("Nach to Array: " + Arrays.toString(objectArray));
		
		String [] strArray = sList.toArray(new String [sList.size()]);
		System.out.println("toArray(String[]): " + Arrays.toString(strArray));
		
		//Sortieren mit Collections Sort
		Collections.sort(sList);
		System.out.println( "Collections List: " + sList );
		
		//Suche mit Binary Suche
		String s = "Bravo";
		int pos = Collections.binarySearch(sList, s);
		
		System.out.println("Idexpos. " + pos + " ; Wort : " + sList.get(pos));

		
		sList.set(1,"Super" );
		
		System.out.println("Idexpos. " + pos + " ; Wort : " + sList.get(pos));
		
		System.out.println( "Collections List: " + sList );

		
//		for (Object eintrag : objectArray) {
//			System.out.println(eintrag);
//		}
//		
//		
		
		
		
		
		//ArrayList von Klasse Schiff
//		ArrayList <Schiff> schiffe = new ArrayList<Schiff> ();
//		
//		Schiff s1 = new Schiff("blau");
//		Schiff s2 = new Schiff ("Rot");
//		Schiff s3 = new Schiff ("Grün");
//		
//		schiffe.add(s1);
//		schiffe.add(new Schiff("weiß"));
//		
//		for (Schiff schiff : schiffe ) {
//			System.out.println(schiff);
//		}
//		
//		boolean b1 = schiffe.contains(s1);
//		System.out.println(b1);
//		
//		boolean b2 = schiffe.contains(new Schiff("blue"));
//		System.out.println(b2);
//		
		
		//ArrayLists Operationen
		
//		ArrayList<String> list = new ArrayList<> ();
//		
//		list.add("Alpha") ; list.add("Beta") ; list.add("Gamma");
//		
//		System.out.println("Liste : " + list);
//		
//		list.add(2, "Zeta");
//		
//		System.out.println("Liste nach add" + list);
//		
//		String s1=list.set(2, "Alpha2");
//		
//		System.out.println("Liste nach set" + list) ;
//		System.out.println("Set Removed: " + s1);
//		
////		list.get(0);
//		System.out.println("Liste nach get: " + list.get(0));
//		
//		String s2=list.remove(0);
//		System.out.println("Remove index: " + s2);
//		
//		System.out.println("Liste nach remove: " + list );
//		
//		//Contain
//		System.out.println(list.contains("Beta"));
//		
//		//Size einer Liste
//		System.out.println(list.size());
//		
//		//Liste to String
//		String lto=list.toString();
//		System.out.println(lto);
//		
//		//Liste toArray
//		String arr[];
//		arr=list.toArray();
//		System.out.println("Liste toArray: " + list.toArray() );
//		
//		
	}

}
