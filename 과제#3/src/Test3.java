import java.util.Scanner;

class StringReturn { //���� �Է��� �ٽ� ����ϴ� Ŭ����
	private String s3;

	public String getS3() { //�Է¹޴� �޼ҵ�
		return s3;
	}

	public void setS3(String s3) { //�ǵ����ִ� �޼ҵ�
		this.s3 = s3;
	}
}

public class Test3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringReturn t3 = new StringReturn();

		System.out.print("�Է� : ");
		t3.setS3(input.nextLine()); //����ڷκ��� �Է¹��� ���ڿ��� ��ü�� ����
		input.close();

		System.out.println("��� : " + t3.getS3()); //���

	}
}
