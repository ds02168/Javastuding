
public class CreditAccnt extends Account{
	
	int credLine;
	
	public CreditAccnt(String accNo, String ownName, int bal, int credLine) {
		super(accNo, ownName, bal);
		this.credLine = credLine;
	}

	int withdraw(int amnt)throws Exception {
		if((bal+ credLine)<amnt)
			throw new Exception("ÀÜ¾× ºÎÁ·");
		else
			bal -= amnt;
		
		return amnt;
			
	}
}
