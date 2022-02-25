import java.util.*;

class Square { //�簢���� ������ ������ Ŭ����
	private int Width, Height;

	Square(int x, int y) {//������(�簢���� ����,����)
		Width = x;
		Height = y;
	}

	int getAround() { //�簢���� �ѷ��� ��ȯ�ϴ� �޼ҵ�
		return 2 * Width + 2 * Height;
	}

	int getArea() { //�簢���� ���̸� ��ȯ�ϴ� �޼ҵ�
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
		y = input.nextInt(); //����,���̸� �Է¹���

		input.close();

		Square SquareFish = new Square(x, y); //�簢�� ��ü ����

		System.out.println("�簢���� �ѷ� = " + SquareFish.getAround()); //�ѷ� ���
		System.out.println("�簢���� ���� = " + SquareFish.getArea()); // ���� ���

	}
}
