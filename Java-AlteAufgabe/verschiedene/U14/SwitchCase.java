package U14;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in) ;
		String zahl;
		System.out.println("Positive ganze Zahl") ;
		zahl=scan.nextLine() ;
		System.out.println() ;
		int i=zahl.length() ;
		while(i>=1){
//		System.out.println(zahl.substring(i-1,i));
		switch(zahl.substring(i-1,i))
		{
		case "0":
		System.out.print("Null") ;
		break;
		case "1":
		System.out.print("Eins") ;
		break;
		case "2":
		System.out.print("Zwei") ;
		break;
		case "3":
		System.out.print("Drei") ;
		break;
		case "4":
		System.out.print("Vier") ;
		break;
		case "5":
		System.out.print("Fuenf") ;
		break;
		case "6":
		System.out.print("Sechs") ;
		break;
		case "7":
		System.out.print("Sieben") ;
		break;
		case "8":
		System.out.print("Acht") ;
		break;
		case "9":
		System.out.print("Neun") ;
		break;
		}
		System.out.print(" ") ;
		
		System.out.println(i + "  " + (i-1));

		i--;

		}
	}

}
