import java.util.*;

class Now { //���� �ð��� ����ϴ� Ŭ����

	private int year, month, day, hour, minute, second, wek;
	private String week;

	Now() {
		Calendar c = Calendar.getInstance();
		year = c.get(Calendar.YEAR); //��
		month = c.get(Calendar.MONTH); //��
		day = c.get(Calendar.DAY_OF_MONTH); //��
		wek = c.get(Calendar.DAY_OF_WEEK); //����
		hour = c.get(Calendar.HOUR_OF_DAY); //�ð�
		minute = c.get(Calendar.MINUTE); //��
		second = c.get(Calendar.SECOND); //��

		switch (wek) { //������ ����ƽ ������ �����̹Ƿ� string���� ��ȯ
		case Calendar.MONDAY: //0
			week = "��";
			break;
		case Calendar.TUESDAY: //1
			week = "ȭ";
			break;
		case Calendar.WEDNESDAY: //2
			week = "��";
			break;
		case Calendar.THURSDAY: //3
			week = "��";
			break;
		case Calendar.FRIDAY: //4
			week = "��";
			break;
		case Calendar.SATURDAY: //5
			week = "��";
			break;
		case Calendar.SUNDAY: //6
			week = "��";
			break;
		}

	}

	public String getNow() { //��� ��� �޼ҵ�
		return year + "�� " + month + "�� " + day + "�� " + week + "���� " + hour + "�� " + minute + "�� " + second + "�� �Դϴ�.";
	}
}

public class Test3 {
	public static void main(String[] args) {
		Now t3 = new Now();
		System.out.println("��� : " + t3.getNow()); //��� ���
	}
}
