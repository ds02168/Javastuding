
public class Account {
	String accNo;
	String ownName;
	int bal;

	public Account(String accNo, String ownName, int bal) {
		super();
		this.accNo = accNo;
		this.ownName = ownName;
		this.bal = bal;
	}

	void deposit(int amnt) {
		bal += amnt;
	}
	int withdraw(int amnt)throws Exception {
		if(bal<amnt)
			throw new Exception("ÀÜ¾× ºÎÁ·");
		else
			bal -= amnt;
		
		return amnt;
			
	}
	
}
