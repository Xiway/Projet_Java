public class Fraction{	
	int duree;
	int distance;
	TypeNage type;
	
	
	public Fraction(TypeNage type,int duree, int distance){
		this.type=type;
		this.duree=duree;
		this.distance=distance;
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
	public TypeNage getType() {
		return type;
	}
	public void setType(TypeNage type) {
		this.type = type;
	}
}