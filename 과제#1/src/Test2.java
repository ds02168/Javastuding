import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		String name; //이름
		int age; //나이
		int number; //학번

		Scanner input = new Scanner(System.in); //입력 클래스 생성

		System.out.println("이름? ");
		name = input.next();

		System.out.println("나이? ");
		age = input.nextInt();

		System.out.println("학번? ");
		number = input.nextInt();
		//이름,나이,학번을 순서대로 입력받음
		System.out.println();
		System.out.println("이름= " + name);
		System.out.println("나이= " + age);
		System.out.println("학번= " + number); //이름,나이,학번을 순서대로 출력

		input.close();//입력 클래스를 닫아줌
	}
}
