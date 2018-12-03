package U14;

import java.awt.Point;

public class aequivalente {
	
public static void main (String [] args ) {
		
		Point a=new Point(3,8);
		Point b = new Point(3,8);
		
//		String strA=a.toString();
//		String strB=b.toString();
		
		System.out.println("Wert X1: " +"\n" +a.x);
		System.out.println("Wert X2 " +"\n" +b.x);
		
		System.out.println("Wert Y1: " +"\n" +a.y);
		System.out.println("Wert Y2: " +"\n" +b.y);
//
//	    System.out.println(strA);
//	    System.out.println(strB);
	    
	    if (a.equals(b))
	    	System.out.println("Die Koordinaten der beiden Punkte sind gleich: " + "\n"+ a + b);
		
		

}

}