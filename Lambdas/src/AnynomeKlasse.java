
interface XI {
	void methodA();
}
	
public class AnynomeKlasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XI xi1 = new XI() {
			public void methodA() {
				System.out.println("Implementierung methodA");
			}

			
		};
		xi1.methodA();
	}



}
