import java.util.*;

public class Test5 {
	public static void main(String[] args) {
		String s;
		char a;
		Scanner input = new Scanner(System.in);
		System.out.print("대문자를 입력하세요: ");
		s = input.next();
		a = s.charAt(0);
		input.close();
		
		System.out.println("대문자->소문자" + a);
	}
}
