package Aufgaben;


 class HalloObjektAg1 {

		
		String mitteilung;
		int laenge;
        int mitZeichen;
		
		HalloObjektAg1(String mitteilung){

		this.mitteilung=mitteilung;
		
		}
				
		
		 void sprich () { 	 
			System.out.println(mitteilung);
			}
		 
		 
		 int laenge () {
			 System.out.println(mitteilung.length());
			 return laenge;
		 }
                 
                 
                     int laZahl (){
                     int length = String.valueOf(mitteilung).length();
                     for (int i=0; i< length; i++)
                          sprich();
                          return 0 ;
                 }
                 
	
	}


	 class HalloTester 
	{	
		public static void main(String[] args) {
			
			HalloObjektAg1 objekt1 = new HalloObjektAg1("venus");
			HalloObjektAg1 objekt2= new HalloObjektAg1("markus");
			HalloObjektAg1 objekt3 = new HalloObjektAg1("erde");
     
                       //objekt1.mitZeichen();
                       
                       objekt1.laZahl();
			
			objekt1.sprich();
			objekt2.sprich ();
			objekt3.sprich();
					
		}
		

	}


