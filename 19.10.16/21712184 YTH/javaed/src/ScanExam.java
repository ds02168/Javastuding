import java.util.Scanner;

public class ScanExam {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("name > ");
		String name = in.next();

		System.out.print("age > ");
		int age = in.nextInt();

		System.out.print("weight > ");
		double weight = in.nextDouble();

		in.nextLine();
		
		System.out.print("addr > ");
		String addr = in.nextLine();

		in.close();

		System.out.println(
				"NAME = " + name + "\n" + "Age = " + age + "\n" + "Weight = " + weight + "\n" + "Adress = " + addr);

	}
}
