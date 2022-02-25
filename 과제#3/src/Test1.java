
public class Test1 {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "Hello";
		String c = "Java";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");

		if (a == b) //a와 b가 가리키는 주소가 같다
			System.out.println("a == b true"); // 1)a

		if (f.equals(c)) //f와 c의 유니코드가 같다
			System.out.println("f == c true");

		if (f.equals(e)) //f와 e의 유니코드가 같다
			System.out.println("f == e true"); // 2)c,e

	}

}
