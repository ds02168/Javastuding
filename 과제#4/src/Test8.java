import java.util.*;

class RCP { //���������� Ŭ����
	Random r;
	int[] result; //��� ��츦 �����ϴ� �迭
	Scanner input;
	int win = 0, lose = 0, draw = 0, count = 0; //���
	String com; //�Ǵ� ��ǻ��
	String user; //�Ǵ� ����

	RCP() {
		r = new Random();
		result = new int[9];
		input = new Scanner(System.in);
	}

	public void PlayGame() { // ����=0,����=1,��=2
		while (count < 5) { //5ȸ����
			count++;
			System.out.print("���� ���� ��  : ");
			user = input.next();

			if (!(user.equals("����") || user.equals("����") || user.equals("��"))) {
				count--;
				System.out.println("�߸� �Է��ϼ̽��ϴ�.\n");
				continue; //���� ���� �� �� �Է½�
			}

			switch (r.nextInt(3)) { //��ǻ���� ���������� ����
			case 0:
				com = "����";
				break;
			case 1:
				com = "����";
				break;
			case 2:
				com = "��";
				break;
			}

			System.out.println("��ǻ�� : " + com);

			if (user.equals(com)) { //��ǻ��=�����϶�
				System.out.println("���º�\n");
				draw++;
				continue; //������
			}

			if (user.equals("����")) { //�����Է½�
				if (com.equals("����")) { //��ǻ�Ͱ� ������
					lose++;
					System.out.println("�й�\n"); //�й�
				} else if (com.equals("��")) { //��ǻ�Ͱ� ����
					win++;
					System.out.println("�¸�\n"); //�¸�
				}
				continue;
			}

			else if (user.equals("����")) { //���� �Է½�
				if (com.equals("��")) { //��ǻ�Ͱ� ����
					lose++;
					System.out.println("�й�\n"); //�й�
				} else if (com.equals("����")) { //��ǻ�Ͱ� ������
					win++;
					System.out.println("�¸�\n"); //�¸�
				}
				continue;
			}

			else if (user.equals("��")) { //�� �Է½�
				if (com.equals("����")) { //��ǻ�Ͱ� ������
					lose++;
					System.out.println("�й�\n"); //�й�
				} else if (com.equals("����")) { //��ǻ�Ͱ� ������
					win++;
					System.out.println("�¸�\n"); //�¸�
				}
				continue;
			}

		}

		System.out.println("�¸� : " + win + "\n���º� : " + draw + "\n�й� : " + lose);

	}

}

public class Test8 {
	public static void main(String[] args) {
		RCP t8 = new RCP(); //���������� ��ü ����
		t8.PlayGame(); //���� ����
	}
}
