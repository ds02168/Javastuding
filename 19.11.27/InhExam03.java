
public class InhExam03 {
	public static void main(String[] args) {
		BonusPointAccount obj = new BonusPointAccount("333-333", "��̿�", 0, 0);
		
		obj.deposit(1000000);
		
		System.out.println("�ܾ� : " + obj.bal);
		System.out.println("��������Ʈ : " + obj.bonusPnt);
	}
}
