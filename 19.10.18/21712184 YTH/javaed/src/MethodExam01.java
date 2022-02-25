class PrintAccount {
	public static void Print(Object obj) {
		Account ac = (Account) obj;
		System.out.println("°èÁÂ¹øÈ£ : " + ac.account);
		System.out.println("ÀÌ¸§ : " + ac.name);
		System.out.println("ÀÜ¾× : " + ac.balance);
	}
}

public class MethodExam01 {

	public static void main(String[] args) {
		Account obj1 = new Account("111-222", "±è¿µ½Ä", 200);
		Account obj2 = new Account("555-666", "¹ÚÁøÈñ", 1000);

		obj1.deposit(1000);
//		obj2.withdraw(200);

		PrintAccount.Print(obj1);
		PrintAccount.Print(obj2);
	}

}
