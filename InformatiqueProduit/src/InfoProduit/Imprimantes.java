package InfoProduit;

import java.util.Date;

public class Imprimantes extends ProduitInformatique {
		String Laser;
		String jet;
		String Encre;
	public Imprimantes(String reference, String marque, Date datefab, double prix,String Laser,String jet,String Encre) throws Except {
		super(reference, marque, datefab, prix);
		// TODO Auto-generated constructor stub
		this.Laser = Laser;
		this.jet= jet;
		this.Encre =Encre;
	}
	public void affiche() {
		super.affiche();
		System.out.println("Laser  :" +Laser);
		System.out.println("Jet  "+jet);
		System.out.println("Encre  " +Encre);
	}
}
