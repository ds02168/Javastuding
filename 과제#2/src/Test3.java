import java.util.Scanner;

class Month {
	void whatMonth(int month) { //switch���� ����Ͽ� ���� ������ ���� ���ϴ� �޼ҵ�
		switch (month) {
		case 1:
			System.out.println("��� : 31");
			break;
		case 2:
			System.out.println("��� : 28");
			break;
		case 3:
			System.out.println("��� : 31");
			break;
		case 4:
			System.out.println("��� : 30");
			break;
		case 5:
			System.out.println("��� : 31");
			break;
		case 6:
			System.out.println("��� : 30");
			break;
		case 7:
			System.out.println("��� : 31");
			break;
		case 8:
			System.out.println("��� : 31");
			break;
		case 9:
			System.out.println("��� : 30");
			break;
		case 10:
			System.out.println("��� : 31");
			break;
		case 11:
			System.out.println("��� : 30");
			break;
		case 12:
			System.out.println("��� : 31");
			break; //�� �޸��� �������� ���

		}
	}
}

public class Test3 {
	public static void main(String[] args) {
		int month;
		Scanner input = new Scanner(System.in);
		Month t3 = new Month(); //��ü ����

		System.out.print("�Է� : ");
		month = input.nextInt(); //����ڷκ��� ���� �Է¹���

		input.close();

		t3.whatMonth(month); //�޼ҵ� ȣ��

	}
}
