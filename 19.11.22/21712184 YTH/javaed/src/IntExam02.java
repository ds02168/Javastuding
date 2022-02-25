
public class IntExam02 {

	public static void main(String[] args) {
		
		Lendable[] arr = new Lendable[3];
		arr[0] = new sepvol("883ㅇ", "푸코의진자", "에코");
		arr[1] = new sepvol("609.2", "서양미술사", "곰브리치");
		arr[2] = new AppCDinfo("02-17", "XML을 위한 자바");
		
		checkOutAll(arr, "윤지혜","20060315");
		
	}
	
	static void checkOutAll(Lendable[] arr, String bor, String date) {
		for(int i=0;i<arr.length;i++) {
			arr[i].checkOut(bor,date);
		}
	}
}
