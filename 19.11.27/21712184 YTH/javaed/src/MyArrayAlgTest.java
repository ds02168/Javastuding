
class MyArrayAlg {
	static <T> T getLast(T[] a) {

		return a[a.length - 1];
	}
}

public class MyArrayAlgTest {
	public static void main(String[] args) {
		Integer[] lang = {1,2,3 };

		Integer last = MyArrayAlg.getLast(lang);

		System.out.println(last);
	}
}
