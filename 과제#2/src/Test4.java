import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		int sum = 0; //���� �� �����ϴ� ����
		int current; //���� �Է¹��� �� �����ϴ� ����
		Scanner input = new Scanner(System.in);
		while (true) { //������ ���ô���� �Է¹���
			System.out.print("�Է� : ");
			current = input.nextInt();
			if (current < 0) //�����̸�
				break; //while�� break
			sum += current; //����ؼ� sum������ ������
			System.out.println("��� : " + sum); //���

		}
		input.close();
		System.out.println("����");
	}
}
