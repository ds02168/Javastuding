
public class MulExam05 {
	public static void main(String[] args) {
		SharedArea area = new SharedArea();
		
		area.acc1 = new Account("111", "이몽룡", 2000);
		area.acc2 = new Account("222", "성춘향", 1000);
		
		TransfThread th1 = new TransfThread(area);
		PrtThread th2 = new PrtThread(area);
		
		th1.start();
		th2.start();
		
	}
}
