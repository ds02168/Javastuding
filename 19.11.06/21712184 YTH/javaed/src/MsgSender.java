
abstract public class MsgSender {
	String title;
	String sendName;
	
	public MsgSender(String title, String sendName) {
		this.title=title;
		this.sendName=sendName;
	}
	
	abstract void sendMsg(String recpnt);
}
