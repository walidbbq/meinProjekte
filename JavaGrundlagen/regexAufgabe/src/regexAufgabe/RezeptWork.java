package regexAufgabe;

import java.util.List;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class RezeptWork {

	public static void main(String[] args) {

		
		String pfad = "C:\\Users\\ghani\\git\\meinProjekte\\JavaGrundlagen\\regexAufgabe\\Rezepte.txt";
		String line=null;
		String [] splitZeichen=null;
		
		
		
		Rezept rezArr []= new Rezept [5];
		
		try (BufferedReader bf1 = new BufferedReader (new FileReader(pfad)) ) {
			
			int x =0;
			int i = 0;
			while ( (line = bf1.readLine()) !=null)
			{
			splitZeichen =line.split(".[^a-z A-Z üö /-]+");
			
//			System.out.println(Arrays.toString(splitZeichen));
			
//			.[^a-zA-Züö-]+
			
			Rezept r = new Rezept();
			r.zutaten=new ArrayList <> ();

			r.name=splitZeichen[x];
				
				for (int y = x+1 ; y<splitZeichen.length ;y++ ) {
					r.zutaten.add(splitZeichen[y]);
			}
				

			
			System.out.println(r.name +" " + r.zutaten);
			
			rezArr[i]=r;
			i++;

			}
//			System.out.println(Arrays.toString(rezArr));
			
//			System.out.println(r.name +" " + r.zutaten);

		}
				catch (IOException e) {
					e.printStackTrace();
				}
				
	}

}
