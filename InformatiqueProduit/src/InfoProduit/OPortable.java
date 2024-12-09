package InfoProduit;

import java.util.Date;

public class OPortable extends Ordinateurs {
	String typeEcran;
	double tailleEcran;
	public OPortable(String ref, String marq, Date dat1, double prixx, String processeurs, int tailleRAM,
			int tailleDisque, String sE,String typeEcran,double tailleEcran) throws Except {
		super(ref, marq, dat1, prixx, processeurs, tailleRAM, tailleDisque, sE);
		// TODO Auto-generated constructor stub
		this.typeEcran =typeEcran;
		this.tailleEcran = tailleEcran;
	}
	public void affiche() {
		super.affiche();
		System.out.println("Type d'ecran :" +typeEcran);
		System.out.println("Taille  d'ecran :" +tailleEcran);
	}
}
