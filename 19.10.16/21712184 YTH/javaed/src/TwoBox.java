class Box {
	int width;
	int height;
	int depth;
}

public class TwoBox {
	public static void main(String[] args) {
		int vol1, vol2;

		Box mb1 = new Box();
		Box mb2 = new Box();

		mb1.width = 10;
		mb1.height = 20;
		mb1.depth = 30;

		vol1 = mb1.width * mb1.height * mb1.depth;

		System.out.println("Box1 volume = " + vol1 + "��.");

		mb2.width = 20;
		mb2.height = 30;
		mb2.depth = 40;

		vol2 = mb2.width * mb2.height * mb2.depth;
		
		System.out.println("Box2 volume = " + vol2 + "��.");

		
	}
}
