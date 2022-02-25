import java.util.*;

class Snap {//가장가까운 박수치는 숫자 출력하는 메소드
	public int nearestSnap(int num) { //가장 가까운 박수
		int current; //현재의 숫자가 박수치는지 확인할 변수
		int one; //한자리수를 저장할 변수

		while (true) {
			num++; //1씩더해가며
			current = num; //current로 값 임시로 넣어서
			while (current > 0) { //current의 자리수들을
				one = current % 10; //1자리씩 one에 넣어
				if (one % 3 == 0 && one != 0) //369박수에 해당되면
					return num; //박수치는 숫자 반환

				current /= 10;//다음 자리수
			}
		}
	}
}

public class Test9 {
	public static void main(String[] args) {
		int i9;
		Scanner input = new Scanner(System.in);
		Snap t9 = new Snap();

		System.out.print("입력 : ");
		i9 = input.nextInt(); //정수 입력
		input.close();

		System.out.println("출력 : " + t9.nearestSnap(i9)); //다음 박수칠 숫자 출력
	}
}
