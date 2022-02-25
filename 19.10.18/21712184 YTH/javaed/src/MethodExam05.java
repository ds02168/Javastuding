
public class MethodExam05 {
	public static void main(String[] args) {
		Account obj = new Account("7-77-777", "최대박", 10);

		int amnt;
		try {
			amnt = obj.withdraw(100);

			System.out.println("인출액 : " + amnt);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
