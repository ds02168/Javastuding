import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		String name; //�̸�
		int age; //����
		int number; //�й�

		Scanner input = new Scanner(System.in); //�Է� Ŭ���� ����

		System.out.println("�̸�? ");
		name = input.next();

		System.out.println("����? ");
		age = input.nextInt();

		System.out.println("�й�? ");
		number = input.nextInt();
		//�̸�,����,�й��� ������� �Է¹���
		System.out.println();
		System.out.println("�̸�= " + name);
		System.out.println("����= " + age);
		System.out.println("�й�= " + number); //�̸�,����,�й��� ������� ���

		input.close();//�Է� Ŭ������ �ݾ���
	}
}
