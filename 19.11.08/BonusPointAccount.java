
public class BonusPointAccount extends Account {
	int bonusPnt = 0;

	public BonusPointAccount(String accNo, String ownName, int bal, int bonusPnt) {
		super(accNo, ownName, bal);
		this.bonusPnt = bonusPnt;
	}


	void deposit(int amnt) {
		super.deposit(amnt);
		
		bonusPnt += (int)(amnt * 0.001);
	}
}
