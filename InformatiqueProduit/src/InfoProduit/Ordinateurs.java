package InfoProduit;

import java.util.Date;

public class Ordinateurs extends ProduitInformatique {
	String processeurs;
	int tailleRAM;
	int tailleDisque;
	String SE;
	Date dat1 =new Date();
	public Ordinateurs(String ref,String marq,Date dat1,double prixx, String processeurs, int tailleRAM, int tailleDisque, String sE) throws Except {
		super(ref,marq,dat1,prixx);
		this.processeurs = processeurs;
		this.tailleRAM = tailleRAM;
		this.tailleDisque = tailleDisque;
		SE = sE;
	}
	public void affiche() {
		System.out.println("Voici les informations d'un ordinateur");
		super.affiche();
		System.out.println("Processuer :"+processeurs);
		System.out.println("Taille de la RAM "+tailleRAM);
		System.out.println("Taille du Disque  "+tailleDisque);
		System.out.println("Systeme d'exploitation "+SE);
		
	}
}
