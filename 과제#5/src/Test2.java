import java.io.*;
import java.util.*;


public class Test2 {
	public static void main(String[] args) throws Exception{
		FileOutputStream fout = new FileOutputStream("output2.dat");
		DataOutputStream dout = new DataOutputStream(fout);
		Scanner input = new Scanner(System.in);
		
		System.out.print("int : ");
		dout.writeInt(input.nextInt());
		
		System.out.print("double : ");
		dout.writeDouble(input.nextDouble());
		
		System.out.print("char : ");
		String s = input.next();
		dout.writeChar(s.charAt(0));
		
		System.out.print("boolean: ");
		dout.writeBoolean(input.nextBoolean());
		
		fout.close();
		dout.close();
		input.close();
		
		FileInputStream fin = new FileInputStream("output2.dat");
		DataInputStream din = new DataInputStream(fin);
		
		System.out.println("Ãâ·Â : " + din.readInt() + " " + din.readDouble()
		 + " " + din.readChar() + " " + din.readBoolean());
		
		fin.close();
		din.close();
	}
}
