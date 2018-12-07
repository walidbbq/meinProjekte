

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Random;

	public class javaThread {
		static int count =0;
		static  List <Integer> arr=new ArrayList<>();


		public static void main(String[] args) {
			
		// TODO Auto-generated method stub
		Thread lamth = new Thread(() -> {
			;
			for (int i = 0; i <= 1000; i++) {
				Random rn = new Random();
				int zahl = rn.nextInt(100) + 1;
				arr.add(zahl);
			}
			System.out.println("Aus Thread: " + arr.size() + arr);
		});
//			  	
//		    
			  	lamth.start();
			  	
			  	try {
			  		lamth.join();
			  	}
			  	catch (InterruptedException ie) {
			  		ie.printStackTrace();
			  	}
		
			
			  	System.out.println();
	//
			  	
	System.out.println("Aus der For Schleife");			  
			for (Integer str : arr) {
				System.out.println( str  );
			}
		System.out.println(arr.size());


			

			
//			arr.forEach((i)->System.out.println(i));
//			


	}

			
		}




