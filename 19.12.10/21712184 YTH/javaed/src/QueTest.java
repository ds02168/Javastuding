import java.util.*;

public class QueTest {
	public static void main(String[] args) throws InterruptedException {
		
		int time = 10;
		Queue<Integer> qu = new LinkedList<Integer>();
		
		for(int i=time;i>=0;i--)
			qu.add(Integer.valueOf(i));
			
		while(!qu.isEmpty()) {
			System.out.print(qu.remove() + " ");
			Thread.sleep(1000);
		}
		
	}
}
