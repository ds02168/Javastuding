class Fruit {
	int apple =5;
	int straw = 10;
	int grapes = 15;
}


public class Buy {
	public static void main(String[] args) {
		int q1, q2;
		Fruit f1 = new Fruit();
		Fruit f2 = f1;
		
		q1=f1.apple+f1.straw+f1.grapes;
		q2=f2.apple+f2.straw+f2.grapes;
		
		System.out.println("��ü f1�� �ʱ� ���� ���� " + q1 +"��");
		System.out.println("��ü f2�� �ʱ� ���� ���� " + q2 + "��");
		f1.apple=10;
		f2.straw = 20;
		f1.grapes = 30;
		
		q1=f1.apple+f1.straw+f1.grapes;
		q2=f2.apple+f2.straw+f2.grapes;
		
		System.out.println("��ü f1�� �ʱ� ���� ���� " + q1 +"��");
		System.out.println("��ü f2�� �ʱ� ���� ���� " + q2 + "��");
	}
}
