


// Aufgabe 1 - a 

interface IF01 {
	void test (String x);
}

interface IF02 {
	String concatStr (String x , String y);
}


interface IF03 {
	void testOutput();
		
}

interface IF04 {
	int methodX(String x);
}


interface XT {
	static int methodXT(String x ,IF04 y ) {
		return y.methodX(x);}
}

// class XT {
//	  static int methodXT(String x , IF04 y) {
//		return y.methodX(x);
//	}
//}



public class AnynymeKlasseLambdasAufgaben {

	public static void main(String[] args) {
		
		IF01 if1 = new IF01 () {
			
			public void test (String y) {

					System.out.println(y);
			}
		};
		
	if1.test("Hallo anynome Klasse! ");
	
	
	//Aufgabe 1 - b
	IF01 lambda= (str) ->  System.out.println(str); ;
	lambda.test("Hallo aus Lambda!");
	
	
	//Aufgab2 2
		IF02 if2 = (x,y) -> { String c = (x.concat(y));
		return c;
		 }; 
		String erg= if2.concatStr("Hallo World, #Concat# ", " Labmda!");
		System.out.println(erg);
		
	//Aufgabe 3 
		IF03 if3 = () -> System.out.println("Output");
		if3.testOutput();
		
	// Aufgabe 4 anonyme Klasse
		  int x = XT.methodXT ("Teststring", new IF04 () {
			
			@Override
			public int methodX(String x) {
				return x.length();
			}
			
			
		});
		  
			System.out.println(x);

	 //Aufgabe 4 Lambda
			int y = XT.methodXT("Teststring",  (str)-> { return str.length() ;}); 
			System.out.println(y);
		  

	}
	

	
	
}
