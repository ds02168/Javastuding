
public class AlphaThread extends Thread {

	public void run() {
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
