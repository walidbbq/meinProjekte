
public class ThreadsStarten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Anonyeme Klasse
		Thread ankth = new Thread (new Runnable() {
			
			Testth tth = new Testth () ;
			@Override 
			public void run () {
				tth.laufMethode();}
		}
			);
		ankth.start();

		
		//Lambda Klasse
		Thread lambdath = new Thread (()-> {Testth lth = new Testth(); lth.laufMethode();});
		
			lambdath.start();
			
		//ThreadA Klasse
			ThreadA th = new ThreadA ();
			th.start();
			
			
		}
	}



class Testth {	
	
	 void laufMethode () {
		for (int i=0; i<=10 ; i++ ) {
			System.out.println(i);
		}	
	}
	
}


class ThreadA extends Thread {
	
	Testth lam = new Testth();
	@Override
	public void run () {
		lam.laufMethode();
	}
}
