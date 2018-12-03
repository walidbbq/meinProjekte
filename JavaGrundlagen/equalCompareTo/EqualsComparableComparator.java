import java.util.Arrays;
import java.util.Comparator;

class Chatbot implements Comparable <Chatbot> {
	
	int redselig;
	boolean empathisch;
	
	Chatbot (int redselig, boolean empathisch) {
		this.redselig=redselig;
		this.empathisch=empathisch;
	}
	
	@Override
	public boolean equals (Object obj) {
		if (!(obj instanceof Chatbot)) {
			return false;
		}
		
		else
		{
			Chatbot that = (Chatbot) obj;
			if ( (this.redselig == that.redselig) &&
				(this.empathisch == that.empathisch) )
				{
				return true;
				}
		}
		
		return false;
	}

	@Override
	public int compareTo(Chatbot that) {
		// TODO Auto-generated method stub
		
		if (redselig == that.redselig) {
			if (empathisch == that.empathisch)
				return 0;
			if (empathisch)
				return -1;
//			if (!empathisch)
				return 1;
			
		}
		
		
		return redselig - that.redselig ;
		
		
		
	}
	
	

	@Override
	public String toString() {
		return "Chatbot [redselig=" + redselig + ", empathisch=" + empathisch + "]";
	}
	

	
	
}

class SortierBotClass implements Comparator<Chatbot> {

	@Override
	public int compare(Chatbot o1, Chatbot o2) {
		
		
		if (o1.empathisch==o2.empathisch) {
			return o1.redselig- o2.redselig;
		}
		
		if (!o1.empathisch) {
			return 1 ;
		}
		return 1;
		
//		2.Möglichkeit
//		if (o1.empathisch== o2.empathisch) {
//		int erg = o1.empathisch==true? -1 : 1;
//		
//		if (erg==-1)
//			return -1;
//		if (erg==1)
//			return 1;
//		}
//		return o1.redselig - o2.redselig;

		
		//1.Möglichkeit
//		if (o1.empathisch == o2.empathisch )
//			return o1.redselig - o2.redselig;
//		if (!o1.empathisch) { 
//			return 1;
//		}
		
		
	}
	
	
	
}






public class EqualsComparableComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chatbot cb1 = new Chatbot (5,true);
		Chatbot cb2 = new Chatbot (7,false);
		Chatbot cb3 = new Chatbot (3,true);
		Chatbot cb4 = new Chatbot (3,false);
		
		Chatbot [] ch = {cb1,cb2,cb3,cb4};
		
		System.out.println(cb1.equals(cb2));
		System.out.println(cb3.equals(cb4));
		
		Arrays.sort(ch);
		System.out.println("Sortiern Nach Comparable: " + 
		Arrays.toString(ch) );
		
		Arrays.sort(ch, new SortierBotClass());
		System.out.println("Sortieren Nach Comparator: " +
		Arrays.toString(ch));
		
		
			
	}

	
}



