import java.util.Vector;

public class VecterTst {
	public static void main(String[] args) {
		
		Vector vc = new Vector();
		
		vc.add("Hello World!");
		vc.add(10);
		vc.add(new Integer(20));
		
		System.out.println("vecoter size = " + vc.size());
		
		for(int i=0;i<vc.size();i++)
			System.out.println("vector " + i + ":" + vc.get(i));
		
		String s = (String)vc.get(0);
	}
}
