
public class AnomyArry {
	public static void main(String[] args) {

		System.out.println("гу = " + sum(new int[] { 1, 2, 3, 4, 5 }));
	}

	static int sum(int[] num) {
		int sum = 0;
		for (int i : num)
			sum += i;

		return sum;
	}
}
