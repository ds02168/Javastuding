import java.util.*;

class CountLength { //문자열 길이를 반환하는 클래스
	public int getLength(String in) {

		return in.length(); //문자열 길이 반환
	}
}

public class Test7 {
	public static void main(String[] args) {
		String s7;
		Scanner input = new Scanner(System.in);
		CountLength t7 = new CountLength();

		while (true) { //그만할때까지 무한루프
			System.out.print("입력 : ");
			s7 = input.nextLine(); //입력

			if (s7.equals("그만")) //그만이면
				break; //종료

			System.out.println("출력 : " + t7.getLength(s7)); //결과를 출력

		}
		System.out.println("출력 : 종료합니다...");
		input.close();

	}
}
