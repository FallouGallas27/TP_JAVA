package Exo7;

import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Entier n=new Entier(2);
		Entier p=new Entier(2);
		Flottant f = new Flottant((float) 2.9);
		HertPoly g = new HertPoly(5);
		g.ajoutValeur(f);
		g.ajoutValeur(p);
		g.affiche();
		
	}

}
