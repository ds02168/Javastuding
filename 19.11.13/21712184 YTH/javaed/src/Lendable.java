
public interface Lendable {
	abstract void checkOut(String bor, String date) throws Exception;
	abstract void checkIn();
}
