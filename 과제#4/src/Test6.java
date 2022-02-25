import java.util.*;

class RandomChar { //������ ���ڿ� ����� Ŭ����
	Random r = new Random();
	private int length; //���ڿ� ����

	RandomChar(int length) {
		this.length = length;

	}

	public void printChar() {
		for (int i = 0; i < length; i++) { //length��ŭ �ҹ���,�빮��,�������հ����� ����
			switch (r.nextInt(2)) {
			case 0: //�ҹ���
				System.out.print((char) (r.nextInt(26) + 97));
				break;
			case 1: //�빮��
				System.out.print((char) (r.nextInt(26) + 65));
				break;
			case 2: //����
				System.out.print((char) (r.nextInt(10) + 48));
			}
		}
		System.out.println();
	}

}

public class Test6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length, n;

		System.out.print("���� ? ");
		length = input.nextInt(); //���ڿ� ����
		System.out.print("��� ? ");
		n = input.nextInt(); //���?
		input.close();

		RandomChar t6 = new RandomChar(length);

		System.out.println("��� : ");
		for (int i = 0; i < n; i++) //n��
			t6.printChar(); //��� ���
	}
}
