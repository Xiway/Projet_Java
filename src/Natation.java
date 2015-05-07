import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Natation extends Séance {
		public GregorianCalendar date; 
		int duree;
		public int distance;
		String _n = System.getProperty("line.separator");
		public ArrayList<Fraction> fractions;
		
		public Natation(int jour, int mois, int annee, int heure, int minute){
			date = new GregorianCalendar(annee, mois, jour, heure, minute, 0 );
		}
		public Natation(int jour, int mois, int annee, int heure, int minute, int duree, int distance){
			this(jour, mois, annee, heure, minute);
			this.duree = duree;
			this.distance = distance;
		}
		Natation(){
			fractions = new ArrayList<Fraction>();
		}
		
		void add(Fraction s){
			this.fractions.add(s);
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
		public int getDistance() {
			return distance;
		}
		public void affiche(){
			System.out.println("Séance du " + this.date.get(GregorianCalendar.DAY_OF_MONTH) + "/" + this.date.get(GregorianCalendar.MONTH) + "/"+ this.date.get(GregorianCalendar.YEAR) +" de type natation :");
			System.out.println("Distance totale parcourue : "+this.distance+" m.");
			System.out.println("Duree : "+this.duree + " minutes.");
		}
		
		
		
	}



