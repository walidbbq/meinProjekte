import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HaschMapTesten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String,Integer> hm = new HashMap<>() ;
		hm.put("A", 1);
		hm.put("B", 3);
		hm.put("C",4);
		
		System.out.println(hm);
		
		//Achtung: Key wird nicht hinzugefügt,
		//aber Value von B verändert.
		hm.put("B", 2);
		System.out.println(hm);
		
	
		System.out.println(hm.get("B"));
		
		hm.remove("C");
		System.out.println(hm);
		
		hm.replace("A", -1);
		System.out.println(hm);
		
		System.out.println(hm.get("A"));
		
		System.out.println(hm.containsKey("A"));
		
		System.out.println(hm.containsValue(-1));
		
		HashSet <String> hs= new HashSet <> (hm.keySet());
		System.out.println(hs);
		
		ArrayList <Integer> al = new ArrayList <> (hm.values());
		System.out.println(al);
	}

}
