import java.util.*;

class Circle {
	private double radius; //������

	public Circle(double inputr) {//������(�������� ������ �Է¹���)
		radius = inputr;
	}

	public double getArea() {//���� ���̸� ��ȯ�ϴ� �޼ҵ�
		return 3.14 * radius * radius;
	}
}

public class Test3 {
	public static void main(String[] args) {
		double radius;

		System.out.print("������? ");

		Scanner input = new Scanner(System.in);
		radius = input.nextDouble(); //�������� �Է¹���
		input.close();

		Circle CircleFish = new Circle(radius);//���� ������ ������ ��ü ����

		System.out.println("���� ���� = " + CircleFish.getArea()); //���������� ���� ���̸� ����Ͽ� ���
	}
}
