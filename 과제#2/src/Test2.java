import java.util.Scanner;
import java.util.Arrays;

class ReArray {//배열을 역순으로 배치하는 클래스
	int[] rea;

	void reVerse(int[] arr) { //복사한 배열을 반대로 저장하여 역순을 구하는 메소드
		rea = Arrays.copyOf(arr, arr.length); //그대로 옮겨담을 배열
		for (int i = 0; i < arr.length; i++)
			arr[arr.length - i - 1] = rea[i]; //index4부터 1까지 다시 정의함으로써 역순으로 만듦

	}
}

public class Test2 {
	public static void main(String[] args) {
		int[] arr = new int[5]; //크기가 5인 배열 생성
		ReArray t2 = new ReArray(); //객체 생성

		Scanner input = new Scanner(System.in);

		System.out.print("입력 : ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = input.nextInt(); //차례로 정수를 입력받음

		input.close();

		t2.reVerse(arr); //메소드 호출

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " "); //배열 출력

	}
}
