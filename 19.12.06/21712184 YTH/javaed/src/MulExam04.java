
public class MulExam04 {
	public static void main(String[] args) {
		CalcThread th1 = new CalcThread();
		PrintThread th2 = new PrintThread();
		SharedArea obj = new SharedArea();
		
		th1.sA = obj;
		th2.sA = obj;
		
		th1.start();
		th2.start();
		
	}
}
