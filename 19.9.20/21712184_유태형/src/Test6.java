import java.util.*;

class Cvert1 {
	private int a;
	
	public Cvert1(int num) {
		a = (num/10)*10+1;
	}
	
	public int getNum() {
		return a;
	}
	
}


public class Test6 {
	public static void main(String[] args) {
		int usr;
		Scanner input = new Scanner(System.in);
		
		System.out.print("입력 정수? ");
		usr=input.nextInt();
		input.close();
		
		Cvert1 c1;
		c1 = new Cvert1(usr);
		
		System.out.println("1의자리수를 1로 바꾼 정수 = " + c1.getNum());
		
	}
}
