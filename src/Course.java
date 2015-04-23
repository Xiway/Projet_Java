import java.util.GregorianCalendar;


public class Course extends Séance {
	private GregorianCalendar date; 
	int duree;
	int distance;
	String Type = "course";
	String Terrain;
	String Meteo;
	String _n = System.getProperty("line.separator");
	
	Course(int jour, int mois, int annee, int heure, int minute){
		date = new GregorianCalendar(annee, mois, jour, heure, minute, 0 );
	}
	
	Course(int jour, int mois, int annee, int heure, int minute, int distance, int duree, String terrain, String meteo){
		this(jour, mois, annee, heure, minute);
		this.Terrain = terrain;
		this.Meteo = meteo;
		this.distance = distance;
		this.duree = duree;
	}
	
	public void affiche(){
		System.out.println("Séance du " + this.date.get(GregorianCalendar.DAY_OF_MONTH) + "/" + this.date.get(GregorianCalendar.MONTH) + "/"+ this.date.get(GregorianCalendar.YEAR) +" de type course a pied :" + _n);
		System.out.println("Distance totale parcourue : "+this.distance+ _n);
		System.out.println("Sur terrain " + this.Terrain +" et une météo " + this.Meteo+"."+_n);
		System.out.println("Duree : "+this.duree + " minutes."+_n);
	}
	
	public int getDistance(){
		return this.distance;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getTerrain() {
		return Terrain;
	}

	public void setTerrain(String terrain) {
		Terrain = terrain;
	}

	public String getMeteo() {
		return Meteo;
	}

	public void setMeteo(String meteo) {
		Meteo = meteo;
	}

	public String getType() {
		return Type;
	}

}
