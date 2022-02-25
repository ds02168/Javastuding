import java.util.Scanner;

class Month {
	void whatMonth(int month) { //switch문을 사용하여 월별 마지막 일을 구하는 메소드
		switch (month) {
		case 1:
			System.out.println("출력 : 31");
			break;
		case 2:
			System.out.println("출력 : 28");
			break;
		case 3:
			System.out.println("출력 : 31");
			break;
		case 4:
			System.out.println("출력 : 30");
			break;
		case 5:
			System.out.println("출력 : 31");
			break;
		case 6:
			System.out.println("출력 : 30");
			break;
		case 7:
			System.out.println("출력 : 31");
			break;
		case 8:
			System.out.println("출력 : 31");
			break;
		case 9:
			System.out.println("출력 : 30");
			break;
		case 10:
			System.out.println("출력 : 31");
			break;
		case 11:
			System.out.println("출력 : 30");
			break;
		case 12:
			System.out.println("출력 : 31");
			break; //각 달마다 마지막일 출력

		}
	}
}

public class Test3 {
	public static void main(String[] args) {
		int month;
		Scanner input = new Scanner(System.in);
		Month t3 = new Month(); //객체 생성

		System.out.print("입력 : ");
		month = input.nextInt(); //사용자로부터 달을 입력받음

		input.close();

		t3.whatMonth(month); //메소드 호출

	}
}
