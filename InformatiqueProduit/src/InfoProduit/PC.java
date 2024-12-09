package InfoProduit;

import java.util.Date;

public class PC extends Ordinateurs {
	String  Cartegraphique;
	public PC(String ref, String marq, Date dat1, double prixx, String processeurs, int tailleRAM, int tailleDisque,
			String sE,String  CarteBgraphique) throws Except {
		super(ref, marq, dat1, prixx, processeurs, tailleRAM, tailleDisque, sE);
		// TODO Auto-generated constructor stub
		this.Cartegraphique =CarteBgraphique; 
	}
	public void affiche() {
		super.affiche();
		System.out.println("La Carte graphique "+Cartegraphique);
	}

}
