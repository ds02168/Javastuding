import java.util.*;

class RCP { //가위바위보 클래스
	Random r;
	int[] result; //결과 경우를 저장하는 배열
	Scanner input;
	int win = 0, lose = 0, draw = 0, count = 0; //결과
	String com; //판당 컴퓨터
	String user; //판당 유저

	RCP() {
		r = new Random();
		result = new int[9];
		input = new Scanner(System.in);
	}

	public void PlayGame() { // 가위=0,바위=1,보=2
		while (count < 5) { //5회동안
			count++;
			System.out.print("가위 바위 보  : ");
			user = input.next();

			if (!(user.equals("가위") || user.equals("바위") || user.equals("보"))) {
				count--;
				System.out.println("잘못 입력하셨습니다.\n");
				continue; //가위 바위 보 외 입력시
			}

			switch (r.nextInt(3)) { //컴퓨터의 가위바위보 설정
			case 0:
				com = "가위";
				break;
			case 1:
				com = "바위";
				break;
			case 2:
				com = "보";
				break;
			}

			System.out.println("컴퓨터 : " + com);

			if (user.equals(com)) { //컴퓨터=유저일때
				System.out.println("무승부\n");
				draw++;
				continue; //무성부
			}

			if (user.equals("가위")) { //가위입력시
				if (com.equals("바위")) { //컴퓨터가 바위면
					lose++;
					System.out.println("패배\n"); //패배
				} else if (com.equals("보")) { //컴퓨터가 보면
					win++;
					System.out.println("승리\n"); //승리
				}
				continue;
			}

			else if (user.equals("바위")) { //바위 입력시
				if (com.equals("보")) { //컴퓨터가 보면
					lose++;
					System.out.println("패배\n"); //패배
				} else if (com.equals("가위")) { //컴퓨터가 가위면
					win++;
					System.out.println("승리\n"); //승리
				}
				continue;
			}

			else if (user.equals("보")) { //보 입력시
				if (com.equals("가위")) { //컴퓨터가 가위면
					lose++;
					System.out.println("패배\n"); //패배
				} else if (com.equals("바위")) { //컴퓨터가 바위면
					win++;
					System.out.println("승리\n"); //승리
				}
				continue;
			}

		}

		System.out.println("승리 : " + win + "\n무승부 : " + draw + "\n패배 : " + lose);

	}

}

public class Test8 {
	public static void main(String[] args) {
		RCP t8 = new RCP(); //가위바위보 객체 생성
		t8.PlayGame(); //게임 실행
	}
}
