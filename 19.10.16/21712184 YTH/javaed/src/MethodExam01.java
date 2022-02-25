class PrintAccount {
	public static void Print(Object obj) {
		Account ac = (Account) obj;
		System.out.println("���¹�ȣ : " + ac.account);
		System.out.println("�̸� : " + ac.name);
		System.out.println("�ܾ� : " + ac.balance);
	}
}

public class MethodExam01 {

	public static void main(String[] args) {
		Account obj1 = new Account("111-222", "�迵��", 200);
		Account obj2 = new Account("555-666", "������", 1000);

		obj1.deposit(1000);
		obj2.withdraw(200);

		PrintAccount.Print(obj1);
		PrintAccount.Print(obj2);
	}

}
