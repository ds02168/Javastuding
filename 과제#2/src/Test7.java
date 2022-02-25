import java.util.Scanner;

class ThreeSixNine {
	private int num; //입력받은 값
	private int current; //현재 자리수의 숫자
	private int count; //박수 횟수

	ThreeSixNine(int num) {
		this.num = num;
	}

	int manySnap() { //자리수마다 박수횟수를 구분하는 메소드
		current = 0; //현재 자리수를 0으로 초기화
		count = 0; //박수 횟수를 0으로 초기화
		while (num > 0) { //자리수가 남아있을때까지
			current = num % 10;//10씩 나머지를 구해주면서
			if (current % 3 == 0 && current != 0) //3,6,9일때 박수 횟수 증가
				count++;
			num /= 10;//10씩 나눠주면서 자리수를 키움
		}
		return count; //횟수 반환
	}
}

public class Test7 {
	public static void main(String[] args) {
		int in;
		Scanner input = new Scanner(System.in);

		System.out.print("입력 : ");
		in = input.nextInt(); //사용자로부터 정수를 입력받음
		input.close();

		ThreeSixNine s7 = new ThreeSixNine(in); //객체생성

		System.out.println("출력 : 박수x" + s7.manySnap());//출력
	}
}
