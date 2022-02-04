public class Transaction {
	private int id;
	private double purchasePrice;
	private double salePrice;
	private int numberOfSales;
	
	public Transaction(String purchasePrice, String salePrice, String numberOfSales, int id) {
		this.id=(id);
		this.purchasePrice = Double.parseDouble(purchasePrice);
		this.salePrice = Double.parseDouble(salePrice);
		this.numberOfSales = Integer.parseInt(numberOfSales);
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}
	public double getSalePrice() {
		return salePrice;
	}
	
	public int getNumberOfSales() {
		return numberOfSales;}
		
	public double getNetProfit() {
		return ((salePrice-purchasePrice)*(numberOfSales));
		
	
		
	
		
	
	}
	
	public double getProfit() {
		return ((salePrice-purchasePrice));
	}
	@Override
	public String toString() {
		return " id="+ id + " purchasePrice=" + purchasePrice + ", salePrice=" + salePrice + ", numberOfSales="
				+ numberOfSales + " mounth]";
	}
	public int getId() {
		return id;
	}
	

	
	

}
