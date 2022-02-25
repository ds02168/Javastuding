import java.util.*;

class Cvert3 {
	private double x1, x2;

	public Cvert3(double a, double b, double c) { //생성자 (근의 공식 이용)
		x1 = ((-b) + Math.sqrt((b * b - 4 * a * c))) / 2; //1번재 근
		x2 = ((-b) - Math.sqrt((b * b - 4 * a * c))) / 2; //2번째 근
	}

	public double getValue1() {
		return x1; //1번째 근 반환
	}

	public double getValue2() {
		return x2; //2번째 근 반환
	}

}

public class Test8 {
	public static void main(String[] args) {
		double a, b, c;
		Scanner input = new Scanner(System.in);

		System.out.print("ax^2+bx+c=0 에서 a,b,c ? ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble(); //계수 a,b,c를 입력받음

		input.close();

		Cvert3 cv3 = new Cvert3(a, b, c); //근의 공식을 이용하여 근을 구하는 객체 생성

		System.out.println("근의 값은 = " + cv3.getValue1() + ", " + cv3.getValue2() + " 입니다. "); //근 출력

	}
}
