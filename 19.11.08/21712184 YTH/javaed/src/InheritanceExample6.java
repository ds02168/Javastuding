
public class InheritanceExample6 {
	public static void main(String[] args) {
		EmailSender obj1 = new EmailSender("��������", "������ ����", "admin@yu", "10%���� ����");
		SMSSender obj2 = new SMSSender("��������", "������ ����", "053-810-0000", "10%���� ����");
		
		send(obj1, "hatman@gmail.com");
		
		send(obj1, "stickman@naver.com");

		send(obj2, "010-3546-3242");

	}
	static void send(MsgSender obj, String recpnt) {
		obj.sendMsg(recpnt);
	}
}
