
public class InhExam01 {
	public static void main(String[] args) {
		CreditAccnt obj = new CreditAccnt("000-11", "������", 10, 2000);
		
		int amnt;
		try {
			amnt = obj.withdraw(50);
			
			System.out.println("����� : " + amnt);
			System.out.println("�ܾ� : " + obj.bal);
			System.out.println("���̳ʽ� �ѵ� : " + obj.credLine);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}