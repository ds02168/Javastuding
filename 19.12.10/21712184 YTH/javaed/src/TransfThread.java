
public class TransfThread extends Thread {

	SharedArea sA;

	public TransfThread(SharedArea area) {
		sA = area;
	}

	public void run() {
		synchronized (sA) {
			for (int i = 0; i < 12; i++) {
				sA.acc1.withdraw(100);
				System.out.println("이몽룡 계좌 : 100만원 인출");
				sA.acc2.deposit(100);
				System.out.println("성춘향 계좌 : 100만원 입금");
			}
		}
	}

}
