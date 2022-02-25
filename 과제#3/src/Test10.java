import java.util.*;

class ChangeCase { //대소문자구분하지않고 2개이상의 문자열 사전순으로 출력 클래스
	public String getCase(String[] in) { //문자열을 얻는 메소드
		String[] SameTwo = { "", "" }; // 5개입력중 같은것이 많아야 2개 이므로 2개이상의 문자열을 저장할 배열
		int index = 0; //2개이상의 단어들을 구분하기위해 쓰는 변수
		String result; //결과를 저장할 string클래스

		for (int i = 0; i < in.length; i++) {
			for (int j = i + 1; j < in.length; j++) { //순차적으로 비교하며
				if (in[i].equalsIgnoreCase(in[j])) { //대소문자구분없이 같으면
					if (!SameTwo[index].equalsIgnoreCase(in[i])) { //현재 저장한 2개이상 문자열과 다른 2개이상의 문자열이 있다면
						SameTwo[index] = in[i].toLowerCase(); //소문자로 저장
						SameTwo[index] = SameTwo[index].concat(" "); //' '으로 구분
						index++; //index로 2개 구분
					}
				}
			}
		}

		if (SameTwo[0].compareTo(SameTwo[1]) == 1) //첫번재가 2번째보다 뒤에 있다면
			result = SameTwo[1].concat(SameTwo[0]); //2번째에 첫번째를 붙힘
		else // SameTwo[0]과 SameTwo[1]이 같은 경우는 없으므로 아닌경우는 첫번째가 2번째보다 앞에있음
			result = SameTwo[0].concat(SameTwo[1]); //1번째에 2번째를 붙힘

		return result; //결과 반환
	}
}

public class Test10 {
	public static void main(String[] args) {
		String[] s10 = new String[5]; //5개의 입력 문자열배열
		Scanner input = new Scanner(System.in);
		ChangeCase t10 = new ChangeCase();

		for (int i = 0; i < s10.length; i++) {
			System.out.print("출력 : ");
			s10[i] = input.nextLine(); //5개의 문자열 입력
		}

		input.close();
		System.out.println("출력 : " + t10.getCase(s10)); //결과 출력
	}
}
