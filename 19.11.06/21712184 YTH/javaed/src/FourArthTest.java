class ParFish {
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

class SonFish extends ParFish {
	public int mul(int a, int b) {
		c = a * b;
		return c;
	}

	public int div(int a, int b) {
		c = a / b;
		return c;
	}

}

public class FourArthTest {
	public static void main(String[] args) {
		int sum;
		int x, y;
		
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);

		ParFish afish = new ParFish();

		sum = afish.add(x, y);
		System.out.println("Sum = " + sum + "�Դϴ�.");

		sum = afish.sub(x, y);
		System.out.println("Sub = " + sum + "�Դϴ�.");
		
		SonFish sfish = new SonFish();
		
		sum = sfish.add(x, y);
		System.out.println("Sum = " + sum + "�Դϴ�.");

		sum = sfish.sub(x, y);
		System.out.println("Sub = " + sum + "�Դϴ�.");
	}
}
