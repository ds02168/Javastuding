
public class CalcThread extends Thread {

	SharedArea sA;

	public void run() {
		double tot = 0.0;
		for (int i = 1; i < 1000000; i += 2)
			if (i / 2 % 2 == 0)
				tot += 1.0 / i;
			else
				tot -= 1.0 / i;

		sA.result = tot * 4;
		sA.isReady = true;
	}
}
