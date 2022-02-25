import java.util.*;

class Circle {
	private double radius; //반지름

	public Circle(double inputr) {//생성자(반지름을 생성시 입력받음)
		radius = inputr;
	}

	public double getArea() {//원의 넓이를 반환하는 메소드
		return 3.14 * radius * radius;
	}
}

public class Test3 {
	public static void main(String[] args) {
		double radius;

		System.out.print("반지름? ");

		Scanner input = new Scanner(System.in);
		radius = input.nextDouble(); //반지름을 입력받음
		input.close();

		Circle CircleFish = new Circle(radius);//원의 정보를 가지는 객체 생성

		System.out.println("원의 넓이 = " + CircleFish.getArea()); //반지름으로 원의 넓이를 계산하여 출력
	}
}
