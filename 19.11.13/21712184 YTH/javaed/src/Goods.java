
public class Goods {

	String name;
	int price, numOfStock, sold;

	public static void main(String[] args) {

		Goods cam = new Goods();

		cam.name = "Samgsung";
		cam.price = 400000;
		cam.numOfStock = 30;
		cam.sold = 50;

		System.out.println("ī�޶� �̸� = " + cam.name);
		System.out.println("ī�޶� ���� = " + cam.price);
		System.out.println("ī�޶� ��� = " + cam.numOfStock);
		System.out.println("ī�޶� �Ǹ� = " + cam.sold);

	}
}
