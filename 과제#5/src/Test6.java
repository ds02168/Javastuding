import java.io.*;
import java.util.*;

public class Test6 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("input6.txt");
		BufferedReader br = new BufferedReader(fr);
		Scanner input = new Scanner(br);
		int sum = 0;
		String s = br.readLine();
		String[] tok;
		tok = s.split(" ");
		for (int i = 0; i < tok.length; i++) {
			System.out.print(tok[i] + " ");
			sum += Integer.parseInt(tok[i]);
		}

		fr.close();
		input.close();

		FileWriter fw = new FileWriter("output6.txt");
		fw.write(Integer.toString(sum));

		fw.close();
	}
}
