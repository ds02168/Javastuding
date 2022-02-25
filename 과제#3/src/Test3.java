import java.util.Scanner;

class StringReturn { //받은 입력을 다시 출력하는 클래스
	private String s3;

	public String getS3() { //입력받는 메소드
		return s3;
	}

	public void setS3(String s3) { //되돌려주는 메소드
		this.s3 = s3;
	}
}

public class Test3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringReturn t3 = new StringReturn();

		System.out.print("입력 : ");
		t3.setS3(input.nextLine()); //사용자로부터 입력받음 문자열을 객체에 전달
		input.close();

		System.out.println("출력 : " + t3.getS3()); //출력

	}
}
