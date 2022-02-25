class GoodsStock {
	private String GoodsCode;
	private static int stockNum;

	public GoodsStock(String GoodsCode, int stockNum) {
		this.GoodsCode = GoodsCode;
		this.stockNum = stockNum;
	}

	public void addStock(int amnt) {
		stockNum += amnt;
	}

	public String getGoodsCode() {
		return GoodsCode;
	}

	public void setGoodsCode(String goodsCode) {
		GoodsCode = goodsCode;
	}

	public static int getStockNum() {
		return stockNum;
	}

	public static void setStockNum(int stockNum) {
		GoodsStock.stockNum = stockNum;
	}

	public int subtractStock(int amnt) {
		if (stockNum < amnt) // 뺄때는 조심
			return 0;

		stockNum -= amnt;
		return stockNum;
	}
}

public class GoodsEx {
	public static void main(String[] args) {
		GoodsStock obj = new GoodsStock("52135", 200);

		System.out.println("code = " + obj.getGoodsCode());
		System.out.println("수량 = " + obj.getStockNum());

		obj.addStock(1000);

		System.out.println("code = " + obj.getGoodsCode());
		System.out.println("수량 = " + obj.getStockNum());
	}
}
