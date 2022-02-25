
public class GenericMethodTst {
	public static void main(String[] args) {
		Integer[] iArry = {10,20,30,40,50};
		Double[] dArry = {1.1, 2.2, 3.3};
		Character[] cArry = {'K','O','R'};
		
		prtArry(iArry);
		prtArry(dArry);
		prtArry(cArry);
	}
	
	static <T> void prtArry(T[] arry) {
		for(T val:arry)
			System.out.printf("%s ", val);
		
		System.out.println();
	}
}
