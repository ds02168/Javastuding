import java.util.*;

class StringReplace { //morning->night, night->morning 바꿔주는 클래스
	String replaceString(String in) {
		if (in.contains("morning")) { //morning을 포함하면
			in = in.substring(0, 5);
			in = in.concat("night"); //문자열 뒷부분 night로 바꿈
		} else if (in.contains("night")) {//night를 포함하면
			in = in.substring(0, 5);
			in = in.concat("morning"); //문자열 뒷부분 morning으로 바꿈
		} else //morning,night 둘다 없으면
			System.out.println("옳바른 입력이 아닙니다. 다시 입력해 주세요"); //오류출력
		return in;
	}
}

public class Test5 {
	public static void main(String[] args) {
		String s5;
		Scanner input = new Scanner(System.in);
		StringReplace t5 = new StringReplace();

		System.out.print("입력 : ");
		s5 = input.nextLine(); //사용자 입력
		input.close();

		s5 = t5.replaceString(s5); //morning->night, night->morning바꿔주는 메소드 호출

		System.out.println("출력 : " + s5);
	}
}
