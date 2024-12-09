package InfoProduit;

import java.util.Date;

public class Scanner extends ProduitInformatique {
	String resolution;
	double vitesse;
	public Scanner(String reference, String marque, Date datefab, double prix,String resolution,double vitesse)throws Except  {
		super(reference, marque, datefab, prix);
		// TODO Auto-generated constructor stub
		this.resolution= resolution;
		this.vitesse=vitesse;
	}
	public void affiche() {
		super.affiche();
		System.out.println("La resolution "+ resolution);
		System.out.println("Vitesse  "+ vitesse);
	}
}
