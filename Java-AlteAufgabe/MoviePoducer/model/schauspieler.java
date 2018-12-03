package standardmaessig.model;

public class schauspieler {
	
    public String vorname;
	public String nachname;
	public int gehalt;
	public int erfahrung;
	public double erfolgsfaktor;
	
	public Genre genre;
	
//	public String genreName;
//	public int genreHype;
//	
	private Genre static  standardGerne = new Genre ("Kein spezielles", 80 , null);
	
	public schauspieler() {
		
		setGenre=(standardGerne);
		
//		Genre g =new Genre("Thriller", 80, null);
//		setGenre(g);
//		
				
/*  setGenre(new Genre("Thriller",80)); -2 */
	//setGenre("Thriller",80); -1
		
	}
	
	public schauspieler(String vorname, String nachname) {
		this(vorname, nachname, 25000, 10, Math.random());
	}
	
	public schauspieler(String vorname, String nachname, int gehalt, int erfahrung , double erfolgsfaktor) {
		this();
		this.vorname=vorname;
		this.nachname=nachname;
		this.gehalt=gehalt;
		this.erfahrung=erfahrung;
		this.erfolgsfaktor = erfolgsfaktor;
	}
	
	
	public void setGenre (Genre genre) {
		this.genre= genre;
	}
	
//	public void setGenre(String genreName, int genreHype) {
//		this.genreName=genreName;
//		this.genreHype=genreHype;
//	}
	
	public String getVollstaendigerName( ) {
		return vorname + " " + nachname;
	}
	
	public schauspieler erfahrungVergleichen(schauspieler s2 ) {
		
		return this.erfahrung > s2.erfahrung ? this : s2;
		
//		if (this.erfahrung > s2.erfahrung)
//			return this;
//		else {
//			return s2;	
//		}
//	}
	
	
}

	public void ausgabe () {
		System.out.println(this.vorname + " " + this.nachname + " " + "verdient $ " + this.gehalt 
				+" Bestes Genre: " + /*this.genreName*/ genre.name + " Beste Hype: "+ genre.hype);
	}
	

}
