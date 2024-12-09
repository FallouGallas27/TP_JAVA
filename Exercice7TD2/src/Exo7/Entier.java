package Exo7;

public class Entier implements Affichable {
	private int valeur;
	Entier( int valeur){
		this.valeur =valeur;
	}
	public void affiche() {
		// TODO Auto-generated method stub
		System.out.println("La valeur de l'entier est "+valeur);
	}

}
