import java.util.Scanner;

class ThreeSixNine {
	private int num; //�Է¹��� ��
	private int current; //���� �ڸ����� ����
	private int count; //�ڼ� Ƚ��

	ThreeSixNine(int num) {
		this.num = num;
	}

	int manySnap() { //�ڸ������� �ڼ�Ƚ���� �����ϴ� �޼ҵ�
		current = 0; //���� �ڸ����� 0���� �ʱ�ȭ
		count = 0; //�ڼ� Ƚ���� 0���� �ʱ�ȭ
		while (num > 0) { //�ڸ����� ��������������
			current = num % 10;//10�� �������� �����ָ鼭
			if (current % 3 == 0 && current != 0) //3,6,9�϶� �ڼ� Ƚ�� ����
				count++;
			num /= 10;//10�� �����ָ鼭 �ڸ����� Ű��
		}
		return count; //Ƚ�� ��ȯ
	}
}

public class Test7 {
	public static void main(String[] args) {
		int in;
		Scanner input = new Scanner(System.in);

		System.out.print("�Է� : ");
		in = input.nextInt(); //����ڷκ��� ������ �Է¹���
		input.close();

		ThreeSixNine s7 = new ThreeSixNine(in); //��ü����

		System.out.println("��� : �ڼ�x" + s7.manySnap());//���
	}
}
