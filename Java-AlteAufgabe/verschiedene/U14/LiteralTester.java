package U14;

public class LiteralTester {
	

	  public static void main ( String[] args )
	  {
	    int objektanzahl=0;

	    String str1, str2, str3, str4;              // str1, str2, str3, str4 sind Referenzen, die auf ein Objekt verweisen.
	                                                // Die Objekte existieren noch nicht.
	    str1 = "Bo, die Katze";         // erzeugt ein Objekt vom Typ String
	    str2 = "Bo, die Katze";                                // Die Refernez str2 zeigt auf das gleiche Objekt, wie die Referenz str1.
	    str3 = new String("Fred, der Hund");        
	    str4 = new String("Fred, der Hund");        // Zwei verschiedene Objekte mit dem gleichen Inhalt werden erzeugt. 
	    
	    
	    	if (str1==str2) {
	    		System.out.println("str1 und str2 verweisen auf das gleiche Objekt");
	    	objektanzahl=objektanzahl+1;
	    	}
	    	
	    	else {
	    		System.out.println("str1 und str2 verweisen nicht auf das gleiche Objekt");
		    	objektanzahl=objektanzahl+2;
	    	}
	    	
	    	if (str3==str4) {
	    		
	    		System.out.println("str3 und str4 verweisen auf das gleiche Objekt");
	    		objektanzahl=objektanzahl+1;
	    	}
	    	
	    	else {
	    		System.out.println("str3 und str4 verweisen nicht auf das gleche Objekt");
	    		objektanzahl=objektanzahl+2;
	    	}
	    	
	    	System.out.println("Es wurde " + objektanzahl + " Objekte erzeugt");
	    		
}
}
