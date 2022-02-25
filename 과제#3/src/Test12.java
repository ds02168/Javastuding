import java.util.*;

class CalcString { //덧셈과 뺄셈을 하는 클래스
	public int getValue(String in) { //'+'로 먼저구분후 '-'도 구분하여 계산하는 메소드
		int sum = 0, index; //sum=0으로 초기화 '-'로 두번 split하기위한 index
		String[] intvalue; //'+'로 split한 문자열들을 가리킬 래퍼런스
		intvalue = in.split("\\+"); //'+'로 구분

		String[] minus; //'-'로 split한 문자열들을 가리킬 레퍼런스

		for (int i = 0; i < intvalue.length; i++) { //'+'로 먼저 구분한 문자열들을
			minus = intvalue[i].split("\\-"); //'-'로 구분

			for (int j = 1; j < minus.length; j++) //'+'문자배열들 속 '-'들을 먼저
				sum -= Integer.parseInt(minus[j]); //빼줌

			index = intvalue[i].indexOf('-'); //'-'뒤에 숫자,수식들은 이미다 계산하였으므로 
			//문자열에서 제외시켜 계산에서 제외시키기 위한 첫번째 '-'의 index를 저장

			if (index != -1) // '-'가 없는 경우('+'만 있는 경우)는 제외
				intvalue[i] = intvalue[i].substring(0, index); //'-'이전값들만 더해주기위해
			//'+'로 구분한다음 '-'로 구분해서 intvalue[i]에는 정수-정수-정수-정수-정수.....-정수 만있으므로
			//맨앞 정수만 더해주기위해 첫번째 '-'포함 뒤는 필요없음
			//ex)A-B-C-D+E-F ->intvalue[0]=A-B-C-D, intvalue[1]=E-F
		}

		for (int i = 0; i < intvalue.length; i++) { //+연산들을 수행
			if (!intvalue[i].equals("")) // 수식 첫 정수가 음수인경우 제외하고
				sum += Integer.parseInt(intvalue[i]);//+연산,맨앞정수를 더해줌
		}

		return sum; //결과 반환
	}
}

public class Test12 {
	public static void main(String[] args) {
		String s12;
		Scanner input = new Scanner(System.in);
		CalcString t12 = new CalcString();

		System.out.print("입력 : ");
		s12 = input.nextLine(); //수식 문자열을 입력받음
		input.close();

		System.out.print("출력 : " + t12.getValue(s12)); //결과 출력
	}
}
