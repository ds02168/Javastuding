import java.util.*;

class Book {
	String title, author;

	Book(String title, String author) {
		this.title=title;
		this.author=author;
	}



}

public class MyBook {
	public static void main(String[] args) {
		String author, title;
		Scanner input = new Scanner(System.in);
		Book[] b = new Book[2];
		
		for(int i=0;i<b.length;i++) {
			System.out.print("제목 >>");
			title = input.nextLine();
			
			System.out.print("저자 >>");
			author = input.nextLine();
			
			b[i] = new Book(title,author);
		}
		
		input.close();
		
		for(int i=0;i<b.length;i++) {
			System.out.println("("+b[i].title + ", " + b[i].author + ")");
		}
	}
}
