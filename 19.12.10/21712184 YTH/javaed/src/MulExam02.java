
public class MulExam02 {
	public static void main(String[] args) {
		Thread th1 = new DigitThread();
		Thread th2 = new DigitThread();
		Thread th3 = new AlphaThread();
		
		th1.start();
		th2.start();
		th3.start();
		
		
	}
}
