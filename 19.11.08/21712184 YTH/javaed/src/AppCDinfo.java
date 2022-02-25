
public class AppCDinfo extends CDinfo implements Lendable {
	String bor;
	String date;
	byte state;
	
	
	public AppCDinfo(String reqNo, String title, String bor, byte state) {
		super(reqNo, title);
		this.bor = bor;
		this.state = state;
	}
	public void checkIn() {
		this.state = 0;
		System.out.println("*"+ title + "�� �ݳ�.");
	}
	public void checkOut(String bor, String date) {
		if(state != 0)
			return;
		state = 1;
		System.out.println("*"+ title + "�� ����.");
		
	}
	
}
