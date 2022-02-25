
class SimpPair<T> {
	private T data1;
	private T data2;

	SimpPair(T data1, T data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

	public T getFirst() {
		return data1;
	}

	public T getSecond() {
		return data2;
	}

	public void setFirst(T data1) {
		this.data1 = data1;
	}

	public void setSecond(T data2) {
		this.data2 = data2;
	}
}

public class SimpPairTst {
	public static void main(String[] args) {
		SimpPair<Double> p = new SimpPair<Double>(1.2,3.4);
		
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
	}
}
