import java.util.GregorianCalendar;


public class Velo extends Séance {
	private GregorianCalendar date; 
	int duree;
	private String Type = "Velo";
	private int distance;
	private int denivele;
	String _n = System.getProperty("line.separator");
	
	Velo(int jour, int mois, int annee, int heure, int minute){
		date = new GregorianCalendar(annee, mois, jour, heure, minute, 0 );
	}
	
	Velo(int jour, int mois, int annee, int heure, int minute, int distance, int denivele, int duree){
		this(jour, mois, annee, heure, minute);
		this.distance = distance;
		this.denivele = denivele;
		this.duree = duree;
	}

	public void affiche(){
		System.out.println("Séance du " + this.date.get(GregorianCalendar.DAY_OF_MONTH) + "/" + this.date.get(GregorianCalendar.MONTH) + "/"+ this.date.get(GregorianCalendar.YEAR) +" de type cycliste :" + _n);
		System.out.println("Distance totale parcourue : "+this.distance+ _n);
		System.out.println("Denivele total : " + this.denivele+ _n);
		System.out.println("Duree : "+this.duree + " minutes."+_n);
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

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getDenivele() {
		return denivele;
	}

	public void setDenivele(int denivele) {
		this.denivele = denivele;
	}

	public String getType() {
		return Type;
	}

}

