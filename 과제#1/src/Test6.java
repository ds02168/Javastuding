import java.util.*;

class Cvert1 {
	private int a;

	public Cvert1(int num) { //생성자
		a = (num / 10) * 10 + 1; //10으로 나누었다가 다시 10을 곱하고 1을 더해줌으로써 1의자리를 1로 만들어줌
	}

	public int getNum() {
		return a;
	}

}

public class Test6 {
	public static void main(String[] args) {
		int usr;
		Scanner input = new Scanner(System.in);

		System.out.print("입력 정수? ");
		usr = input.nextInt(); //임의의 정수를 입력 받음
		input.close();

		Cvert1 c1;
		c1 = new Cvert1(usr); //변환해주는 객체 생성

		System.out.println("1의자리수를 1로 바꾼 정수 = " + c1.getNum()); //1의 자리가 1인 값 출력

	}
}
