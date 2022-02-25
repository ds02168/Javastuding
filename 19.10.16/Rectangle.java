import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		System.out.print(" >> ");
		rect.width = input.nextInt();
		rect.height = input.nextInt();
		
		input.close();
		
		System.out.println("사각형의 면적은 " + rect.getArea());
		
		
	}
}
