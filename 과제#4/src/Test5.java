import java.util.*;

class Circle5 { //circle Ŭ����
	private double r;
	Circle5(double r) {
		this.r=r;
	}
	public double getArea() {
		return 3.14*r*r;
	}
}


public class Test5 {
	public static void main(String[] args) {
		double temp;
		double[] d = new double[10]; //Circle�� ������ ������ �迭
		Circle5[] c = new Circle5[10]; //Circle��ü ������ �迭
		Random t5 = new Random();
		for(int i=0;i<c.length;i++) {
			c[i] = new Circle5((t5.nextDouble()*19)+1.0); //1.0~20.0 ������ ��ü����
			d[i] = c[i].getArea(); //��ü���� ���� ����
		}

		for(int i=0;i<d.length;i++)
			for(int j=i;j<d.length;j++) {
				if(d[i]<d[j]) {
					temp=d[i];
					d[i]=d[j];
					d[j]=temp;
				} //���� ����
			}
		System.out.println("��� : ");
		for(int i=0;i<d.length;i++)
			System.out.println(d[i]); //�������� ���
		
	}
}
