import java.util.*;

class CountTrims { //������ ������ ���� Ŭ����

	public int getTrims(String in) {
		String[] out = in.split(" "); //' '�� ���ڸ� �����ϴ� split�޼ҵ� ȣ��

		return out.length; //���� ���� ��ȯ
	}
}

public class Test6 {
	public static void main(String[] args) {
		String s6;
		Scanner input = new Scanner(System.in);
		CountTrims t6 = new CountTrims();

		System.out.print("�Է� : ");
		s6 = input.nextLine(); //���ڿ� �Է�
		input.close();

		System.out.println("��� : ���� ������ " + t6.getTrims(s6)); //���ڿ� ���� ���

	}
}
