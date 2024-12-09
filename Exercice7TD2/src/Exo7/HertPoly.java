package Exo7;

import java.util.Vector;
	class HertPoly{
	private Affichable[] liste;
	private int nbelment=0;
	public HertPoly(int Taille) {
		liste = new Affichable[Taille];
	}
	public void ajoutValeur(Affichable a) {
		if(nbelment<liste.length)
		    liste[nbelment++]=a;
	}
	public void affiche() {
		for(int i =0;i<nbelment; i++)
		   liste[i].affiche();
	}
}

