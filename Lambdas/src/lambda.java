
interface LX {
	int methodL(int a, int b);
}

public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LX lambdaLX = (a,b) -> {int c = a + b ; return c;};
		
		int x = lambdaLX.methodL(3, 4);
		
		System.out.println(x);
			
		}

	}


