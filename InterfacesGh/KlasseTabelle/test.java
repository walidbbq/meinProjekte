import java.util.Random;

public class test {

	public static void main(String[] args) {
	
		Random wuerfel = new Random();
		int augenZahl;

		for (int i=0; i<10; i++){
			augenZahl = 1 + wuerfel.nextInt(6);
			System.out.println(augenZahl);
			

	}

}
}
