public class CheckAccount extends Account{
	String cardNo;
	
	
	public CheckAccount(String accNo, String ownName, int bal, String cardNo){
		super(accNo, ownName, bal);
		this.cardNo = cardNo;
	}
	
	int pay(String cardNo, int amnt) throws Exception{
		if(! cardNo.equals(this.cardNo))
			throw new Exception("������ �Ұ����մϴ�.");
		return withdraw(amnt);
	}
}
