import java.util.*;

class Cvert2 {
	private int sss;
	private int mmm;
	private int hhh;

	public Cvert2(int a) {
		sss = a % 60; //1�п� 60���̹Ƿ� 60���� ���� ������=��
		hhh = a / 3600; //1�ð��� 3600���̹Ƿ� 3600���� ���� ��=�ð�
		mmm = (a % 3600) / 60; //3600�ʷ� ���� �������� 60�ʸ� ������=��
	}

	public int getHour() { //�ð� ��ȯ
		return hhh;
	}

	public int getMinute() { // �� ��ȯ
		return mmm;
	}

	public int getSecond() { // �� ��ȯ
		return sss;
	}

}

public class Test7 {
	public static void main(String[] args) {
		int t;
		Scanner input = new Scanner(System.in);

		System.out.print("�ʸ� �Է��ϼ���(����) : ");
		t = input.nextInt(); //������ ������ �ʸ� �Է¹���
		input.close();

		Cvert2 cv2 = new Cvert2(t); //�ʸ� ��,��,�ʷ� �������ִ� ��ü ����

		System.out.println(
				"�Է��Ͻ� " + t + "�ʴ� " + cv2.getHour() + "�ð� " + cv2.getMinute() + "�� " + cv2.getSecond() + "�� �Դϴ�."); //��,��,�� ���
	}

}
