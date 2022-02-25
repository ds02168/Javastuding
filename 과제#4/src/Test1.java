import java.util.*;

class Circle1 { //circle 클래스
	private int r;

	Circle1(int r) {
		this.r = r;
	}

	public double getArea() { //면적을 구할수 있는 메소드
		return 3.14 * r * r;
	}

	public String toString() { //toString() 메소드 오버라이딩
		return getClass().getName() + "클래스의 객체 " + "반지름은 " + r + " 원의 넓이는 " + getArea();
	}
}

public class Test1 {
	public static void main(String[] args) {
		int i1;
		Scanner input = new Scanner(System.in);

		System.out.print("입력 : ");
		i1 = input.nextInt();
		input.close();

		Circle1 t1 = new Circle1(i1);

		System.out.println("출력 : " + t1.toString());

	}
}
