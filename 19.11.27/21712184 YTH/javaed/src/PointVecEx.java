import java.util.Vector;

class Point2 <T> {
	T x;
	T y;
	Point2(T x, T y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return"(" + x + "," + y + ")";
	}
}

public class PointVecEx {
	public static void main(String[] args) {
		
		Vector<Point2> v = new Vector<Point2>();
		v.add(new Point2(2,3));
		v.add(new Point2(-5,20));
		v.add(new Point2(30,-8));
		
		v.remove(1);
		
		for(int i=0;i<v.size();i++)
			System.out.println(v.get(i));
	}
}
