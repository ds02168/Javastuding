class MyArrayAlg02 {
	static <T> void swap(T[] a, int i, int j) {
		T tmp;
		tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

}

public class MyArrayAlgTst02 {
	public static void main(String[] args) {

		String[] lang = { "C++", "C#", "Java" };
		MyArrayAlg02.swap(lang, 1, 2);
		for (String i : lang)
			System.out.print(i + " ");
	}
}
