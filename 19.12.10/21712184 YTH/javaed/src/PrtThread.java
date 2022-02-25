
public class PrtThread extends Thread {

	SharedArea sA;

	public PrtThread(SharedArea area) {
		sA = area;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			synchronized (sA) {
				int sum = sA.acc1.balance + sA.acc2.balance;
				System.out.println("계좌잔액의 합 : " + sum);
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
