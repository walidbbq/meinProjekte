
public class Schiff {

	String farbe;
	
	Schiff (String farbe) {
		this.farbe = farbe;
	}
	
	
	
	@Override
	public String toString() {
		
		return "Schiff " + farbe;
		
	}
	
	@Override
	public boolean equals (Object other) {
		
		if (! (other instanceof Schiff) ) {
			return false;
		}
		
		else {
			Schiff cast = (Schiff) other;
			if (this.farbe == cast.farbe) {
				return true;
			}
		}
		return false;
		
	}
	
	
	
	
}
