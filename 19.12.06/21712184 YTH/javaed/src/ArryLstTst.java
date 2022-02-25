import java.util.ArrayList;
public class ArryLstTst {
	public static void main(String[] args) {
		ArrayList<String> ls = new ArrayList<String>();
	
		ls.add("MILK");
		ls.add("BREAD");
		ls.add("BUTTER");
		
		ls.add(1,"APPLE");
		ls.set(2,"GRAPE");
		ls.remove(1);
		
		for(String s : ls)
			System.out.print(s + " ");
	}
}
