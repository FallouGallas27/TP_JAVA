package InfoProduit;

import java.util.Date;

public class ListeProduit {
	ProduitInformatique [] tabProduit;
	int tailleMax =7;
	int nbelemt;
	
	public void ajout(ProduitInformatique p) {
		//tabProduit = new ProduitInformatique(tailleMax);
		if(nbelemt<tailleMax) {
			tabProduit[nbelemt++]= p;
		}
		else {
			System.out.println("Le tableau est plien");
		}
	}
	public ListeProduit(int tailleMax) {
		super();
		this.tailleMax = tailleMax;
		this.nbelemt = 0;
		tabProduit = new ProduitInformatique[tailleMax];
	}
	public void affiche_liste() {
		for(int i=0; i<nbelemt ; i++) {
			tabProduit[i].affiche();
		}
	}
	
}
