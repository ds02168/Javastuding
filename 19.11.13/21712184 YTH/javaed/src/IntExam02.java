
public class IntExam02 {

	public static void main(String[] args) {
		
		Lendable[] arr = new Lendable[3];
		arr[0] = new sepvol("883��", "Ǫ��������", "����");
		arr[1] = new sepvol("609.2", "����̼���", "���긮ġ");
		arr[2] = new AppCDinfo("02-17", "XML�� ���� �ڹ�");
		
		checkOutAll(arr, "������","20060315");
		
	}
	
	static void checkOutAll(Lendable[] arr, String bor, String date) {
		for(int i=0;i<arr.length;i++) {
			arr[i].checkOut(bor,date);
		}
	}
}
