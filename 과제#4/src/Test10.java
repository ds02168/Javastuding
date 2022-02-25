import java.util.*;

class Upgrade { //업그레이드 확률설정후 랜덤으로 돌려주는 클래스
	Random r;
	int Percent;

	Upgrade() {
		r = new Random();
	}

	public int upgradeItem() {//확률로 임의의 결고를 내는 메소드

		Percent = r.nextInt(100); // 총 100%

		if (Percent < 5) // 5%
			return 2; // 장피 파괴
		else if (Percent >= 5 && Percent < 25) // 20%
			return 1; // 실패
		else // 75%
			return 0; // 성공
	}
}

class Item { //아이템 클래스
	private int grade = 0; //시작은 0강화
	private int result; //결과
	Upgrade u;

	Item() {
		u = new Upgrade();
	}

	public void Upgrade() { //성공시 메소드
		grade++;
	}

	public void Downgrade() { //실패시 메소드
		if (grade == 0)
			grade = 0;
		else
			grade--;
	}

	public int tryUpgrade() { //업그레이드를 시도하는 메소드
		result = u.upgradeItem();
		switch (result) { //결과따라
		case 0: //성공
			Upgrade();
			System.out.println("강화 성공 !! 장비의 등급이 +1 되었습니다.");
			System.out.println("현재 장비의 등급은 " + grade);
			result = 0;
			break;
		case 1: //실패
			Downgrade();
			System.out.println("강화 실패 !! 장비의 등급이 -1 되었습니다.");
			System.out.println("현재 장비의 등급은 " + grade);
			result = 1;
			break;
		case 2: //파괴
			System.out.println("강화 실패 !! 장비가 파괴되었습니다.");
			result = 2;
			break;
		}

		return result; //결과 반환
	}

}

public class Test10 {
	public static void main(String[] args) {
		String in10;
		int result;
		Scanner input = new Scanner(System.in);
		Item t10 = new Item(); //장비강화 객체

		while (true) {
			in10 = input.nextLine();
			if (in10.equals("시도")) { //시도 입력시
				result = t10.tryUpgrade(); //업그레이드 메소드 실행
				if (result == 2) //장비파괴시 프로그램 종료
					break;
			}
		}
		input.close();
	}
}
