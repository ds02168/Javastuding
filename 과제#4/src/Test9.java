import java.util.*;

class Lotto{ //�ζ� ��÷ Ŭ����
	Random r;
	int Select, index=0, temp; //Select�� ������ ���� ������ ����
	boolean[] mark; //�̹� ���� ������ üũ�ϴ� �迭
	int[] Num; //6�ڸ��� ���� �迭
	Lotto() {
		r=new Random();
		mark = new boolean[46];
		Num = new int[6];
		for(int i=0;i<46;i++) { //false�� �ʱ�ȭ
			mark[i]=false;
		}
	}
	public void StartLotto() {
		while(index<6) { //6�ڸ� ��
			index++;
			Select = r.nextInt(45)+1;
			
			if(mark[Select] == false) { //���� �����̸�
				Num[index-1]=Select; //���
				mark[Select] = true; //üũ�صּ� ������ �� ���õǰ� ��
			}
			else { //�̹� ���� ���̸�
				index--;
				continue; //�ٽ� ���� ����
			}
		}
		
		for(int i=0;i<6;i++)
			for(int j=i+1;j<6;j++) {
				if(Num[i]>Num[j]) {
					temp = Num[i];
					Num[i]=Num[j];
					Num[j]=temp;
				} //���� ���� ��������
			}
		
		System.out.print("��� : ");
		for(int i=0;i<6;i++)
			System.out.print(Num[i] + " "); //��� ���
		
	}
	
}

public class Test9 {
	public static void main(String[] args) {
		Lotto t9 = new Lotto(); //�ζ� ��ü ����
		t9.StartLotto(); //�ζ� ��÷ ����
	}
}
