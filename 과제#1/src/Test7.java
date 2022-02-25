import java.util.*;

class Cvert2 {
	private int sss;
	private int mmm;
	private int hhh;

	public Cvert2(int a) {
		sss = a % 60; //1분에 60초이므로 60으로 나눈 나머지=초
		hhh = a / 3600; //1시간은 3600초이므로 3600으로 나눈 값=시간
		mmm = (a % 3600) / 60; //3600초로 나눈 나머지에 60초를 나눈값=분
	}

	public int getHour() { //시간 반환
		return hhh;
	}

	public int getMinute() { // 분 반환
		return mmm;
	}

	public int getSecond() { // 초 반환
		return sss;
	}

}

public class Test7 {
	public static void main(String[] args) {
		int t;
		Scanner input = new Scanner(System.in);

		System.out.print("초를 입력하세요(정수) : ");
		t = input.nextInt(); //임의의 정수인 초를 입력받음
		input.close();

		Cvert2 cv2 = new Cvert2(t); //초를 시,분,초로 나누어주는 객체 생성

		System.out.println(
				"입력하신 " + t + "초는 " + cv2.getHour() + "시간 " + cv2.getMinute() + "분 " + cv2.getSecond() + "초 입니다."); //시,분,초 출력
	}

}
