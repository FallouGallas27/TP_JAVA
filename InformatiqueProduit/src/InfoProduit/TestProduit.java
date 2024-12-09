package InfoProduit;

import java.util.Date;

public class TestProduit {

	public static void main(String[] args) {
		Date dat =  new Date();
		try {
		 ProduitInformatique produit = new ProduitInformatique("aDd02","HP",dat,1500000);
		
		 Ordinateurs O  = new Ordinateurs("aDd02","HP",dat,1500000, "Intel Dual Core T2370",4,500,"Windows11");
		 PC p = new PC("aDd02","HP",dat,1500000, "Intel Dual Core T2370",4,500,"Windows11","GPU");
		 Imprimantes I = new Imprimantes("aDd02","HP",dat,1500000,"Full HD","jet","Tous les couleurs");
		 OPortable op = new OPortable("aDd02","HP",dat,1500000, "Intel Dual Core T2370",4,500,"Windows11","Tactile",9.5);
		 ListeProduit g= new ListeProduit(7);
		 g.ajout(op);
		 g.ajout(I);
		 g.ajout(O);
		 g.ajout(p);
		 g.ajout(produit);
		 g.affiche_liste();
		}catch(Except e) {
            System.out.println("Erreur : " + e.getMessage());
        }
		
	}
}
