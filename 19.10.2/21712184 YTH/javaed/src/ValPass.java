public class ValPass {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };

		incr(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	// ��ü������ �ؾ� �޼ҵ� ����������
	// static �� �Ἥ ��ü���� ���ص���
	static void incr(int[] array) {
		for (int i = 0; i < array.length; i++)
			array[i]++;
	}
}
