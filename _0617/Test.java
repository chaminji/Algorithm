package _0617;

class A {
	int prop = 1;
	void method() {System.out.print(2);}
}

class B extends A{
	int prop = 3;
	void method() {System.out.print(4);}
	void method(int j) {System.out.print(5);}
}

public class Test {
	public static void main(String[] args) {
		A ab = new B();
		B b = (B)ab;
		B t = new B();
		
		t.method(0);
		System.out.print(ab.prop);
		t.method();
		b.method();
		System.out.print(b.prop);
		ab.method();
	}
}
