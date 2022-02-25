import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		int sum = 0; //누적 값 저장하는 변수
		int current; //현재 입력받은 값 저장하는 변수
		Scanner input = new Scanner(System.in);
		while (true) { //음수가 나올대까지 입력받음
			System.out.print("입력 : ");
			current = input.nextInt();
			if (current < 0) //음수이면
				break; //while문 break
			sum += current; //계속해서 sum변수에 더해줌
			System.out.println("출력 : " + sum); //출력

		}
		input.close();
		System.out.println("종료");
	}
}
