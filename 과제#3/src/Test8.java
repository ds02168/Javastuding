import java.util.*;

class PlusString { //���ڿ� �������κ��� ���� ���ϴ� Ŭ����
	public int getValue(String in) { // '+'�� ���ڿ����� �����Ͽ� ���ϴ� �޼ҵ�
		int sum = 0; //���� 0���� �ʱ�ȭ
		String[] intvalue;
		intvalue = in.split("\\+"); // '+'�� ���ڿ��� ����

		for (int i = 0; i < intvalue.length; i++)
			sum += Integer.parseInt(intvalue[i]); //���ڿ����� sum�� ����

		return sum; // �� ��ȯ
	}
}

public class Test8 {
	public static void main(String[] args) {
		String s8;
		Scanner input = new Scanner(System.in);
		PlusString t8 = new PlusString();

		System.out.print("�Է� : ");
		s8 = input.nextLine(); //���� �Է�
		input.close();

		System.out.print("��� : " + t8.getValue(s8)); //��� ���
	}
}
