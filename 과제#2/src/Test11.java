import java.util.Scanner;

class Calc {
	int[] res = new int[2]; //������� �����ϴ� �迭
	int[] fir, sec;

	Calc(int[] fir, int[] sec) { //������
		this.fir = fir;
		this.sec = sec;
	}

	int[] getResult() { //�м��� ���Ѵ��� �ִ������� ������ ����� �ϴ� �޼ҵ�
		int den = 0; //����� �и�
		int num = 0; //����� ���ڰ�
		int gcd;
		den = fir[1] * sec[1]; //�и�� �κм��� �и��� ��
		num = (fir[0] * sec[1]) + (fir[1] * sec[0]); //���ڴ� ��� ���ڿ��� ���� ��

		gcd = gcd(den, num); //����� ���� �ִ� ������� ����
		den = den / gcd; //�ִ������� �и� ����
		num = num / gcd; //�ִ������� ���� ����

		res[0] = num;
		res[1] = den; //���ڿ� �и� ����

		return res; //��� �迭 ��ȯ
	}

	int gcd(int a, int b) { //�ִ������� ���ϴ� �޼ҵ�
		int r;
		if (b > a) { //b�� ��Ŭ��
			r = b;
			b = a;
			a = r; //a�� b�� �ٲ���
		}

		while (b != 0) { //��Ŭ���� ȣ����
			r = a % b;
			a = b;
			b = r;
		}

		return a;
	}

}

public class Test11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] fir, sec, res;
		fir = new int[2];
		sec = new int[2]; //fir�� sec�� ���� index 0=����, index 1=�и�

		System.out.print("�Է� : ");
		fir[0] = input.nextInt();
		fir[1] = input.nextInt(); //�м� �Է¹���

		System.out.print("�Է� : ");
		sec[0] = input.nextInt();
		sec[1] = input.nextInt(); //�м� �Է¹���

		input.close();

		Calc t11 = new Calc(fir, sec); //��ü ����
		res = t11.getResult(); //�޼ҵ� ȣ���Ͽ� ���������

		if (res[0] % res[1] == 0) { //�ڿ����� ���� ����
			res[0] = res[0] / res[1];
			System.out.println("��� : " + res[0]); //�ڿ��� ���
		}

		else //�� ��������
			System.out.println("��� : " + res[0] + " " + res[1]); //�м� ���
	}
}
