import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EngDic {
	public static void main(String[] args) {
		Map<String,String> st = new HashMap<String,String>();
		
		st.put("map","����");
		st.put("school","�б�");
		st.put("boy","�ҳ�");
		st.put("girl","�ҳ�");
		st.put("lady","����");

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("���� �ܾ� �Է�>> ");
			String key = sc.next();
			if(key.equals("quit"))	break;
			
			System.out.println("�ѱ��� �뿪�� => " + st.get(key));
			
		}while(true);
		
		sc.close();
	}
}
