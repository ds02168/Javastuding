import java.util.*;

class ChangeCase { //��ҹ��ڱ��������ʰ� 2���̻��� ���ڿ� ���������� ��� Ŭ����
	public String getCase(String[] in) { //���ڿ��� ��� �޼ҵ�
		String[] SameTwo = { "", "" }; // 5���Է��� �������� ���ƾ� 2�� �̹Ƿ� 2���̻��� ���ڿ��� ������ �迭
		int index = 0; //2���̻��� �ܾ���� �����ϱ����� ���� ����
		String result; //����� ������ stringŬ����

		for (int i = 0; i < in.length; i++) {
			for (int j = i + 1; j < in.length; j++) { //���������� ���ϸ�
				if (in[i].equalsIgnoreCase(in[j])) { //��ҹ��ڱ��о��� ������
					if (!SameTwo[index].equalsIgnoreCase(in[i])) { //���� ������ 2���̻� ���ڿ��� �ٸ� 2���̻��� ���ڿ��� �ִٸ�
						SameTwo[index] = in[i].toLowerCase(); //�ҹ��ڷ� ����
						SameTwo[index] = SameTwo[index].concat(" "); //' '���� ����
						index++; //index�� 2�� ����
					}
				}
			}
		}

		if (SameTwo[0].compareTo(SameTwo[1]) == 1) //ù���簡 2��°���� �ڿ� �ִٸ�
			result = SameTwo[1].concat(SameTwo[0]); //2��°�� ù��°�� ����
		else // SameTwo[0]�� SameTwo[1]�� ���� ���� �����Ƿ� �ƴѰ��� ù��°�� 2��°���� �տ�����
			result = SameTwo[0].concat(SameTwo[1]); //1��°�� 2��°�� ����

		return result; //��� ��ȯ
	}
}

public class Test10 {
	public static void main(String[] args) {
		String[] s10 = new String[5]; //5���� �Է� ���ڿ��迭
		Scanner input = new Scanner(System.in);
		ChangeCase t10 = new ChangeCase();

		for (int i = 0; i < s10.length; i++) {
			System.out.print("��� : ");
			s10[i] = input.nextLine(); //5���� ���ڿ� �Է�
		}

		input.close();
		System.out.println("��� : " + t10.getCase(s10)); //��� ���
	}
}
