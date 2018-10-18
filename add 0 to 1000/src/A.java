
public class A {
	int b = 10;

	private A() {
		System.out.println("Constructor");
	}

	public static void m() {
		System.out.println("....");
	}

	public static A c() {
		A a = new A();
		return a;
	}
}
