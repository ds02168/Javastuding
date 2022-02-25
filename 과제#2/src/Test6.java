import java.util.Scanner;

class Leap {
	private int year;

	Leap(int year) { //생성자
		this.year = year;
	}

	boolean isLeap() { //윤년인지 구분하는 메소드
		if (year % 4 == 0 && year % 100 != 0) //4로 나누어떨어지거나 100의 배수가 아니면
			return true; //윤년
		if (year % 400 == 0) //400으로 나누어 떨어지면
			return true; //윤년

		return false; //나머지는 윤년이 아님
	}
}

public class Test6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int in;

		System.out.print("입력 : ");
		in = input.nextInt(); //년도를 입력받음
		input.close();
		Leap s6 = new Leap(in); //객체 생성

		if (s6.isLeap()) //윤년이면
			System.out.println("출력 : 윤년이다.");
		else
			System.out.println("출력 : 윤년이 아니다.");
	}
}
