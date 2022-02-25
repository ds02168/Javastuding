import java.util.Scanner;

class manyIn {
	int[] a; //입력받은 데이터를 저장하는 배열
	int[] b = new int[5]; //갯수를 저장하는 배열
	private int count;//index당 갯수를 저장할 변수

	manyIn(int[] a) { //생성자
		this.a = a;
	}

	int[] getMany() { //데이터 종류마다 갯수를 구하는 메소드
		for (int i = 0; i < b.length; i++) {//1~5까지 데이터중
			count = 0; //갯수를 0으로 초기화하여 다음숫자를 셈

			for (int j = 0; j < a.length; j++) //입력받은 데이터 배열을 차례로 새면서
				if ((i + 1) == a[j]) //현재 숫자와 배열의 데이터와 동일하다면
					count++; //갯수 증가

			b[i] = count;//세아린 갯수를 배열에 저장
		}
		return b; //배열 리턴
	}
}

public class Test9 {
	public static void main(String[] args) {
		int[] a9 = new int[10]; //입력받은 데이터를 저장하는 배열
		int[] b9 = new int[5]; //데이터의 수를 저장하는 배열

		Scanner input = new Scanner(System.in);

		System.out.print("입력 : ");
		for (int i = 0; i < a9.length; i++) {
			a9[i] = input.nextInt(); //사용자로부터 데이터를 입력받음
		}
		input.close();

		manyIn t9 = new manyIn(a9); //객체 생성
		b9 = t9.getMany(); //메소드 호출

		System.out.print("출력 : ");
		for (int i = 0; i < b9.length; i++)
			System.out.print(b9[i] + " "); //배열 출력
	}
}
