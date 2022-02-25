
public class InhExam03 {
	public static void main(String[] args) {
		BonusPointAccount obj = new BonusPointAccount("333-333", "김미영", 0, 0);
		
		obj.deposit(1000000);
		
		System.out.println("잔액 : " + obj.bal);
		System.out.println("누적포인트 : " + obj.bonusPnt);
	}
}
