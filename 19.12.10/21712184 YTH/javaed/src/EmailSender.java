
public class EmailSender extends MsgSender{
	String sendAddr;
	String emailBody;
	
	public EmailSender(String title, String sendName, String sendAddr, String emailBody) {
		super(title, sendName);
		this.sendAddr = sendAddr;
		this.emailBody = emailBody;
	}

	void sendMsg(String recpnt) {
		System.out.println("받는사람: " + recpnt);
	}
}
