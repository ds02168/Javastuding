import java.util.Scanner;

class SquarePoint {
	int[] x = new int[3]; //1~2�� ������ ��ǥ�� ��
	int[] y = new int[3]; //1~2�� ������ ��ǥ�� ��
	private int x3, y3; //1��°�� �ٸ� ��ǥ���� �����ϴ� ����
	int[][] p;

	SquarePoint(int[][] p) { //������
		this.p = p;
	}

	int[][] getPoint() { //�簢���� x��ǥ�� 2���� y��ǥ�� 2���� ���� �̷�� Ư¡�� �̿��Ͽ� ������ �� ��ǥ�� ���ϴ� �޼ҵ�

		x[1] = 0; //1��° ��ǥ��
		y[1] = 0; //1��° ��ǥ��
		x[2] = 0; //1��°�� �ٸ� ��ǥ��
		y[2] = 0; //1��°�� �ٸ� ��ǥ��
		//��ǥ�� ������ ���� �迭
		
		x[0] = p[0][0]; // ù��° x��
		y[0] = p[0][1]; // ù��° y��

		for (int i = 0; i < 3; i++) {
			if (x[0] == p[i][0]) //ù��° x��ǥ�� ���ؼ� ������
				x[1]++; //index 1�� ���� ����
			else { //�ٸ���
				x[2]++;  //index 2�� ��������
				x3 = p[i][0]; //�ٸ� ��ǥ���� ����
			}

			if (y[0] == p[i][1]) //ù��° y��ǥ�� ���ؼ� ������
				y[1]++; //index 1�� ���� ����
			else { //�ٸ���
				y[2]++; //index 2�� ��������
				y3 = p[i][1]; //�ٸ� ��ǥ���� ����
			}
		}

		// �簢���� 4���� x,y�B���� 2���� �����̷��� �ϹǷ� ����������  ��ǥ�� 1���ۿ� ���� ��ǥ���� ������ ��ǥ���� ���� 
		if (x[1] > x[2])
			p[3][0] = x3;
		else
			p[3][0] = x[0]; //1���ۿ� ���� x��ǥ���� ����

		if (y[1] > y[2])
			p[3][1] = y3;
		else
			p[3][1] = y[0]; //1���ۿ� ���� ��ǥ���� ����

		return p; //�迭 ��ȯ
	}
}

public class Test10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] p = new int[4][]; //2���� �迭 ����
		for (int i = 0; i < p.length; i++)
			p[i] = new int[2];//x�� y�� ��ǥ�� �����ϹǷ� 1�࿡ 2��

		for (int i = 0; i < 3; i++) { //1~3��° ��ǥ����

			System.out.print("�Է� : ");
			p[i][0] = input.nextInt(); //x��ǥ �Է�
			p[i][1] = input.nextInt(); //y��ǥ �Է�
		}

		input.close();

		SquarePoint t10 = new SquarePoint(p); //��ü����
		t10.getPoint(); //�޼ҵ� ȣ��

		System.out.println("��� : " + p[3][0] + " " + p[3][1]); //��� ���
	}
}
