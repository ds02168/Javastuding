
public class MulExam01 {
	public static void main(String[] args) {

		Thread th = new DigitThread();

		th.start();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

