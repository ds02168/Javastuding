import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EngDic {
	public static void main(String[] args) {
		Map<String,String> st = new HashMap<String,String>();
		
		st.put("map","지도");
		st.put("school","학교");
		st.put("boy","소년");
		st.put("girl","소녀");
		st.put("lady","숙녀");

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("영어 단어 입력>> ");
			String key = sc.next();
			if(key.equals("quit"))	break;
			
			System.out.println("한국어 대역어 => " + st.get(key));
			
		}while(true);
		
		sc.close();
	}
}
