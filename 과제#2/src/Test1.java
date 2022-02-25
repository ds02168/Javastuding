import java.util.Scanner;

class Odd {//홀수인지 짝수인지 판별하는 클래스
	void isOdd(int odd) { //받은 함수를 2로나누어 나머지유무로 홀수 짝수를 구분함
		if (odd % 2 == 0)
			System.out.println("짝수"); //나머지가 0이면
		else
			System.out.println("홀수"); // 나머지가 0이 아니면
	}
}

public class Test1 {
	public static void main(String[] args) {
		int data;
		Scanner input = new Scanner(System.in);
		Odd t1 = new Odd(); //객체 생성

		System.out.print("입력 : ");
		data = input.nextInt(); //정수를 입력받음

		input.close();

		t1.isOdd(data); //메소드 호출

	}
}
