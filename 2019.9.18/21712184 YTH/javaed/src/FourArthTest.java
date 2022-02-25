class AddFish {
	int c;

	public int add(int a, int b) {
		c = a + b;
		return c;
	}

	public int sub(int a, int b) {
		c = a - b;
		return c;
	}
}

public class FourArthTest {
	public static void main(String[] args) {
		int sum;
		int x, y;
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);

		AddFish afish = new AddFish();
		
		sum = afish.add(x, y);		
		System.out.println("Sum = " + sum + "입니다.");
		
		sum = afish.sub(x, y);		
		System.out.println("Sub = " + sum + "입니다.");
	}
}
