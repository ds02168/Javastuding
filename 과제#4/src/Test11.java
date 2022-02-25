import java.util.*;

class MineSearch {
	Random r;
	private int w, h, n; //너비,높이,지뢰갯수
	private int mine, row, col, index = 0;
	private boolean[][] mark; //지뢰가 이미 있는지 확인하는 배열
	char[][] map; //지도를 나타낼 배열

	MineSearch(int w, int h, int n) { //지뢰찾기 클래스
		this.w = w;
		this.h = h;
		this.n = n;
		r = new Random();
		map = new char[w][h];
		mark = new boolean[w][h];
		for (int i = 0; i < w; i++) //mark를 true로 초기화
			for (int j = 0; j < h; j++)
				mark[i][j] = true;
	}

	public void createMap() { //맵을 만들어주는 메소드
		if ((w * h) < n) { //만약 맵크기보다 지뢰갯수가 많으면
			System.out.println("표시할수 있는 공간보다 표시해야할 점이 많습니다.");
			return; //종료
		}
		for (int i = 0; i < h; i++) { //난수 지도 생성
			for (int j = 0; j < w; j++) {
				map[i][j] = (char) (r.nextInt(10) + 48);
			}
		}

		while (index < n) { //지뢰를 심어준다
			index++;

			mine = r.nextInt(w * h); //2차원배열의 index 특성활용
			row = mine / h; //행은 몫
			col = mine % w;//열은 나머지

			if (mark[row][col] == false) { //지뢰가 심겨져 있으면
				index--;
				continue; //다시 심기
			}

			else { //지뢰가 없으면
				map[row][col] = '*'; //심어주고
				mark[row][col] = false; //false로 체크
			}
		}
		printMap(); //지도 출력
	}

	public void printMap() { //지도 출력 메소드
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++)
				System.out.print(map[i][j]); //지도 출력

			System.out.println();
		}
	}

}

public class Test11 {
	public static void main(String[] args) {
		int w, h, n;
		MineSearch t11;
		Scanner input = new Scanner(System.in);

		System.out.print("입력(w)(h)(n) : ");
		w = input.nextInt();
		h = input.nextInt();
		n = input.nextInt(); //너비,높이,지뢰갯수 설정
		input.close();

		t11 = new MineSearch(w, h, n); //지뢰찾기 객체
		t11.createMap(); //지뢰찾기 실행

	}
}
