import java.io.*;
import java.util.*;

public class Test5 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("input5.txt");
		Scanner input = new Scanner(fr);
		int a = input.nextInt();
		int b = input.nextInt();

		fr.close();
		input.close();

		FileWriter fw = new FileWriter("output5.txt");
		fw.write(Integer.toString(a + b));

		fw.close();
	}
}
