
public class InhExam01 {
	public static void main(String[] args) {

		CheckAccnt obj = new CheckAccnt();
		obj.account = "111-22";
		obj.name = "홍길동";
		obj.cardNo = "555-666";
		obj.deposit(100);

		int paidAmnt;
		try {
			paidAmnt = obj.pay("555-666", 1000);

			System.out.println("지불액 : " + paidAmnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
