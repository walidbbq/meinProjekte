import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class aufgabeTest {

	
	public static void main(String[] args) {
//		String x = "Text";
//		x=x.replace("t", "x");
//		System.out.println(x);
//		
//		
//		String x1 = "Text";
//		x1=x1.concat("t");
//		System.out.println(x1);
//		
//		
//		String x2 = "Text";
//		x2=x2.substring(2,4);
//		System.out.println(x2);
//		
//		String x3 = "Text";
//		x3 = x3.substring(2,3).concat("Text").toLowerCase();
//		System.out.println(x3);
//		
//		String x4 = "Text";
//		String x5 = "text";
//		System.out.println(x4.equalsIgnoreCase(x5));
//		
//		String x6 = "Text";
//		String x7 = "text";
//		System.out.println(x6.equals(x7));
//		
//		String x8 = " Text ";
//		System.out.println(x8.length());
//		String x9= x8.trim();
//		System.out.println(x9.length());
//		
//		String text2 = "Reismilch";
//		System.out.println(text2.endsWith("milch"));
//		System.out.println(text2.startsWith("reis"));
		
		



		// Aufgabe 2
//		String pattern = "[\\d]+[,\\d]*";
//		String str ="„12 Mal die Woche, 1,7 Mal pro Tag, aber mindestens 1 Mal am Morgen“;";
//		Pattern pat = Pattern.compile(pattern);
//		Matcher mat = pat.matcher(str);
//		
//		while (mat.find()) {
//			System.out.println(mat.group());
//		}
		
//		
//		String pattern = "[a-zA-ZüößÜÖ]+";
//		String str ="„12 Mal die Woche, 1,7 Mal pro Tag, aber mindestens 1 Mal am Morgen“;";
//		Pattern pat = Pattern.compile(pattern);
//		Matcher mat = pat.matcher(str);
//				
//		while (mat.find()) {
//		System.out.print(mat.group() + " ");
//	}
		String pattern = "[A-Z]{2}+";
		String str = "DEr letzte GRosse GEHEimniskrämer dieseR NAtion";
		Pattern pat = Pattern.compile(pattern);
		Matcher mat = pat.matcher(str);
		
		while (mat.find()) {
		System.out.print(mat.group() + " ");
	}




	}
}
