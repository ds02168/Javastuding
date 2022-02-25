import java.util.*;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String,Integer> sm = new HashMap<String,Integer>();
		
		sm.put("���繮",70);
		sm.put("�ѿ���",99);
		sm.put("�賲��",98);
		sm.put("�輺��",97);
		sm.put("Ȳ����",88);
		
		System.out.println("��Ұ���: " + sm.size());
		
		Set<String> keys = sm.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = sm.get(name);
			System.out.println(name + ": " + score);
		}
	}

}
