class Person {
	private int age;
	private double id;
	
	public Person() {
		this(0.3, 25);
	}
	public Person(int age, double id) {
		this(id,age);
	}
	public Person (double id, int age) {
		this.age =age;
		this.id =id;
	}
	public void setAge(int a) {
		age=a-1;
	}
}

public class ConstEx {
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.age = 10;
		p1.setAge(10);
		Person p2 = new Person();
//		p2.age = 20;
		p2.setAge(20);
		Person p3 = new Person();
//		p3.age = 30;
		
	}
}
