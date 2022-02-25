import java.util.*;

class Cvert3 {
	private double x1, x2;

	public Cvert3(double a, double b, double c) { //������ (���� ���� �̿�)
		x1 = ((-b) + Math.sqrt((b * b - 4 * a * c))) / 2; //1���� ��
		x2 = ((-b) - Math.sqrt((b * b - 4 * a * c))) / 2; //2��° ��
	}

	public double getValue1() {
		return x1; //1��° �� ��ȯ
	}

	public double getValue2() {
		return x2; //2��° �� ��ȯ
	}

}

public class Test8 {
	public static void main(String[] args) {
		double a, b, c;
		Scanner input = new Scanner(System.in);

		System.out.print("ax^2+bx+c=0 ���� a,b,c ? ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble(); //��� a,b,c�� �Է¹���

		input.close();

		Cvert3 cv3 = new Cvert3(a, b, c); //���� ������ �̿��Ͽ� ���� ���ϴ� ��ü ����

		System.out.println("���� ���� = " + cv3.getValue1() + ", " + cv3.getValue2() + " �Դϴ�. "); //�� ���

	}
}
