import java.util.Scanner;

class howMany {
	int i;
	private int count; //����̻��� �л����� ī��Ʈ
	private double avg = 0; //����� �����ϴ� ����
	private int sum = 0; //������ �����ϴ� ����
	int[] a; //�л����� ������ ������ �迭

	howMany(int[] a) { //������
		this.a = a;
	}

	int getCount() { //������ ���Ͽ� �л����� ���� ����� ���л��� ���ϴ� �޼ҵ�
		count = 0;//�л����� 0���� �ʱ�ȭ
		for (i = 0; i < a.length; i++) {
			sum += a[i]; //������ ������ �����Ͽ� ����
		}
		avg = sum / i; //�л�����ŭ ������ ����
		for (i = 0; i < a.length; i++) {
			if (a[i] > avg) //����������� ������
				count++; //1����
		}

		return count; //���� ��ȯ
	}
}

public class Test5 {
	public static void main(String[] args) {
		int result; //������ ����̻��� �л����� ����
		int[] ary = new int[5]; //�л����� ������ ������ �迭
		Scanner input = new Scanner(System.in);

		System.out.print("�Է�: ");
		for (int i = 0; i < ary.length; i++)
			ary[i] = input.nextInt(); //���ʷ� ������ �Է�

		input.close();

		howMany s5 = new howMany(ary); //��ü����
		result = s5.getCount(); //�޼ҵ� ȣ��

		System.out.println("��� : " + result);
	}
}
