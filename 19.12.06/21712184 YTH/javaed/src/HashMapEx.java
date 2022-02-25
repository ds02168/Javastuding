import java.util.*;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String,Integer> sm = new HashMap<String,Integer>();
		
		sm.put("이재문",70);
		sm.put("한원선",99);
		sm.put("김남윤",98);
		sm.put("김성동",97);
		sm.put("황기태",88);
		
		System.out.println("요소개수: " + sm.size());
		
		Set<String> keys = sm.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = sm.get(name);
			System.out.println(name + ": " + score);
		}
	}

}
