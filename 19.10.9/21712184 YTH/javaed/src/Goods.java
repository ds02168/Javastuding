
public class Goods {

	String name;
	int price, numOfStock, sold;

	public static void main(String[] args) {

		Goods cam = new Goods();

		cam.name = "Samgsung";
		cam.price = 400000;
		cam.numOfStock = 30;
		cam.sold = 50;

		System.out.println("카메라 이름 = " + cam.name);
		System.out.println("카메라 가격 = " + cam.price);
		System.out.println("카메라 재고 = " + cam.numOfStock);
		System.out.println("카메라 판매 = " + cam.sold);

	}
}
