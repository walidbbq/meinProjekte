
public class testThread  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Thread a = 	new Thread (new Runnable() {
			
			@Override
			public void run () {
				
//				System.out.println("Test");
			}
			
			
				
			
		});
		a.start(); 
		
//		
//		Thread th1 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 1; i <= 1000; i++) {
//					System.out.println("aus th1 : " + i);
//				}
//			}
//		});		
//			
//		// ===
//		Thread th2 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 1; i <= 1000; i++) {
//					System.out.println("aus th2 : " + i);
//				}
//			}
//		});		
//		th1.start();	
//		th2.start();
//		
//		try {
//			th1.join();
//			th2.join();
//		} catch (InterruptedException ie) {
//			ie.printStackTrace();
//			}
//		
//		System.out.println("=== Hallo Aus Main ===");
//		
//		testThread tb = new testThread();
//		
//		Thread th3 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				tb.doSomething();
//			}
//		});	
//		th3.start();
//		
//	}
//	
//	public void doSomething() {
//		System.out.println("XXX");
//	}

	
//				Thread th = new MyThread("Sequenz");
//				th.start();
//			}
//
//		}
		class MyThread extends Thread {
			
			String x;
			MyThread(String x) {
				this.x = x;
			}	
			@Override
			public void run() {
//				System.out.println("run in Mythread");
//				System.out.println( this.x);
//				System.out.println("ok");
			}
		}
	
		new MyThread ("test").start();
		
		 new Thread (() -> { System.out.println("Lamda Thread"  );}).start();
	
		}
}
		
		

