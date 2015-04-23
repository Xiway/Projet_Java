import java.util.GregorianCalendar;

public abstract class Séance {

	abstract void affiche();
	abstract int getDuree();
	abstract int getDistance();
	abstract String getType();
	abstract GregorianCalendar getDate();
}
