import java.util.*;

class Circle1 { //circle Ŭ����
	private int r;

	Circle1(int r) {
		this.r = r;
	}

	public double getArea() { //������ ���Ҽ� �ִ� �޼ҵ�
		return 3.14 * r * r;
	}

	public String toString() { //toString() �޼ҵ� �������̵�
		return getClass().getName() + "Ŭ������ ��ü " + "�������� " + r + " ���� ���̴� " + getArea();
	}
}

public class Test1 {
	public static void main(String[] args) {
		int i1;
		Scanner input = new Scanner(System.in);

		System.out.print("�Է� : ");
		i1 = input.nextInt();
		input.close();

		Circle1 t1 = new Circle1(i1);

		System.out.println("��� : " + t1.toString());

	}
}
