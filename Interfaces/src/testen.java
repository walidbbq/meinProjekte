
import java.util.Arrays;

 class Bier implements Comparable {
  private String name;
  private String herkunft;
  private float inhalt;
  public Bier() {}
  public Bier(String name, String herkunft, float inhalt) {
    this.name = name;
    this.herkunft = herkunft;
    this.inhalt = inhalt;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getHerkunft() {
    return this.herkunft;
  }
  public void setHerkunft(String herkunft) {
    this.herkunft = herkunft;
  }
  public float getInhalt() {
    return this.inhalt;
  }
  public void setInhalt(float inhalt) {
    this.inhalt = inhalt;
  }
  
  @Override
  public String toString() {
    return this.name +  " aus "  + this.herkunft + " mit " + this.inhalt + " Litern ";
  }



  
  public int compareTo(Bier b) {
    if (b.getName() == null && this.getName() == null) {
      return 0;
    }
    if (this.getName() == null) {
      return 1;
    }
    if (b.getName() == null) {
      return -1;
    }
    return this.getName().compareTo(b.getName());
  }
//@Override
//public int compareTo(Object o) {
//	// TODO Auto-generated method stub
//	return 0;
//}
}


class testen {
	
	public static void main(String[] args) {
		
		Bier b = new Bier("koelsch", "koeln", 1); 
		
		System.out.println(b.toString());
		

	}
	
}