
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
			throw new Exception("*대출불가*:" + bookTitle);
		this.state = 1;
		
		System.out.println("*" + bookTitle + "이 대출.");
		System.out.println("*" + bookTitle + "이 대출.");

		
	}
	
	public void checkIn() {
		this.state = 0;
		System.out.println("*" + bookTitle + "이 반납.");
		
	}
	
}
