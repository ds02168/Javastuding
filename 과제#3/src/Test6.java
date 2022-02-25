import java.util.*;

class CountTrims { //어절의 갯수를 세는 클래스

	public int getTrims(String in) {
		String[] out = in.split(" "); //' '로 문자를 구분하는 split메소드 호출

		return out.length; //어절 갯수 반환
	}
}

public class Test6 {
	public static void main(String[] args) {
		String s6;
		Scanner input = new Scanner(System.in);
		CountTrims t6 = new CountTrims();

		System.out.print("입력 : ");
		s6 = input.nextLine(); //문자열 입력
		input.close();

		System.out.println("출력 : 어절 개수는 " + t6.getTrims(s6)); //문자열 갯수 출력

	}
}
