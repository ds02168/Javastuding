
class Circle {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	double getArea() {
		return 3.14 * radius * radius;
	}
}

public class RefPass {
	public static void main(String[] args) {

		Circle pizza = new Circle(10);

		incr(pizza);

		System.out.println(pizza.radius);

	}

	static void incr(Circle m) {
		m.radius++;
	}
}
