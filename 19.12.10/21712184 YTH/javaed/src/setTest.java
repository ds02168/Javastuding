import java.util.*;

public class setTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		String[] sample = { "�ܾ�", "�ߺ�", "����", "�ߺ�" };

		for (String a : sample) {
			if (!set.add(a))
				System.out.println("�ߺ��Ǵ� �ܾ� " + a);
		}

		System.out.println(set.size() + "�ߺ����� ���� �ܾ�: " + set);
	}

}
