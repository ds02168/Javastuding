
public class Test1 {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "Hello";
		String c = "Java";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");

		if (a == b) //a�� b�� ����Ű�� �ּҰ� ����
			System.out.println("a == b true"); // 1)a

		if (f.equals(c)) //f�� c�� �����ڵ尡 ����
			System.out.println("f == c true");

		if (f.equals(e)) //f�� e�� �����ڵ尡 ����
			System.out.println("f == e true"); // 2)c,e

	}

}
