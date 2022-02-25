import java.util.Scanner;

class howMany {
	int i;
	private int count; //평균이상인 학생수를 카운트
	private double avg = 0; //평균을 저장하는 변수
	private int sum = 0; //총합을 저장하는 변수
	int[] a; //학생들의 점수를 저장할 배열

	howMany(int[] a) { //생성자
		this.a = a;
	}

	int getCount() { //총합을 구하여 학생수로 나눈 평균을 각학생당 비교하는 메소드
		count = 0;//학생수를 0으로 초기화
		for (i = 0; i < a.length; i++) {
			sum += a[i]; //각각의 점수를 종합하여 더함
		}
		avg = sum / i; //학생수만큼 총점을 나눔
		for (i = 0; i < a.length; i++) {
			if (a[i] > avg) //평균점수보다 높으면
				count++; //1증가
		}

		return count; //수를 반환
	}
}

public class Test5 {
	public static void main(String[] args) {
		int result; //점수가 평균이상인 학생수를 저장
		int[] ary = new int[5]; //학생들의 점수를 저장할 배열
		Scanner input = new Scanner(System.in);

		System.out.print("입력: ");
		for (int i = 0; i < ary.length; i++)
			ary[i] = input.nextInt(); //차례로 점수를 입력

		input.close();

		howMany s5 = new howMany(ary); //객체생성
		result = s5.getCount(); //메소드 호출

		System.out.println("출력 : " + result);
	}
}
