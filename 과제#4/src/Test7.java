import java.util.*;

class UPnDOWN_Game{ //업다운 게임 클래스
	Random r = new Random();
	private int answer; //정답
	Scanner input = new Scanner(System.in);
	private int num; //사용자 입력
	UPnDOWN_Game(){
		answer = r.nextInt(100)+1; //정답 설정 
	}
	
	public void PlayingGame() {
		System.out.println("1이상 100이하 UP DOWN 게임");
		while(true) { //맞출때 까지
			System.out.print("입력 : ");
			num=input.nextInt();
			
			if(answer==num) //정답
				break;
			else if(answer>num) //answer보다 아래일때
				System.out.println("UP");
			else
				System.out.println("DOWN"); //answer보다 위일때
		}
		System.out.println("EXACT"); //끝을 알림
	}
}

public class Test7 {
	public static void main(String[] args) {
		UPnDOWN_Game t7 = new UPnDOWN_Game(); //업다운 게임 객체 생성
		
		t7.PlayingGame(); //게임 실행
	}
}
