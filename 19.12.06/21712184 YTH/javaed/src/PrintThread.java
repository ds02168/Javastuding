
public class PrintThread extends Thread{
	
	SharedArea sA;
	
	public void run() {
		while(sA.isReady != true)
			continue;
		System.out.println(sA.result);
	}

}
