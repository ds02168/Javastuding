import java.io.*;

public class Test9 {
	public static void main(String[] args) throws Exception {
		FileReader fr1 = new FileReader("input91.txt");
		FileReader fr2 = new FileReader("input92.txt");
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);

		String s91, s92;
		boolean flag9 = true;

		while (true) {
			s91 = br1.readLine();
			s92 = br2.readLine();

			if (s91 == null && s92 == null)
				break;

			if ((s91 == null && s92 != null) || (s91 != null && s92 == null) || !s91.equals(s92)) {
				flag9 = false;
				break;
			}

		}

		if (flag9)
			System.out.println("input1.txt와 input2.txt는 같습니다.");
		else
			System.out.println("input1.txt와 input2.txt는 같지 않습니다.");

		fr1.close();
		fr2.close();
		br1.close();
		br2.close();
	}
}
