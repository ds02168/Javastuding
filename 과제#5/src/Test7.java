import java.io.*;
import java.util.*;

public class Test7 {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("output7.txt", true);
		PrintWriter pw = new PrintWriter(fw);
		Scanner input = new Scanner(System.in);
		String s7;
		System.out.print("ют╥б : ");
		s7 = input.nextLine();

		pw.print(s7);

		fw.close();
		pw.close();
		input.close();
	}
}
