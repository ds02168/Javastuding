import java.util.*;

class CountLength { //���ڿ� ���̸� ��ȯ�ϴ� Ŭ����
	public int getLength(String in) {

		return in.length(); //���ڿ� ���� ��ȯ
	}
}

public class Test7 {
	public static void main(String[] args) {
		String s7;
		Scanner input = new Scanner(System.in);
		CountLength t7 = new CountLength();

		while (true) { //�׸��Ҷ����� ���ѷ���
			System.out.print("�Է� : ");
			s7 = input.nextLine(); //�Է�

			if (s7.equals("�׸�")) //�׸��̸�
				break; //����

			System.out.println("��� : " + t7.getLength(s7)); //����� ���

		}
		System.out.println("��� : �����մϴ�...");
		input.close();

	}
}
