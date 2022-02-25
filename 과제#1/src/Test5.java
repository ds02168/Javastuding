import java.util.*;

public class Test5 {
	public static void main(String[] args) {
		String s;
		char a;
		Scanner input = new Scanner(System.in);
		System.out.print("영어 대문자를 입력하시오(한 단어) : "); //대문자를 입력받음
		s = input.next();
		
		a = s.charAt(0); 
		input.close();
		a += 32; //대문자를 소문자로 변환
		
		System.out.println("영어 소문자 =" + a); //소문자 출력
	}
}
