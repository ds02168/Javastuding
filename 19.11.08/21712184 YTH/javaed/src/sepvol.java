
public class sepvol implements Lendable{
	String reqNo;
	String bookTitle;
	String writer;
	byte state;
	
	public sepvol(String reqNo, String bookTitle, String writer) {
		this.reqNo = reqNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	public void checkOut(String bor, String date) {
		
		if(state != 0)
			return;
		this.state = 1;
		
		System.out.println("*" + bookTitle + "이 대출.");
	}
	
	public void checkIn() {
		this.state = 0;
		System.out.println("*" + bookTitle + "이 반납.");
		
	}

}
