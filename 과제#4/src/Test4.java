import java.util.*;

class RandomThree { //난수만드는 클래스
	private int[] arr;
	private int a, b, n;
	Random r = new Random();

	RandomThree(int a, int b, int n) { //생성자
		this.a = a;
		this.b = b;
		this.n = n;
		arr = new int[n];
	}

	public int[] getRandom() { //a~b사이 난수를 만드는 메소드
		for (int i = 0; i < n; i++)
			arr[i] = r.nextInt(b - a + 1) + a;

		return arr; //배열 변환
	}
}

public class Test4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RandomThree t4;
		int a, b, n;
		int[] arr;
		System.out.print("난수의 갯수 ? "); //n
		n = input.nextInt();
		System.out.print("a이상 ? "); //a
		a = input.nextInt();
		System.out.print("b이하 ? "); //b
		b = input.nextInt();

		input.close();

		t4 = new RandomThree(a, b, n); //객체 생성
		arr = t4.getRandom();
		System.out.print("출력 : ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " "); //결과 출력
		System.out.println();
	}
}
