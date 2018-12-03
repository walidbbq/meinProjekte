package Ausnahmen;
class MeineAusnahme extends java.lang.Throwable  {
	void ausgabe ()
	{
		System.out.println("\"Das ist leider nicht moeglich\"");
	}	
}



public class ExceptionBeispiel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			try {
				
				for (int i = 1 ; i<=100; i++) 
				{	
					if (i==50) throw new MeineAusnahme();
					System.out.println(i);	
				}
				
				}
			
			catch (MeineAusnahme m) {
				m.ausgabe();
			}


	}

}
