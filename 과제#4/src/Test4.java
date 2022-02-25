import java.util.*;

class RandomThree { //��������� Ŭ����
	private int[] arr;
	private int a, b, n;
	Random r = new Random();

	RandomThree(int a, int b, int n) { //������
		this.a = a;
		this.b = b;
		this.n = n;
		arr = new int[n];
	}

	public int[] getRandom() { //a~b���� ������ ����� �޼ҵ�
		for (int i = 0; i < n; i++)
			arr[i] = r.nextInt(b - a + 1) + a;

		return arr; //�迭 ��ȯ
	}
}

public class Test4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		RandomThree t4;
		int a, b, n;
		int[] arr;
		System.out.print("������ ���� ? "); //n
		n = input.nextInt();
		System.out.print("a�̻� ? "); //a
		a = input.nextInt();
		System.out.print("b���� ? "); //b
		b = input.nextInt();

		input.close();

		t4 = new RandomThree(a, b, n); //��ü ����
		arr = t4.getRandom();
		System.out.print("��� : ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " "); //��� ���
		System.out.println();
	}
}
