import java.util.Scanner;
import java.util.Arrays;

class ReArray {//�迭�� �������� ��ġ�ϴ� Ŭ����
	int[] rea;

	void reVerse(int[] arr) { //������ �迭�� �ݴ�� �����Ͽ� ������ ���ϴ� �޼ҵ�
		rea = Arrays.copyOf(arr, arr.length); //�״�� �Űܴ��� �迭
		for (int i = 0; i < arr.length; i++)
			arr[arr.length - i - 1] = rea[i]; //index4���� 1���� �ٽ� ���������ν� �������� ����

	}
}

public class Test2 {
	public static void main(String[] args) {
		int[] arr = new int[5]; //ũ�Ⱑ 5�� �迭 ����
		ReArray t2 = new ReArray(); //��ü ����

		Scanner input = new Scanner(System.in);

		System.out.print("�Է� : ");
		for (int i = 0; i < arr.length; i++)
			arr[i] = input.nextInt(); //���ʷ� ������ �Է¹���

		input.close();

		t2.reVerse(arr); //�޼ҵ� ȣ��

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " "); //�迭 ���

	}
}
