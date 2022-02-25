import java.io.*;

public class Test8 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("input8.txt");
		BufferedReader br = new BufferedReader(fr);

		FileWriter fw = new FileWriter("output8.txt");
		PrintWriter pw = new PrintWriter(fw);

		int i = 1;
		while (true) {
			String s = br.readLine();
			if (s == null)
				break;
			s = i + ": " + s;
			pw.println(s);
			i++;
		}

		fr.close();
		br.close();
		fw.close();
		pw.close();

	}
}
