
public class main {
	public static void main (String[]args){
	
		Fraction f1 = new Fraction(TypeNage.CRAWL, 20, 20);
		Fraction f2 = new Fraction(TypeNage.CRAWL,20, 2);
		Natation n1 = new Natation(0, 0, 0, 0, 0, 0, 0);
		n1.add(f1);
		n1.add(f2);
		n1.affiche();
	}

}
