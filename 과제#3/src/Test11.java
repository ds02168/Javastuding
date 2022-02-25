import java.util.*;

class ContinuityBuffer { //������ �°� ���ڷ� �ٲٴ� Ŭ����
	public String getBuffer(StringBuffer in) { //3���̻� ��ġ�Ұ�� �������ִ� �޼ҵ�
		int count; //������ �� ����
		char c, d; //c=���� ���� , d�� ������ Ȯ���ϱ� ���� ����
		String out; //������ ������ string Ŭ����
		StringBuffer upten; // 10�̻��϶� ���ڷ� �ݴ�� �ǹǷ� ���۷� ���� �ݴ�� ����
		in = in.reverse(); //��������(������ ���ϱ� ����)
		for (int i = 0; i < in.length(); i++) { //�ڿ������� ������
			count = 1; //���� ���� �ڱ��ڽ� �����̹Ƿ� 1�� �ʱ�ȭ
			c = in.charAt(i); //���ڸ�  c�� ����
			for (int j = i + 1; j < in.length(); j++) { //j=i+1�� �� ���ڵ��� Ȯ����
				d = in.charAt(j); //�޹��ڵ��� ����
				if (c == d) //�ѹ��ھ� ���ϸ� ���ӵ�������
					count++; //��������
				else //�ƴϸ�
					break; // ���� ����
			}

			if (count >= 3) { //3���̻��̸�
				in.delete(i + 1, i + count); //�ߺ��Ǵ� �κ� ����
				if (count < 10) //���ڸ�����
					in.insert(i + 1, count); //�׳� �������
				else { //���ڸ��� �̻��̸�
					out = Integer.toString(count); //���ڿ��� �ٲ۴���
					upten = new StringBuffer(out); //���ۿ� �ְ�
					upten.reverse(); //���ڸ� �ݴ�� ex)10->01���ϰ�
					in.insert(i + 1, upten); //����
				} //�ٽ� ����� �������ڿ��� �ٲ��־�� �ϱ⶧��
			}
		}

		in = in.reverse(); //�ٽ� ����� �������ڿ�
		out = in.toString(); //���� ���ڹ迭�� ���ڿ���
		return out; //��� ��ȯ
	}
}

public class Test11 {
	public static void main(String[] args) {
		String s11; //���ڿ��� ������ Ŭ����
		StringBuffer sb11; //������ ������ �񱳸� �ǽð����� �ϱ����� ���� Ŭ����
		Scanner input = new Scanner(System.in);
		ContinuityBuffer t11 = new ContinuityBuffer();

		System.out.print("�Է� : ");
		s11 = input.nextLine(); //���ڿ� �Է�
		input.close();

		sb11 = new StringBuffer(s11); //������ �������� ����Ŭ����
		s11 = t11.getBuffer(sb11); //����� ���ڿ��� ����

		System.out.println("��� : " + s11); //������
	}
}
