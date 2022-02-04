public class AnnualSale {
	
	private ItemTransaction[] itemTransaction;
	public AnnualSale(ItemTransaction[] itemTransaction) {
		this.itemTransaction=itemTransaction; 
	}
	
	
	public ItemTransaction getItemTransaction(int id) {
		return itemTransaction[id];
	}
	
	public int getLength() {
		return itemTransaction.length;
	}
	
	public ItemTransaction[] getArray() {
		return itemTransaction;}

}
