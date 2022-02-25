
class Gstack<T> {
	private int tos;
	private Object[] stack;

	public Gstack() {
		tos = 0;
		stack = new Object[10];
	}

	public void push(T item) {
		if (tos == stack.length)
			return;
		stack[tos++] = item;
	}

	public T pop() {
		if (tos == 0)
			return null;
		return (T) stack[--tos];
	}
}

public class MyStack {
	public static void main(String[] args) {

		Gstack<String> strStack = new Gstack<String>();

		strStack.push("Seoul");
		strStack.push("Busan");
		strStack.push("LA");

		for (int i = 0; i < 3; i++)
			System.out.println(strStack.pop());
		
		Gstack<Integer> intStack = new Gstack<Integer>();
		
		intStack.push(10);
		intStack.push(100);
		intStack.push(500);
		
		for (int i = 0; i < 3; i++)
			System.out.println(intStack.pop());
	}
}
