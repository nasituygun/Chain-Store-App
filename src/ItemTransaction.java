public class ItemTransaction {
	private Item item;
	private Transaction[][] transaction;
	private double netProfitByItem;
	private int annualSale;
	
	public ItemTransaction(Item item) {
		this.item = item;
		transaction=new Transaction[4][12];
		netProfitByItem=0;
	}
	public ItemTransaction() {
		transaction=new Transaction[4][12];
	}
	public Item getItem() {
		return item;
		
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Transaction getTransaction(int store, int mounth) {
		return transaction[store][mounth];
	}
	public void addTransaction(Transaction transaction,int store,int mounth) {
		this.transaction[store][mounth]=transaction;
		addProfitToItem(transaction);
		addSalestoItem(transaction);
		
	}
	public Transaction[][] getArray(){
		return transaction;
	}
	
	private void addProfitToItem(Transaction transaction) {
		netProfitByItem+=transaction.getNetProfit();
		
	}
	
	private void addSalestoItem(Transaction transaction) {
		annualSale+=transaction.getNumberOfSales();
	}
	public double netProfitByItem() {
		return netProfitByItem;
	}
	public int getAnnualSale() {
		return annualSale;
	}
		
		
	}
	

