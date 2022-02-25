import java.util.*;

class Circle5 { //circle 클래스
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
		double[] d = new double[10]; //Circle의 면적을 저장할 배열
		Circle5[] c = new Circle5[10]; //Circle객체 저장할 배열
		Random t5 = new Random();
		for(int i=0;i<c.length;i++) {
			c[i] = new Circle5((t5.nextDouble()*19)+1.0); //1.0~20.0 반지름 객체생성
			d[i] = c[i].getArea(); //객체들의 원의 넓이
		}

		for(int i=0;i<d.length;i++)
			for(int j=i;j<d.length;j++) {
				if(d[i]<d[j]) {
					temp=d[i];
					d[i]=d[j];
					d[j]=temp;
				} //선택 정렬
			}
		System.out.println("출력 : ");
		for(int i=0;i<d.length;i++)
			System.out.println(d[i]); //내림차순 출력
		
	}
}
