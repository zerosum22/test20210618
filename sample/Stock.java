package sample;

/** 在庫クラス */
public class Stock {
	/** 倉庫番号 */
	private int storeNo;
	/** 在庫数量 */
	private int quantity;
	
	/** コンストラクタ */
	public Stock(int storeNo, int quantity) {
		super();
		this.storeNo = storeNo;
		this.quantity = quantity;
	}
	/** 倉庫番号をgetする */
	public int getStoreNo() {
		return storeNo;
	}

	public void setStoreNo(int storeNo) {
		this.storeNo = storeNo;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
