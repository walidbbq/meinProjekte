package Aufgabe1;

import java.io.*;

	
public class untersuchen {

	public static void main(String[] args) {

		
		String Eingabe = "";
		int Ganzzahl = 0;
		double Gleitzahl = 0.0;
		
		try {
		Eingabe = (new BufferedReader(new
		InputStreamReader(System.in))).readLine();
		}
		catch(Exception ex) {
		System.out.println(ex.toString());
		}
		try {
		Ganzzahl = Integer.parseInt(Eingabe);
		}
		catch(Exception ex) {
		System.out.println(ex.toString());
		}
		try {
		Gleitzahl = Double.parseDouble(Eingabe);
		}
		catch(Exception ex) {
		System.out.println(ex.toString());
		}
		System.out.println(Eingabe);
		System.out.println(Ganzzahl);
		System.out.println(Gleitzahl);
		}
		}

	


