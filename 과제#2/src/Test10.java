import java.util.Scanner;

class SquarePoint {
	int[] x = new int[3]; //1~2는 동일한 좌표를 셈
	int[] y = new int[3]; //1~2는 동일한 좌표를 셈
	private int x3, y3; //1번째와 다른 좌표값을 저장하는 변수
	int[][] p;

	SquarePoint(int[][] p) { //생성자
		this.p = p;
	}

	int[][] getPoint() { //사각형이 x좌표값 2개씩 y좌표값 2개씩 쌍을 이루는 특징을 이용하여 나머지 한 좌표를 구하는 메소드

		x[1] = 0; //1번째 좌표값
		y[1] = 0; //1번째 좌표값
		x[2] = 0; //1번째와 다른 좌표값
		y[2] = 0; //1번째와 다른 좌표값
		//좌표의 갯수를 세는 배열
		
		x[0] = p[0][0]; // 첫번째 x값
		y[0] = p[0][1]; // 첫번째 y값

		for (int i = 0; i < 3; i++) {
			if (x[0] == p[i][0]) //첫번째 x좌표와 비교해서 같으면
				x[1]++; //index 1에 갯수 증가
			else { //다르면
				x[2]++;  //index 2에 갯수증가
				x3 = p[i][0]; //다른 좌표값을 저장
			}

			if (y[0] == p[i][1]) //첫번째 y좌표와 비교해서 같으면
				y[1]++; //index 1에 갯수 증가
			else { //다르면
				y[2]++; //index 2에 갯수증가
				y3 = p[i][1]; //다른 좌표값을 저장
			}
		}

		// 사각형의 4점중 x,y좦값이 2개씩 쌍을이루어야 하므로 마지막점의  좌표는 1개밖에 없는 좌표값과 동일한 좌표값을 가짐 
		if (x[1] > x[2])
			p[3][0] = x3;
		else
			p[3][0] = x[0]; //1개밖에 없는 x좌표값을 저장

		if (y[1] > y[2])
			p[3][1] = y3;
		else
			p[3][1] = y[0]; //1개밖에 없는 좌표값을 저장

		return p; //배열 반환
	}
}

public class Test10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] p = new int[4][]; //2차원 배열 생성
		for (int i = 0; i < p.length; i++)
			p[i] = new int[2];//x와 y의 좌표를 저장하므로 1행에 2열

		for (int i = 0; i < 3; i++) { //1~3번째 좌표까지

			System.out.print("입력 : ");
			p[i][0] = input.nextInt(); //x좌표 입력
			p[i][1] = input.nextInt(); //y좌표 입력
		}

		input.close();

		SquarePoint t10 = new SquarePoint(p); //객체생성
		t10.getPoint(); //메소드 호출

		System.out.println("출력 : " + p[3][0] + " " + p[3][1]); //결과 출력
	}
}
