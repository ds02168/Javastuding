import java.util.*;

class UPnDOWN_Game{ //���ٿ� ���� Ŭ����
	Random r = new Random();
	private int answer; //����
	Scanner input = new Scanner(System.in);
	private int num; //����� �Է�
	UPnDOWN_Game(){
		answer = r.nextInt(100)+1; //���� ���� 
	}
	
	public void PlayingGame() {
		System.out.println("1�̻� 100���� UP DOWN ����");
		while(true) { //���⶧ ����
			System.out.print("�Է� : ");
			num=input.nextInt();
			
			if(answer==num) //����
				break;
			else if(answer>num) //answer���� �Ʒ��϶�
				System.out.println("UP");
			else
				System.out.println("DOWN"); //answer���� ���϶�
		}
		System.out.println("EXACT"); //���� �˸�
	}
}

public class Test7 {
	public static void main(String[] args) {
		UPnDOWN_Game t7 = new UPnDOWN_Game(); //���ٿ� ���� ��ü ����
		
		t7.PlayingGame(); //���� ����
	}
}
