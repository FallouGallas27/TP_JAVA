package InfoProduit;

import java.util.Date;

public class ProduitInformatique {
	String reference;
	String marque;
	Date datefab = new Date();
	double prix;
	public void affiche() {
		System.out.println("Voici les caracteristes d'un produit");
		System.out.println("Reference " +reference);
		System.out.println("Marque " +marque);
		System.out.println("Date de fabrication  " +datefab);
		System.out.println("Prix " +prix);
	}
	public ProduitInformatique(String reference, String marque, Date datefab, double prix)throws Except {
		super();
		this.reference = reference;
		this.marque = marque;
		this.datefab = datefab;
		if(prix<0) {
			 throw new Except("Le prix ne peut pas être négatif !");
		}
		this.prix = prix;
	}
	public Date getDatefab() {
		return datefab;
	}
	public void setDatefab(Date datefab) {
		this.datefab = datefab;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
