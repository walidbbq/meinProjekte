package U14;

import java.awt.Point;

public class PointObjekteZumZweiten {

	public static void main(String[] args) {

		Point pt1 = new Point (10,10);
		Point pt2 =new Point (30,30);
		
		int flaeche=Math.abs( (pt1.x - pt2.x) * (pt1.y-pt2.y) );
		
		System.out.println("Die Fläche beträgt: " +flaeche);
		
		Point PtAlias= pt1;
		if (PtAlias == pt1)
			System.out.println("Pt1 und PtAlias verweisen auf desselbe Objekt! ");
		else 
			System.out.println("Pt1 und PtAlias verweisen nicht auf desselbe Objekt! -_-");
		
		System.out.println("Point pt1 vorher: " + pt1);
		System.out.println("Point ptAlias vorher: " + PtAlias);
		
		pt1.x= pt1.x * 2 ;
		pt1.y= pt1.y * 2 ;
		
		System.out.println("Point pt1 nachher: " + pt1);
		System.out.println("Point PtAlias nachher: " + PtAlias);

			
		
		
	}
}
		
	
