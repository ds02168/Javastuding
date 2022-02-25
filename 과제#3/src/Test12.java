import java.util.*;

class CalcString { //������ ������ �ϴ� Ŭ����
	public int getValue(String in) { //'+'�� ���������� '-'�� �����Ͽ� ����ϴ� �޼ҵ�
		int sum = 0, index; //sum=0���� �ʱ�ȭ '-'�� �ι� split�ϱ����� index
		String[] intvalue; //'+'�� split�� ���ڿ����� ����ų ���۷���
		intvalue = in.split("\\+"); //'+'�� ����

		String[] minus; //'-'�� split�� ���ڿ����� ����ų ���۷���

		for (int i = 0; i < intvalue.length; i++) { //'+'�� ���� ������ ���ڿ�����
			minus = intvalue[i].split("\\-"); //'-'�� ����

			for (int j = 1; j < minus.length; j++) //'+'���ڹ迭�� �� '-'���� ����
				sum -= Integer.parseInt(minus[j]); //����

			index = intvalue[i].indexOf('-'); //'-'�ڿ� ����,���ĵ��� �̴̹� ����Ͽ����Ƿ� 
			//���ڿ����� ���ܽ��� ��꿡�� ���ܽ�Ű�� ���� ù��° '-'�� index�� ����

			if (index != -1) // '-'�� ���� ���('+'�� �ִ� ���)�� ����
				intvalue[i] = intvalue[i].substring(0, index); //'-'�������鸸 �����ֱ�����
			//'+'�� �����Ѵ��� '-'�� �����ؼ� intvalue[i]���� ����-����-����-����-����.....-���� �������Ƿ�
			//�Ǿ� ������ �����ֱ����� ù��° '-'���� �ڴ� �ʿ����
			//ex)A-B-C-D+E-F ->intvalue[0]=A-B-C-D, intvalue[1]=E-F
		}

		for (int i = 0; i < intvalue.length; i++) { //+������� ����
			if (!intvalue[i].equals("")) // ���� ù ������ �����ΰ�� �����ϰ�
				sum += Integer.parseInt(intvalue[i]);//+����,�Ǿ������� ������
		}

		return sum; //��� ��ȯ
	}
}

public class Test12 {
	public static void main(String[] args) {
		String s12;
		Scanner input = new Scanner(System.in);
		CalcString t12 = new CalcString();

		System.out.print("�Է� : ");
		s12 = input.nextLine(); //���� ���ڿ��� �Է¹���
		input.close();

		System.out.print("��� : " + t12.getValue(s12)); //��� ���
	}
}
