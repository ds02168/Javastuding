
public class sepvol implements Lendable{
	String reqNo;
	String bookTitle;
	String writer;
	String bor;
	String date;
	byte state;
	
	public sepvol(String reqNo, String bookTitle, String writer) {
		this.reqNo = reqNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	public void checkOut(String bor, String date) throws Exception {
		
		if(state != 0)
			throw new Exception("*����Ұ�*:" + bookTitle);
		this.state = 1;
		
		System.out.println("*" + bookTitle + "�� ����.");
		System.out.println("*" + bookTitle + "�� ����.");

		
	}
	
	public void checkIn() {
		this.state = 0;
		System.out.println("*" + bookTitle + "�� �ݳ�.");
		
	}
	
}
