package Exo3;

//public class A {
//  int aCompteur=1;
//  public A() {aCompteur += 15; }
//  public static void main(String[] args)
//  {A f1 = new A();
//  A f2 = new A(); 
//  A f3 = new A(); 
//  System.out.println("count = " + f1.aCompteur);
//  }
	/*public String f(B obj) { return ("A et B");}
	public String f(A obj) { return ("A jjjjj et A");} }
	class B extends A 
	{ public String f(B obj) { return ("B et B");} 
	public String f(A obj) { return ("B et A");} */
	class A { 
		public void affiche() { System.out.println ("Je suis un A") ; } } 
		class B extends A { } 
		class C extends A {
		public void affiche() { System.out.println ("Je suis un C") ; } } 
		class D extends C { public void affiche() { System.out.println ("Je suis un D") ; } } 
		class E extends D {} 
		class F extends C {} 

		
	 

