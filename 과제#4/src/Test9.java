import java.util.*;

class Lotto{ //로또 추첨 클래스
	Random r;
	int Select, index=0, temp; //Select는 임의의 값을 가지는 변수
	boolean[] mark; //이미 나온 수인지 체크하는 배열
	int[] Num; //6자리수 저장 배열
	Lotto() {
		r=new Random();
		mark = new boolean[46];
		Num = new int[6];
		for(int i=0;i<46;i++) { //false로 초기화
			mark[i]=false;
		}
	}
	public void StartLotto() {
		while(index<6) { //6자리 수
			index++;
			Select = r.nextInt(45)+1;
			
			if(mark[Select] == false) { //없는 난수이면
				Num[index-1]=Select; //등록
				mark[Select] = true; //체크해둬서 다음에 못 선택되게 함
			}
			else { //이미 나온 수이면
				index--;
				continue; //다시 난수 돌림
			}
		}
		
		for(int i=0;i<6;i++)
			for(int j=i+1;j<6;j++) {
				if(Num[i]>Num[j]) {
					temp = Num[i];
					Num[i]=Num[j];
					Num[j]=temp;
				} //선택 정렬 오름차순
			}
		
		System.out.print("출력 : ");
		for(int i=0;i<6;i++)
			System.out.print(Num[i] + " "); //결과 출력
		
	}
	
}

public class Test9 {
	public static void main(String[] args) {
		Lotto t9 = new Lotto(); //로또 객체 생성
		t9.StartLotto(); //로또 추첨 실행
	}
}
