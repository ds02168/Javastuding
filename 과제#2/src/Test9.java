import java.util.Scanner;

class manyIn {
	int[] a; //�Է¹��� �����͸� �����ϴ� �迭
	int[] b = new int[5]; //������ �����ϴ� �迭
	private int count;//index�� ������ ������ ����

	manyIn(int[] a) { //������
		this.a = a;
	}

	int[] getMany() { //������ �������� ������ ���ϴ� �޼ҵ�
		for (int i = 0; i < b.length; i++) {//1~5���� ��������
			count = 0; //������ 0���� �ʱ�ȭ�Ͽ� �������ڸ� ��

			for (int j = 0; j < a.length; j++) //�Է¹��� ������ �迭�� ���ʷ� ���鼭
				if ((i + 1) == a[j]) //���� ���ڿ� �迭�� �����Ϳ� �����ϴٸ�
					count++; //���� ����

			b[i] = count;//���Ƹ� ������ �迭�� ����
		}
		return b; //�迭 ����
	}
}

public class Test9 {
	public static void main(String[] args) {
		int[] a9 = new int[10]; //�Է¹��� �����͸� �����ϴ� �迭
		int[] b9 = new int[5]; //�������� ���� �����ϴ� �迭

		Scanner input = new Scanner(System.in);

		System.out.print("�Է� : ");
		for (int i = 0; i < a9.length; i++) {
			a9[i] = input.nextInt(); //����ڷκ��� �����͸� �Է¹���
		}
		input.close();

		manyIn t9 = new manyIn(a9); //��ü ����
		b9 = t9.getMany(); //�޼ҵ� ȣ��

		System.out.print("��� : ");
		for (int i = 0; i < b9.length; i++)
			System.out.print(b9[i] + " "); //�迭 ���
	}
}
