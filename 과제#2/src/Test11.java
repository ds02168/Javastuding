import java.util.Scanner;

class Calc {
	int[] res = new int[2]; //결과값을 저장하는 배열
	int[] fir, sec;

	Calc(int[] fir, int[] sec) { //생성자
		this.fir = fir;
		this.sec = sec;
	}

	int[] getResult() { //분수를 더한다음 최대공약수로 나누어 약분을 하는 메소드
		int den = 0; //결과의 분모값
		int num = 0; //결과의 분자값
		int gcd;
		den = fir[1] * sec[1]; //분모는 두분수의 분모의 곱
		num = (fir[0] * sec[1]) + (fir[1] * sec[0]); //분자는 상대 분자와의 곱들 합

		gcd = gcd(den, num); //약분을 위해 최대 공약수를 구함
		den = den / gcd; //최대공약수로 분모 나눔
		num = num / gcd; //최대공약수로 분자 나눔

		res[0] = num;
		res[1] = den; //분자와 분모 저장

		return res; //결과 배열 반환
	}

	int gcd(int a, int b) { //최대공약수를 구하는 메소드
		int r;
		if (b > a) { //b가 더클시
			r = b;
			b = a;
			a = r; //a와 b를 바꿔줌
		}

		while (b != 0) { //유클리드 호제법
			r = a % b;
			a = b;
			b = r;
		}

		return a;
	}

}

public class Test11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] fir, sec, res;
		fir = new int[2];
		sec = new int[2]; //fir과 sec는 각각 index 0=분자, index 1=분모

		System.out.print("입력 : ");
		fir[0] = input.nextInt();
		fir[1] = input.nextInt(); //분수 입력받음

		System.out.print("입력 : ");
		sec[0] = input.nextInt();
		sec[1] = input.nextInt(); //분수 입력받음

		input.close();

		Calc t11 = new Calc(fir, sec); //객체 생성
		res = t11.getResult(); //메소드 호출하여 결과값얻음

		if (res[0] % res[1] == 0) { //자연수로 떨어 지면
			res[0] = res[0] / res[1];
			System.out.println("출력 : " + res[0]); //자연수 출력
		}

		else //안 떨어지면
			System.out.println("출력 : " + res[0] + " " + res[1]); //분수 출력
	}
}
