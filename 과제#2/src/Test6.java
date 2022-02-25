import java.util.Scanner;

class Leap {
	private int year;

	Leap(int year) { //������
		this.year = year;
	}

	boolean isLeap() { //�������� �����ϴ� �޼ҵ�
		if (year % 4 == 0 && year % 100 != 0) //4�� ����������ų� 100�� ����� �ƴϸ�
			return true; //����
		if (year % 400 == 0) //400���� ������ ��������
			return true; //����

		return false; //�������� ������ �ƴ�
	}
}

public class Test6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int in;

		System.out.print("�Է� : ");
		in = input.nextInt(); //�⵵�� �Է¹���
		input.close();
		Leap s6 = new Leap(in); //��ü ����

		if (s6.isLeap()) //�����̸�
			System.out.println("��� : �����̴�.");
		else
			System.out.println("��� : ������ �ƴϴ�.");
	}
}
