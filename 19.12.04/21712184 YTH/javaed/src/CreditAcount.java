public class CreditAcount extends Account{
	int credLine;
	
	CreditAcount(String accNo, String ownName, int bal, int credLine) {
		super(accNo,ownName,bal);
		this.credLine = credLine;
	}

	public int withdraw(int amnt) throws Exception {
		if (balance > amnt) {
			balance -= amnt;
			return balance;
		} else {
			throw new Exception("ภÜพื บฮมท !!!");
		}
	}

}
