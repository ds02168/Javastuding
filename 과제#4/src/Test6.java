import java.util.*;

class RandomChar { //임의의 문자열 만드는 클래스
	Random r = new Random();
	private int length; //문자열 길이

	RandomChar(int length) {
		this.length = length;

	}

	public void printChar() {
		for (int i = 0; i < length; i++) { //length만큼 소문자,대문자,숫자조합갯수도 랜덤
			switch (r.nextInt(2)) {
			case 0: //소문자
				System.out.print((char) (r.nextInt(26) + 97));
				break;
			case 1: //대문자
				System.out.print((char) (r.nextInt(26) + 65));
				break;
			case 2: //숫자
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

		System.out.print("길이 ? ");
		length = input.nextInt(); //문자열 길이
		System.out.print("몇번 ? ");
		n = input.nextInt(); //몇번?
		input.close();

		RandomChar t6 = new RandomChar(length);

		System.out.println("출력 : ");
		for (int i = 0; i < n; i++) //n번
			t6.printChar(); //결과 출력
	}
}
