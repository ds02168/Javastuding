
public class InheritanceExample6 {
	public static void main(String[] args) {
		EmailSender obj1 = new EmailSender("생일축하", "영남대 센터", "admin@yu", "10%할인 쿠폰");
		SMSSender obj2 = new SMSSender("생일축하", "영남대 센터", "053-810-0000", "10%할인 쿠폰");
		
		send(obj1, "hatman@gmail.com");
		
		send(obj1, "stickman@naver.com");

		send(obj2, "010-3546-3242");

	}
	static void send(MsgSender obj, String recpnt) {
		obj.sendMsg(recpnt);
	}
}
