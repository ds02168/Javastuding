import java.io.*;

public class Test4 {
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("output4.txt");

		pw.print("Hello World");
		pw.close();
	}
}
