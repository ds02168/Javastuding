import java.util.*;

class Square {
	private int Width, Height;

	Square(int x, int y) {
		Width = x;
		Height = y;
	}

	int getAround() {
		return 2 * Width + 2 * Height;
	}

	int getArea() {
		return Width * Height;
	}

}

public class Test4 {
	public static void main(String[] args) {
		int x, y;
		Scanner input = new Scanner(System.in);

		System.out.print("Width(����)? ");
		x = input.nextInt();

		System.out.print("Height(����)? ");
		y = input.nextInt();

		input.close();

		Square SquareFish = new Square(x, y);

		System.out.println("�簢���� �ѷ� = " + SquareFish.getAround());
		System.out.println("�簢���� ���� = " + SquareFish.getArea());

	}
}
