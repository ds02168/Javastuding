import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		String name;
		int age;
		int number;

		Scanner input = new Scanner(System.in);

		System.out.println("�̸�? ");
		name = input.next();

		System.out.println("����? ");
		age = input.nextInt();

		System.out.println("�й�? ");
		number = input.nextInt();

		System.out.println();
		System.out.println("�̸�= " + name);
		System.out.println("����= " + age);
		System.out.println("�й�= " + number);

		input.close();
	}
}
