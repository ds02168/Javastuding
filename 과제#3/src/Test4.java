import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		String s41; //1번째 문자열
		String s42; //2번재 문자열

		Scanner input = new Scanner(System.in);

		System.out.print("입력 : ");
		s41 = new String(input.nextLine()); //1번재 문자열 입력
		System.out.print("입력 : ");
		s42 = new String(input.nextLine()); //2번재 문자열 입력
		input.close();

		s41 = s41.concat(s42); //1번재다음 2번째 문자열을 붙힘

		System.out.println("출력 : " + s41); //출력
	}
}
