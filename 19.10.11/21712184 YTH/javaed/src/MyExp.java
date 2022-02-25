
public class MyExp {

	int base, exp;

	int getValue() {
		int res = 1;
		for (int i = 0; i < exp; i++) {
			res *= base;
		}
		return res;
	}

	public static void main(String[] args) {
		MyExp n1 = new MyExp();

		n1.base = 2;
		n1.exp = 3;

		System.out.println("2ÀÇ 3½Â = " + n1.getValue());

		n1.base = 3;
		n1.exp = 2;

		System.out.println("3ÀÇ 2½Â = " + n1.getValue());

	}
}
