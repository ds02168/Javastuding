import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		String s41; //1��° ���ڿ�
		String s42; //2���� ���ڿ�

		Scanner input = new Scanner(System.in);

		System.out.print("�Է� : ");
		s41 = new String(input.nextLine()); //1���� ���ڿ� �Է�
		System.out.print("�Է� : ");
		s42 = new String(input.nextLine()); //2���� ���ڿ� �Է�
		input.close();

		s41 = s41.concat(s42); //1������� 2��° ���ڿ��� ����

		System.out.println("��� : " + s41); //���
	}
}
