import java.util.*;

class Circle {
	double radius;

	public Circle(double inputr) {
		radius = inputr;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
}

public class Test3 {
	public static void main(String[] args) {
		double radius;

		System.out.print("반지름? ");

		Scanner input = new Scanner(System.in);
		radius = input.nextDouble();
		input.close();

		Circle CircleFish = new Circle(radius);

		System.out.println("원의 넓이는 = " + CircleFish.getArea());
	}
}
