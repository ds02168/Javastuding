public class RepAry {
	public static void main(String[] args) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ' };
		prtChrArr(c);
		repSpace(c);
		prtChrArr(c);
	}

	static void prtChrArr(char[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}

	static void repSpace(char[] b) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] == ' ')
				b[i] = ',';
		}
	}
}
