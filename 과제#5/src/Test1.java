import java.io.*;
import java.util.*;

public class Test1 {
	public static void main(String[] args) throws Exception {
		int buf;
		Scanner input = new Scanner(System.in);
		FileOutputStream fout = new FileOutputStream("output1.txt");
		DataOutputStream dout = new DataOutputStream(fout);
		
		FileInputStream fin = new FileInputStream("output1.txt");
		DataInputStream din = new DataInputStream(fin);

		int[] b = new int[5];
		System.out.print("입력 : ");
		for (int i = 0; i < b.length; i++) {
			buf = input.nextInt();
			if (!(buf <= 127 && buf >= -128))
				throw new Exception("-128부터 127사이 값이 아닙니다.");
			else
				dout.writeInt(buf);
		}

		input.close();
		dout.close();
		fout.close();

		for (int i = 0; i < b.length; i++) {
			b[i] = din.readInt();
			System.out.print(b[i] + " ");
		}

		din.close();
		fin.close();

	}
}

