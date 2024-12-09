package Exo4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.x());
		//a.printX();
		B b = new B();
		System.out.println(b.x());
		b.printX();
		A ab = new B();
		System.out.println(ab.x());
		ab.printX();

	}

}
