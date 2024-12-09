package Liaion_statique;

public class statique {
	abstract class Nombre {
		abstract Nombre plus(Nombre b);
		}
		class Entier extends Nombre {int val;
		Entier(int n) {val = n;
		   }
		}
		Nombre plus(Nombre n) {System.out.println("plus d’Entier" ); 
		return null;}}
		class Reel extends Entier {
		int denom;
		Reel(int n, int n2) 
		{super(n);denom=n2;}
		Reel plus(Reel n)
		{System.out.println("plus de Reel" );
		return new Reel(9, 9);
		}}
		public class Exercice {
			Nombre n1;
		}
		Exercice(Nombre n) 
		{n1=n ;}
		Nombre eval(Nombre n2)
		{return n1.plus(n2); // marque1}
		public static void main(String[] args)
		{Nombre x1;
		x1 = new Reel(4,5); Nombre x2 = new Entier(5);
		Reel x3 = new Reel(1,2); Entier x4 = new Reel(1,8);
		(new Exercice(x1)).eval(x1); // marque 2
		(new Exercice(x4)).eval(x4); // marque 3
		(new Exercice(x3)).eval(x2); // marque 4
		(new Exercice(x2)).eval(x3); // marque 5}
}
