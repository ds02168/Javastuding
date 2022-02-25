import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		String name;
		int age;
		int number;

		Scanner input = new Scanner(System.in);

		System.out.println("이름? ");
		name = input.next();

		System.out.println("나이? ");
		age = input.nextInt();

		System.out.println("학번? ");
		number = input.nextInt();

		System.out.println();
		System.out.println("이름= " + name);
		System.out.println("나이= " + age);
		System.out.println("학번= " + number);

		input.close();
	}
}
