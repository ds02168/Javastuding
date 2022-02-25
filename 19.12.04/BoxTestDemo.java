class Box {
	private int width;
	private int height;
	private int depth;
	private int vol;
	
	private double dwidth, dheight, ddepth;
	public Box() {
		width = 1;
		height = 1;
		depth = 1;
	}
	public Box(int w) {
		width = w;
		height = 1;
		depth = 1;
	}
	public Box(int w, int h) {
		width =w;
		height =h;
		depth =1;
	}
	public Box(int w, int h, int d) {
		width =w;
		height = h;
		depth = d;
	}
	public Box(double w, double h, double d)
	{
		dwidth = w;
		dheight =h;
		ddepth = d;
	}
	public int volume() {
		vol = width*height*depth;
		return vol;
	}
}


public class BoxTestDemo {
	public static void main(String args[]) {
		int vol;
		Box mybox1 = new Box();
		Box mybox2 = new Box(5);
		Box mybox3 = new Box(5,10);
		Box mybox4 = new Box(5,10,15);
		Box mybox5 = new Box(20.3,10.6,15.23);
		Box mb1 = new Box(10,20,30);
		vol = mb1.volume();
		System.out.println("mb1 °´Ã¼ÀÇ ºÎÇÇ : " + vol);
	}
}
