import java.util.*;

class ContinuityBuffer { //갯수에 맞게 숫자로 바꾸는 클래스
	public String getBuffer(StringBuffer in) { //3번이상 위치할경우 압축해주는 메소드
		int count; //갯수를 셀 변수
		char c, d; //c=비교할 문자 , d는 같은지 확인하기 위한 문자
		String out; //압축결과 저장할 string 클래스
		StringBuffer upten; // 10이상일때 숫자로 반대로 되므로 버퍼로 따로 반대로 넣음
		in = in.reverse(); //뒤집어줌(갯수를 비교하기 위해)
		for (int i = 0; i < in.length(); i++) { //뒤에서부터 갯수셈
			count = 1; //비교할 문자 자기자신 포함이므로 1로 초기화
			c = in.charAt(i); //문자를  c에 넣음
			for (int j = i + 1; j < in.length(); j++) { //j=i+1로 뒷 문자들을 확인함
				d = in.charAt(j); //뒷문자들을 얻음
				if (c == d) //한문자씩 비교하며 연속되있으면
					count++; //갯수증가
				else //아니면
					break; // 다음 문자
			}

			if (count >= 3) { //3개이상이면
				in.delete(i + 1, i + count); //중복되는 부분 삭제
				if (count < 10) //한자리수면
					in.insert(i + 1, count); //그냥 집어넣음
				else { //두자릿수 이상이면
					out = Integer.toString(count); //문자열로 바꾼다음
					upten = new StringBuffer(out); //버퍼에 넣고
					upten.reverse(); //숫자를 반대로 ex)10->01로하고
					in.insert(i + 1, upten); //삽입
				} //다시 뒤집어서 원래문자열로 바꿔주어야 하기때문
			}
		}

		in = in.reverse(); //다시 뒤집어서 원래문자열
		out = in.toString(); //버퍼 문자배열을 문자열로
		return out; //결과 반환
	}
}

public class Test11 {
	public static void main(String[] args) {
		String s11; //문자열을 저장할 클래스
		StringBuffer sb11; //순서를 뒤집고 비교를 실시간으로 하기위한 버퍼 클래스
		Scanner input = new Scanner(System.in);
		ContinuityBuffer t11 = new ContinuityBuffer();

		System.out.print("입력 : ");
		s11 = input.nextLine(); //문자열 입력
		input.close();

		sb11 = new StringBuffer(s11); //갯수를 세기위한 버퍼클래스
		s11 = t11.getBuffer(sb11); //결과를 문자열로 저장

		System.out.println("출력 : " + s11); //결과출력
	}
}
