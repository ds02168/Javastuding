
public class MulExam03 {
	public static void main(String[] args) {
		char arr[] = {'ぁ','い','ぇ','ぉ','け','げ','さ','し','じ','ず','ぜ','せ','そ','ぞ'};
		
		Thread th = new Thread(new SmallLett());
		th.start();
		
		for(char ch:arr)
			System.out.print(ch);
		
		
		
	}
}
