import java.util.Scanner;

class Odd {//Ȧ������ ¦������ �Ǻ��ϴ� Ŭ����
	void isOdd(int odd) { //���� �Լ��� 2�γ����� ������������ Ȧ�� ¦���� ������
		if (odd % 2 == 0)
			System.out.println("¦��"); //�������� 0�̸�
		else
			System.out.println("Ȧ��"); // �������� 0�� �ƴϸ�
	}
}

public class Test1 {
	public static void main(String[] args) {
		int data;
		Scanner input = new Scanner(System.in);
		Odd t1 = new Odd(); //��ü ����

		System.out.print("�Է� : ");
		data = input.nextInt(); //������ �Է¹���

		input.close();

		t1.isOdd(data); //�޼ҵ� ȣ��

	}
}
