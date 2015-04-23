import java.util.GregorianCalendar;


public class Natation extends Séance {
	private GregorianCalendar date; 
	int duree;
	private String Type = "Natation";
	private int distance;
	String _n = System.getProperty("line.separator");
	
	public Natation(int jour, int mois, int annee, int heure, int minute){
		date = new GregorianCalendar(annee, mois, jour, heure, minute, 0 );
	}
	public Natation(int jour, int mois, int annee, int heure, int minute, int duree, int distance){
		this(jour, mois, annee, heure, minute);
		this.duree = duree;
		this.distance = distance;
	}
	
	@Override
	void affiche() {
		// TODO Auto-generated method stub
		System.out.println(_n+  "Séance du " + this.date.get(GregorianCalendar.DAY_OF_MONTH) + "/" + this.date.get(GregorianCalendar.MONTH) + "/"+ this.date.get(GregorianCalendar.YEAR) +" de Natation :" + _n );
		System.out.println("Duree totale : "+ this.duree + " minutes" +_n + "Vous avez parcouru : "+ this.distance + " m en nage." + _n);
	}
	
	@Override
	int getDuree() {
		// TODO Auto-generated method stub
		return this.duree;
	}
	
	@Override
	int getDistance() {
		// TODO Auto-generated method stub
		return this.distance;
	}
	
	@Override
	String getType() {
		// TODO Auto-generated method stub
		return this.Type;
	}
	
	@Override
	GregorianCalendar getDate() {
		// TODO Auto-generated method stub
		return this.date;
	}
	
	
}
