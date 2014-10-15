
public class Eleve {
	
	private String nom;
	private int age;
	
	public Eleve(){
		this("Eleve inconnu",0);
	}
	
	public Eleve(String nom , int age){
		this.nom=nom;
		this.age=age;
	}

	public String toString() {
		return "Eleve [nom=" + nom + ", age=" + age + ", getClass()="
				+ getClass() + "]";
	}
	
	

}
