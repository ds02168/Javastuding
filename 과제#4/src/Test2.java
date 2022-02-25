import java.util.*;

class Circle2 { //CircleŬ����
	private int r;

	Circle2(int r) {
		this.r = r;
	}

	public double getArea() {
		return 3.14 * r * r;
	}

	public boolean equals(Object obj) { //equals()�޼ҵ� �������̵�
		Circle2 c2 = (Circle2) obj; //�ٿ�ĳ����

		if (this.getArea() == c2.getArea()) //ũ�� ������
			return true; //true
		else //�ٸ���
			return false; //false
	}
}

public class Test2 {
	public static void main(String[] args) {
		Circle2 t21, t22; //circle��ü 2��
		int i2;
		Scanner input = new Scanner(System.in);

		System.out.print("1��° ���� ������ : ");
		i2 = input.nextInt();
		t21 = new Circle2(i2); //1��° ��

		System.out.print("2��° ���� ������ : ");
		i2 = input.nextInt();
		t22 = new Circle2(i2); //2��° ��

		input.close();

		System.out.print("��� :");
		if (t21.equals(t22))
			System.out.print("�� ���� �����ϴ�.");
		else
			System.out.print("�� ���� �ٸ��ϴ�."); //��� ���
	}
}
