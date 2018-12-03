import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class AnhanFragen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1,2

		ArrayList <String> alo =  new ArrayList <>();
		
//		alo.add(new String("A"));
//		alo.add(new Integer(1));
//		alo.add(new Double (12.4));
		
		alo.add("A");
		alo.add("a");
		alo.add("C");
		alo.add("B");
		alo.add("b");
		
		Collections.sort(alo);
		
		System.out.println(alo);
		
		//3 mit Klasse Test
		
		ArrayList <Test> tst= new ArrayList<>();
		tst.add(new Test(4));
		tst.add(new Test(5));
		tst.add(new Test(6));
		tst.add(new Test(3));
		
		Collections.sort(tst);
		
		System.out.println(tst);
		
		//4
		ArrayList <Integer> ari = new ArrayList<>();
		ari.add(5);
		ari.add(new Integer(6));
		ari.add(new Integer(7));
		ari.add(new Integer ("3"));
		ari.add(new Integer ("9"));
		
		Collections.sort(ari);
		System.out.println(Collections.binarySearch(ari,56));
		
		//5 for-schleife 1
		ArrayList <String> alist = new ArrayList<>();
		HashSet <String>hset = new HashSet<>(alist);
		
		alist.add("A");
		alist.add("B");
		alist.add("D");
		alist.add("C");
		
		for (int i=0; i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		
		System.out.println("==============");
		
		for (String string: hset) {
			System.out.println(string + " ");
		}
		
//		for (int i=0 ; i<hset.size(); i++) {
//			System.out.println(hset.get(i));
		
//		int i0 = ari.get(0);
//		int i1 = ari.get(1);
//		int i2 = ari.get(2);
//		
		
		
//		Integer i0 = ari.get(0);
//		Integer i1 = ari.get(1);
//		Integer i2 = ari.get(2);
//		Integer i4 = ari.get(4);
		
//		System.out.println(i0 + " " + i1 + " " + i2);
		
//		System.out.println(ari);
		
	}

}


class Test implements Comparable <Test> {
	
	
	int nr ;
	
	Test (int nr) {
		this.nr=nr;
	}
	
	@Override
	public String toString() {
		return "" + nr;
	}
	
	
//	public boolean equals (Object obj) {
//		
//		Test t2 = (Test) obj;
//		return this.nr==t2.nr;
//		
//			}
	
//	@Override
//	public boolean equals (Object obj) {
//		Test t2 = (Test) obj;
//		if (t2.nr==this.nr)
//			return true;
//		
//		return false;
//	}

@Override
public int compareTo(Test other) {
	// TODO Auto-generated method stub
	return this.nr-other.nr;
}
}
