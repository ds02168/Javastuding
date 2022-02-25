public class Account {
	String name, account;
	int balance;

	Account(String name, String account) {
		this(name, account, 0);
	}

	Account(String name, String account, int balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
	}

	public void deposit(int amnt) {
		balance += amnt;

	}

	public int withdraw(int amnt) {
		if (balance < amnt) 
			balance=0;
		
		balance -= amnt;
		return balance;

	}

}
//MethodExam05