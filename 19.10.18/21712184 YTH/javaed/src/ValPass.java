public class ValPass {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };

		incr(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	// 객체생성을 해야 메소드 쓸수있지만
	// static 을 써서 객체생성 안해도됨
	static void incr(int[] array) {
		for (int i = 0; i < array.length; i++)
			array[i]++;
	}
}
