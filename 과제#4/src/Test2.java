import java.util.*;

class Circle2 { //Circle클래스
	private int r;

	Circle2(int r) {
		this.r = r;
	}

	public double getArea() {
		return 3.14 * r * r;
	}

	public boolean equals(Object obj) { //equals()메소드 오버라이딩
		Circle2 c2 = (Circle2) obj; //다운캐스팅

		if (this.getArea() == c2.getArea()) //크기 같으면
			return true; //true
		else //다르면
			return false; //false
	}
}

public class Test2 {
	public static void main(String[] args) {
		Circle2 t21, t22; //circle객체 2개
		int i2;
		Scanner input = new Scanner(System.in);

		System.out.print("1번째 원의 반지름 : ");
		i2 = input.nextInt();
		t21 = new Circle2(i2); //1번째 원

		System.out.print("2번째 원의 반지름 : ");
		i2 = input.nextInt();
		t22 = new Circle2(i2); //2번째 원

		input.close();

		System.out.print("출력 :");
		if (t21.equals(t22))
			System.out.print("두 원은 같습니다.");
		else
			System.out.print("두 원은 다릅니다."); //결과 출력
	}
}
