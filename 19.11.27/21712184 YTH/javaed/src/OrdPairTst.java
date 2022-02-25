
class OrdPair<K,V>{
	private K key;
	private V value;
	
	public OrdPair(K key, V value){
		this.key=key;
		this.value=value;
	}
	
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}



public class OrdPairTst {
	public static void main(String[] args) {
		OrdPair<String,Integer> p1 = new OrdPair<String,Integer>("mykey",12345678);
		OrdPair<String,String> p2 = new OrdPair<String,String>("java","a programing language");
		
		System.out.println(p1.getKey() + " " + p1.getValue());
		System.out.println(p2.getKey() + " " + p2.getValue());

	}
}
