
public class InhExam01 {
	public static void main(String[] args) {
		CreditAccnt obj = new CreditAccnt("000-11", "유태형", 10, 2000);
		
		int amnt;
		try {
			amnt = obj.withdraw(50);
			
			System.out.println("인출액 : " + amnt);
			System.out.println("잔액 : " + obj.bal);
			System.out.println("마이너스 한도 : " + obj.credLine);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}