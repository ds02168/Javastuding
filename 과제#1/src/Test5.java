import java.util.*;

public class Test5 {
	public static void main(String[] args) {
		String s;
		char a;
		Scanner input = new Scanner(System.in);
		System.out.print("���� �빮�ڸ� �Է��Ͻÿ�(�� �ܾ�) : "); //�빮�ڸ� �Է¹���
		s = input.next();
		
		a = s.charAt(0); 
		input.close();
		a += 32; //�빮�ڸ� �ҹ��ڷ� ��ȯ
		
		System.out.println("���� �ҹ��� =" + a); //�ҹ��� ���
	}
}
