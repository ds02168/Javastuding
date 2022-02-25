import java.util.*;

class Upgrade { //���׷��̵� Ȯ�������� �������� �����ִ� Ŭ����
	Random r;
	int Percent;

	Upgrade() {
		r = new Random();
	}

	public int upgradeItem() {//Ȯ���� ������ ��� ���� �޼ҵ�

		Percent = r.nextInt(100); // �� 100%

		if (Percent < 5) // 5%
			return 2; // ���� �ı�
		else if (Percent >= 5 && Percent < 25) // 20%
			return 1; // ����
		else // 75%
			return 0; // ����
	}
}

class Item { //������ Ŭ����
	private int grade = 0; //������ 0��ȭ
	private int result; //���
	Upgrade u;

	Item() {
		u = new Upgrade();
	}

	public void Upgrade() { //������ �޼ҵ�
		grade++;
	}

	public void Downgrade() { //���н� �޼ҵ�
		if (grade == 0)
			grade = 0;
		else
			grade--;
	}

	public int tryUpgrade() { //���׷��̵带 �õ��ϴ� �޼ҵ�
		result = u.upgradeItem();
		switch (result) { //�������
		case 0: //����
			Upgrade();
			System.out.println("��ȭ ���� !! ����� ����� +1 �Ǿ����ϴ�.");
			System.out.println("���� ����� ����� " + grade);
			result = 0;
			break;
		case 1: //����
			Downgrade();
			System.out.println("��ȭ ���� !! ����� ����� -1 �Ǿ����ϴ�.");
			System.out.println("���� ����� ����� " + grade);
			result = 1;
			break;
		case 2: //�ı�
			System.out.println("��ȭ ���� !! ��� �ı��Ǿ����ϴ�.");
			result = 2;
			break;
		}

		return result; //��� ��ȯ
	}

}

public class Test10 {
	public static void main(String[] args) {
		String in10;
		int result;
		Scanner input = new Scanner(System.in);
		Item t10 = new Item(); //���ȭ ��ü

		while (true) {
			in10 = input.nextLine();
			if (in10.equals("�õ�")) { //�õ� �Է½�
				result = t10.tryUpgrade(); //���׷��̵� �޼ҵ� ����
				if (result == 2) //����ı��� ���α׷� ����
					break;
			}
		}
		input.close();
	}
}
