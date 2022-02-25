
public class SMSSender extends MsgSender {
	String retPhNo;
	String msg;
	
	
	public SMSSender(String title, String sendName, String retPhNo, String msg) {
		super(title, sendName);
		this.retPhNo = retPhNo;
		this.msg = msg;
	}


	void sendMsg(String recpnt) {
		System.out.println("전화번호: " + recpnt);
	}
}
