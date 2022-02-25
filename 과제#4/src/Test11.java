import java.util.*;

class MineSearch {
	Random r;
	private int w, h, n; //�ʺ�,����,���ڰ���
	private int mine, row, col, index = 0;
	private boolean[][] mark; //���ڰ� �̹� �ִ��� Ȯ���ϴ� �迭
	char[][] map; //������ ��Ÿ�� �迭

	MineSearch(int w, int h, int n) { //����ã�� Ŭ����
		this.w = w;
		this.h = h;
		this.n = n;
		r = new Random();
		map = new char[w][h];
		mark = new boolean[w][h];
		for (int i = 0; i < w; i++) //mark�� true�� �ʱ�ȭ
			for (int j = 0; j < h; j++)
				mark[i][j] = true;
	}

	public void createMap() { //���� ������ִ� �޼ҵ�
		if ((w * h) < n) { //���� ��ũ�⺸�� ���ڰ����� ������
			System.out.println("ǥ���Ҽ� �ִ� �������� ǥ���ؾ��� ���� �����ϴ�.");
			return; //����
		}
		for (int i = 0; i < h; i++) { //���� ���� ����
			for (int j = 0; j < w; j++) {
				map[i][j] = (char) (r.nextInt(10) + 48);
			}
		}

		while (index < n) { //���ڸ� �ɾ��ش�
			index++;

			mine = r.nextInt(w * h); //2�����迭�� index Ư��Ȱ��
			row = mine / h; //���� ��
			col = mine % w;//���� ������

			if (mark[row][col] == false) { //���ڰ� �ɰ��� ������
				index--;
				continue; //�ٽ� �ɱ�
			}

			else { //���ڰ� ������
				map[row][col] = '*'; //�ɾ��ְ�
				mark[row][col] = false; //false�� üũ
			}
		}
		printMap(); //���� ���
	}

	public void printMap() { //���� ��� �޼ҵ�
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++)
				System.out.print(map[i][j]); //���� ���

			System.out.println();
		}
	}

}

public class Test11 {
	public static void main(String[] args) {
		int w, h, n;
		MineSearch t11;
		Scanner input = new Scanner(System.in);

		System.out.print("�Է�(w)(h)(n) : ");
		w = input.nextInt();
		h = input.nextInt();
		n = input.nextInt(); //�ʺ�,����,���ڰ��� ����
		input.close();

		t11 = new MineSearch(w, h, n); //����ã�� ��ü
		t11.createMap(); //����ã�� ����

	}
}
