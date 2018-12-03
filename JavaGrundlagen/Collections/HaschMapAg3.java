import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HaschMapAg3 {

	public static void main(String[] args) {


		HashMap <String, Integer > hm = new HashMap<>();
		
		hm.put("Mandy", 45);
		hm.put("Sandy", 22);
		hm.put("Candy", 34);
		hm.put("Dandy", 78);
		
		
		
		
		//Mit einer Schleife über die HashMap Iterieren
	
//		HashSet <String> hmTohsS = new HashSet <>(hm.keySet());
//		ArrayList <Integer> hmToarl = new ArrayList <>(hm.values());
//		
//		Object[] arr=hmToarl.toArray();
//		int i =0;
//		
//		for(String s : hmTohsS) {
//			for ( ; i<arr.length; ) {
//				System.out.println(s + " " + arr[i]);
//				i++;
//				break;
//			}
//		}
		
		for (String key : hm.keySet()) {
			
			System.out.println(key + " " + hm.get(key));
			
		}
		
		
		boolean ma= hm.containsKey("Mandy");
		System.out.println(ma);
		
		boolean Ta= hm.containsKey("Tandy");
		System.out.println(Ta);
	}

}
