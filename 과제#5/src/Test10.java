import java.io.*;
import java.util.*;

public class Test10 {
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		
		FileWriter fw = new FileWriter("output10.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		FileReader fr = new FileReader("output10.txt");
		BufferedReader br = new BufferedReader(fr);
		
		boolean flag10 = true;
		br.mark(1);
		while(true) {
			String s101 = input.nextLine();

			if(s101.equals("±×¸¸"))
				break;
			
			s101 = s101.toLowerCase();
			flag10 = true;
			br.reset();
			while(true) {
				String s102 = br.readLine();
				System.out.println(s102);
				System.out.println(s101);
				if(s102 == null) {
					break;
				}
				if(s102.equals(s101)) {
					flag10 = false;
					break;
				}
			}
			
			System.out.println(flag10);
			if(flag10 == true)
				pw.println(s101);
			
		}
		fr.close();
		br.close();
		input.close();
		fw.close();
		pw.close();
	}
}
