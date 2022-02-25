class StaticSample {
	public int n;

	public void g() {
		m = 20;
	}

	public void h() {
		m = 30;
	}

	public static int m;

	public static void f() {
		m = 5;
	}

}

public class StaticEx {
	public static void main(String[] args) {
		StaticSample s1;

		StaticSample.m = 50;
		StaticSample.f();

		s1 = new StaticSample();

		s1.n = 10;
		s1.g();

		s1.m = 20;
		s1.f();

	}
}
