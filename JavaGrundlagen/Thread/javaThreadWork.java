import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class javaThreadWork {
	static int count =0;
	static  List <Integer> arr=new ArrayList<>();


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		  	Thread lamth = new Thread (() -> {; for(int i =0; i<=1000; i++) {  
//			Random rn = new Random(); int zahl =rn.nextInt(100)+1 ;arr.add(zahl);  count=i; 
//			}
////		  		System.out.println(arr + " " + count);
//		  	} );
//		  	
//	    
		javaThreadWork jth = new javaThreadWork();

		
		Thread ano = new Thread ( new Runnable () {
	  		
		  	
	  		@Override
	  		public void run () {
	  			List <Integer> th =jth.arrayZufälligerZahlen();
	  			System.out.println("Aus Thread: " + th);


	  			}
	  		
	  		}); 
//	  	
//	  
//
	  	ano.start();
	  	
		
	
		
		List <Integer> aus=jth.arrayZufälligerZahlen();
		System.out.println("Aus dem main: "  + aus);
//
		  
//		  	int i =0;
//		for (Integer str : arr) {
//	
//			System.out.println(str);
//			i++;
//		}
//		
//		try {
//			ano.join();
//		}
//		catch (InterruptedException ie) {
//			ie.printStackTrace();
//		}
//		System.out.println("Count: " + " " + i);
		  	
//		lamth.start();
		

		
//		arr.forEach((i)->System.out.println(i));
//		


}


public List <Integer> arrayZufälligerZahlen () {
	for(int i =0; i<1000; i++) {  
			Random rn = new Random(); 
			int zahl =rn.nextInt(100)+1 ;
			arr.add(zahl);
			count=i;
				}
	return arr;
		
//			System.out.println(arr + " " + count);

		
	}
}
