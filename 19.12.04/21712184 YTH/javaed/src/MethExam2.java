class Numbers {
	int num[];

	Numbers(int[] num) {
		this.num = num;
	}

	public int getTotal() {
		int sum = 0;
		for (int i = 0; i < num.length; i++)
			sum += num[i];

		return sum;
	}

	public double getAverage() {
		int sum = getTotal();
		double avg = (double) sum / num.length;

		return avg;
	}
}

public class MethExam2 {
	public static void main(String[] args) {
		int arr[] = new int[0];

		Numbers obj = new Numbers(arr);

		int tot = obj.getTotal();
		double avg = obj.getAverage();
		System.out.println("ÇÕ°è = " + tot);
		System.out.println("Æò±Õ = " + avg);

	}
}
