import java.util.*;

class Now { //현재 시간을 출력하는 클래스

	private int year, month, day, hour, minute, second, wek;
	private String week;

	Now() {
		Calendar c = Calendar.getInstance();
		year = c.get(Calendar.YEAR); //년
		month = c.get(Calendar.MONTH); //월
		day = c.get(Calendar.DAY_OF_MONTH); //일
		wek = c.get(Calendar.DAY_OF_WEEK); //요일
		hour = c.get(Calendar.HOUR_OF_DAY); //시간
		minute = c.get(Calendar.MINUTE); //분
		second = c.get(Calendar.SECOND); //초

		switch (wek) { //요일의 스태틱 변수는 정수이므로 string으로 변환
		case Calendar.MONDAY: //0
			week = "월";
			break;
		case Calendar.TUESDAY: //1
			week = "화";
			break;
		case Calendar.WEDNESDAY: //2
			week = "수";
			break;
		case Calendar.THURSDAY: //3
			week = "목";
			break;
		case Calendar.FRIDAY: //4
			week = "금";
			break;
		case Calendar.SATURDAY: //5
			week = "토";
			break;
		case Calendar.SUNDAY: //6
			week = "일";
			break;
		}

	}

	public String getNow() { //결과 출력 메소드
		return year + "년 " + month + "월 " + day + "일 " + week + "요일 " + hour + "시 " + minute + "분 " + second + "초 입니다.";
	}
}

public class Test3 {
	public static void main(String[] args) {
		Now t3 = new Now();
		System.out.println("출력 : " + t3.getNow()); //결과 출력
	}
}
