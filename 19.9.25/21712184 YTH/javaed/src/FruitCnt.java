class Fruit {
	int apple = 10;
	int straw = 20;
	int grapes = 30;
}

public class FruitCnt {
	public static void main(String[] args) {
		Fruit f1 = new Fruit();
		Fruit f2 = f1;

		int q1 = f1.apple + f1.straw + f1.grapes;
		int q2 = f2.apple + f2.straw + f2.grapes;

		System.out.println("f1�� ���� ���� = " + q1 + "��");
		System.out.println("f2�� ���� ���� = " + q2 + "��");

		f1.apple = 20;
		f2.straw = 30;
		f1.grapes = 40;

		q1 = f1.apple + f1.straw + f1.grapes;
		q2 = f2.apple + f2.straw + f2.grapes;

		System.out.println("���� f1�� ���� ���� = " + q1 + "��");
		System.out.println("���� f2�� ���� ���� = " + q2 + "��");

	}

}
