import java.util.*;

class Snap {//���尡��� �ڼ�ġ�� ���� ����ϴ� �޼ҵ�
	public int nearestSnap(int num) { //���� ����� �ڼ�
		int current; //������ ���ڰ� �ڼ�ġ���� Ȯ���� ����
		int one; //���ڸ����� ������ ����

		while (true) {
			num++; //1�����ذ���
			current = num; //current�� �� �ӽ÷� �־
			while (current > 0) { //current�� �ڸ�������
				one = current % 10; //1�ڸ��� one�� �־�
				if (one % 3 == 0 && one != 0) //369�ڼ��� �ش�Ǹ�
					return num; //�ڼ�ġ�� ���� ��ȯ

				current /= 10;//���� �ڸ���
			}
		}
	}
}

public class Test9 {
	public static void main(String[] args) {
		int i9;
		Scanner input = new Scanner(System.in);
		Snap t9 = new Snap();

		System.out.print("�Է� : ");
		i9 = input.nextInt(); //���� �Է�
		input.close();

		System.out.println("��� : " + t9.nearestSnap(i9)); //���� �ڼ�ĥ ���� ���
	}
}
