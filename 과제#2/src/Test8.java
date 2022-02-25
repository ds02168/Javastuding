import java.util.Scanner;

class Riding {
	private int Pay = 3300; //기본요금
	private int moving, timing; //거리, 시간 변수

	Riding(int moving, int timing) { //생성자
		this.moving = moving;
		this.timing = timing;
	}

	int paytoMove() { //거리와 요금별로 추가요금을 구하는 메소드
		while (moving > 2134) { //2km이상 134m당 100원 추가이므로 2km까지(처음 2km는 요금책정 x)
			moving -= 134; //총거리에서 134m씩 빼주면서
			Pay += 100; //요금을 100원 더함
		}
		while (timing > 1532) { //25분 이상 32초당 100원 추가이므로 25분까지(처음 25분은 요금책정 x)
			timing -= 32; //총 시간에서 32초씩 빼주면서
			Pay += 100;//100원씩 추가
		}
		return Pay; //요금을 반환
	}

}

public class Test8 {
	public static void main(String[] args) {
		int moving, timing;
		Scanner input = new Scanner(System.in);

		System.out.print("입력 : ");
		moving = input.nextInt();
		timing = input.nextInt(); //거리와 시간을 입력받음
		input.close();

		Riding t8 = new Riding(moving, timing); //객체 생성

		System.out.println("출력 : " + t8.paytoMove()); //요금 반환 메소드로 출력
	}
}
