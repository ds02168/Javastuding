import java.util.*;

class StringReplace { //morning->night, night->morning �ٲ��ִ� Ŭ����
	String replaceString(String in) {
		if (in.contains("morning")) { //morning�� �����ϸ�
			in = in.substring(0, 5);
			in = in.concat("night"); //���ڿ� �޺κ� night�� �ٲ�
		} else if (in.contains("night")) {//night�� �����ϸ�
			in = in.substring(0, 5);
			in = in.concat("morning"); //���ڿ� �޺κ� morning���� �ٲ�
		} else //morning,night �Ѵ� ������
			System.out.println("�ǹٸ� �Է��� �ƴմϴ�. �ٽ� �Է��� �ּ���"); //�������
		return in;
	}
}

public class Test5 {
	public static void main(String[] args) {
		String s5;
		Scanner input = new Scanner(System.in);
		StringReplace t5 = new StringReplace();

		System.out.print("�Է� : ");
		s5 = input.nextLine(); //����� �Է�
		input.close();

		s5 = t5.replaceString(s5); //morning->night, night->morning�ٲ��ִ� �޼ҵ� ȣ��

		System.out.println("��� : " + s5);
	}
}
