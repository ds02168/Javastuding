import java.util.Scanner;

class Riding {
	private int Pay = 3300; //�⺻���
	private int moving, timing; //�Ÿ�, �ð� ����

	Riding(int moving, int timing) { //������
		this.moving = moving;
		this.timing = timing;
	}

	int paytoMove() { //�Ÿ��� ��ݺ��� �߰������ ���ϴ� �޼ҵ�
		while (moving > 2134) { //2km�̻� 134m�� 100�� �߰��̹Ƿ� 2km����(ó�� 2km�� ���å�� x)
			moving -= 134; //�ѰŸ����� 134m�� ���ָ鼭
			Pay += 100; //����� 100�� ����
		}
		while (timing > 1532) { //25�� �̻� 32�ʴ� 100�� �߰��̹Ƿ� 25�б���(ó�� 25���� ���å�� x)
			timing -= 32; //�� �ð����� 32�ʾ� ���ָ鼭
			Pay += 100;//100���� �߰�
		}
		return Pay; //����� ��ȯ
	}

}

public class Test8 {
	public static void main(String[] args) {
		int moving, timing;
		Scanner input = new Scanner(System.in);

		System.out.print("�Է� : ");
		moving = input.nextInt();
		timing = input.nextInt(); //�Ÿ��� �ð��� �Է¹���
		input.close();

		Riding t8 = new Riding(moving, timing); //��ü ����

		System.out.println("��� : " + t8.paytoMove()); //��� ��ȯ �޼ҵ�� ���
	}
}
