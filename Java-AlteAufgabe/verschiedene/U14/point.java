package U14;

import java.awt.Point;

public class point {
	
	public static void main (String [] args ) {
		
		Point a=new Point(3,2);
		Point b = new Point(5,7);
		
		String strA=a.toString();
		String strB=b.toString();
		
		System.out.println("Wert X1: " +"\n" +a.x);
		System.out.println("Wert X2 " +"\n" +b.x);
		
		System.out.println("Wert Y1: " +"\n" +a.y);
		System.out.println("Wert Y2: " +"\n" +b.y);

	    System.out.println(strA);
	    System.out.println(strB);
	    
		
		
	}
}
