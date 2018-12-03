import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArraytoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		String [] arrays= {"Alpha", "Beta", "Gamma","Delta","Epsilon"};
			
		List <String> lists = Arrays.asList(arrays);

		System.out.println("Inhalte Lists: " + lists);
		System.out.println("Ihhalte arrays: " + Arrays.toString(arrays));
		
		//Veränderungen an List
		lists.set(0, "Zeta");
		System.out.println("Inhalte Lists: " + lists);
		System.out.println("Ihhalte arrays: " + Arrays.toString(arrays));
		
		//Veränderungen an Array
		arrays[1]= "Theta";
		System.out.println();System.out.println("Inhalte Lists: " + lists);
		System.out.println("Ihhalte arrays: " + Arrays.toString(arrays));
		
		
		// Achtung add und remove funktionierren nicht
		//Größe eines Arrays ist nicht dynamisch anpassbar!
		lists.add("Test");
		lists.remove(0);
		System.out.println("Inhalte Lists: " + lists);
//		System.out.println("Ihhalte arrays: " + Arrays.toString(arrays));
}
}
