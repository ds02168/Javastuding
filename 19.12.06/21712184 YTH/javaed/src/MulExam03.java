
public class MulExam03 {
	public static void main(String[] args) {
		char arr[] = {'��','��','��','��','��','��','��','��','��','��','��','��','��','��'};
		
		Thread th = new Thread(new SmallLett());
		th.start();
		
		for(char ch:arr)
			System.out.print(ch);
		
		
		
	}
}
