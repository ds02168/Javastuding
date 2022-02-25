import java.io.*;
import java.util.*;

public class Test3 {
	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("input3.dat");
		BufferedInputStream bin = new BufferedInputStream(fin);
		byte[] ba = new byte[30];
		bin.read(ba);
		

		fin.close();
		bin.close();
		
		FileOutputStream fout = new FileOutputStream("output3.dat");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		
		bout.write(ba);
		bout.flush();

		
		fout.close();
		bout.close();
	}
}
