import java.util.*;

class Square { //사각형의 정보를 가지는 클래스
	private int Width, Height;

	Square(int x, int y) {//생성자(사각형의 넓이,높이)
		Width = x;
		Height = y;
	}

	int getAround() { //사각형의 둘레를 반환하는 메소드
		return 2 * Width + 2 * Height;
	}

	int getArea() { //사각형의 넓이를 반환하는 메소드
		return Width * Height;
	}

}

public class Test4 {
	public static void main(String[] args) {
		int x, y;
		Scanner input = new Scanner(System.in);

		System.out.print("Width(정수)? ");
		x = input.nextInt();

		System.out.print("Height(정수)? ");
		y = input.nextInt(); //넓이,높이를 입력받음

		input.close();

		Square SquareFish = new Square(x, y); //사각형 객체 생성

		System.out.println("사각형의 둘레 = " + SquareFish.getAround()); //둘레 출력
		System.out.println("사각형의 넓이 = " + SquareFish.getArea()); // 넓이 출력

	}
}
