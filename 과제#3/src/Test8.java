import java.util.*;

class PlusString { //문자열 수식으로부터 값을 구하는 클래스
	public int getValue(String in) { // '+'로 문자열들을 구분하여 더하는 메소드
		int sum = 0; //합을 0으로 초기화
		String[] intvalue;
		intvalue = in.split("\\+"); // '+'로 문자열을 나눔

		for (int i = 0; i < intvalue.length; i++)
			sum += Integer.parseInt(intvalue[i]); //문자열들을 sum에 더함

		return sum; // 합 반환
	}
}

public class Test8 {
	public static void main(String[] args) {
		String s8;
		Scanner input = new Scanner(System.in);
		PlusString t8 = new PlusString();

		System.out.print("입력 : ");
		s8 = input.nextLine(); //수식 입력
		input.close();

		System.out.print("출력 : " + t8.getValue(s8)); //결과 출력
	}
}
