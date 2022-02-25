import java.util.*;

public class setTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		String[] sample = { "단어", "중복", "구절", "중복" };

		for (String a : sample) {
			if (!set.add(a))
				System.out.println("중복되는 단어 " + a);
		}

		System.out.println(set.size() + "중복되지 않은 단어: " + set);
	}

}
