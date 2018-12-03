package Ausnahmen;

import java.util.Scanner;

public class ExceptionBeispiel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zahl=100;
		double erg;
//		Scanner scn = new Scanner (System.in);
		
		for (int i=10 ; i>=-10; i-- ) {
			
			try {
				erg=zahl/i;
				System.out.println(erg);
			}
			
			catch (ArithmeticException e)
			{
				System.out.println("Division duch null ist nicht m�glich!");
				System.out.println("Urscahe: " + e.getMessage());
				System.out.println("AusnahmeTyp: " + e.toString());
				//e.printStackTrace();
			}

		}

	}
	

}
