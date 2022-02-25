class Cal {
	
	public void add(int x, int y) {
		int result = x + y;
		println(result);
	}
	
	public void add(int x, double y) {
		double result = x+y;
		println(result);
	}
	
	public void add(double x, double y) {
		double result = x+y;
		println(result);
	}
	
	public void println(double x) {
		System.out.println(x);
	}
}


public class MethodEx {
	public static void main(String[] args) {
		Cal c = new Cal();
		
		c.add(5, 0.5);
	}
}
