
public class CheckAccnt extends Account {
	String cardNo;
	
//	CheckAccnt(String name, String account, String cardNo) {
//		this(name, account,0,cardNo);
//	}
//
//	CheckAccnt(String name, String account, int balance,String cardNo) {
//		super(name,account,balance);
//		this.cardNo=cardNo;
//	}
	
	int pay(String cardNo, int amnt) throws Exception {
		if(!(this.cardNo.equals(cardNo)) || (balance < amnt))
			throw new Exception("지불 불가능 !!!");
		
		return withdraw(amnt);	
	}
}
//InhExam01