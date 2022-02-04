import java.io.IOException;

public class StoreQuery {
	private AnnualSale annualSale;
	
	public StoreQuery(AnnualSale annualSale) throws IOException{
		this.annualSale=annualSale;
		
		
}

	public void printMostProfitableItem() {
		ItemTransaction maxItem = null;
		double maxProfit=0;
		for (ItemTransaction e: annualSale.getArray()) {
			
			if (e.netProfitByItem()>maxProfit) {
				
				maxProfit=e.netProfitByItem();
				maxItem=e;
			}
			
		}
		System.out.println("the most profitable item is "+maxItem.getItem().getName()+" Total profit="+maxItem.netProfitByItem());
			}
	
	public void printMostProfitableCategory() {
		double beverage=0,food=0,snack=0,home=0,personal=0;
		for (int i=0; i<annualSale.getArray().length; i++) {
			if (annualSale.getArray()[i].getItem().getCategory().toLowerCase().equals("beverage")) {
				beverage+=annualSale.getArray()[i].netProfitByItem();}
			else if(annualSale.getArray()[i].getItem().getCategory().toLowerCase().equals("snack")) {
				snack+=annualSale.getArray()[i].netProfitByItem();}
			else if (annualSale.getArray()[i].getItem().getCategory().toLowerCase().equals("food")) {
				food+=annualSale.getArray()[i].netProfitByItem();}
			else if (annualSale.getArray()[i].getItem().getCategory().toLowerCase().equals("home")) {
				home+=annualSale.getArray()[i].netProfitByItem();}
			else {
				personal+=annualSale.getArray()[i].netProfitByItem();}	
			}
			
			if (beverage>food && beverage>snack && beverage>home && beverage>personal ) {
				System.out.println("the most profitable category is beverage Total profit="+beverage);
				}
			else if (food>beverage && food>snack && food>home && food>personal ) {
				System.out.println("the most profitable category is food Total profit="+food);
				}
			else if (snack>beverage && snack>food && snack>home && snack>personal ) {
				System.out.println("the most profitable category is snack Total profit="+snack);
				}
			else if(home>beverage && home>food && home>snack && home>personal ){
				System.out.println("the most profitable category is home Total profit="+home);
				}
			else {
				System.out.println("the most profitable category is personal Total profit="+personal);
				
			}}
	
	public void printMostProfitableItemSingleSale() {
		Item item=null;
		double maxProfit=0;
		for(int i=0; i<annualSale.getArray().length; i++) {
			for (int j=0; j<annualSale.getArray()[i].getArray().length; j++) {
				for (int k=0; k<annualSale.getArray()[i].getArray()[j].length; k++) {
					if(annualSale.getArray()[i].getArray()[j][k].getProfit()>maxProfit) {
						item=annualSale.getArray()[i].getItem();
						maxProfit=annualSale.getArray()[i].getArray()[j][k].getProfit();
						}	
					}
				}
			}
		System.out.println("the most profitable item for a single sale is "+ item.getName()+ " profit="+maxProfit);
		
		
		
	}

	public void printBestSellingItem() {
		Item item=null;
		int bestSell=0;
		for (ItemTransaction e: annualSale.getArray()) {
			if (e.getAnnualSale()>bestSell) {
				bestSell=e.getAnnualSale();
				item=e.getItem();}
			
			
		}
		System.out.println("the best selling item is "+item.getName()+" number Of Annual Sales are "+ bestSell);
	}
	

	public String getMostProfitableStore(int mounth) {
		double store1=0;
		double store2=0;
		double store3=0;
		double store4=0;
		
		for (ItemTransaction e: annualSale.getArray()) {
			for (int i=0; i<e.getArray().length; i++) {
				if (i==0) {
					store1+=e.getArray()[i][mounth].getNetProfit();
				}
				else if (i==1) {
					store2+=e.getArray()[i][mounth].getNetProfit();
				
				}
				else if (i==2) {
					store3+=e.getArray()[i][mounth].getNetProfit();
				
				}
				else  {
					store4+=e.getArray()[i][mounth].getNetProfit();
				
				}
				
			}
		}
		if (store1>=store2 && store1>=store3 && store1>=store4) {
			return "Store 1";
		}
		else if (store2>=store1 && store2>=store3 && store2>=store4) {
			return "Store 2";
		}
		else if (store3>=store1 && store3>=store2 && store3>=store4) {
			return "Store 3";
		}
		else {
			return "store 4";
		}
		}

	public void printMostProfitableStoreEachMounth() {
		for (int i=0; i<12; i++) {
			System.out.println("the most profitable store in mounth "+(i+1)+" is "+ getMostProfitableStore(i));
			System.out.println("************************************************************************");
			 
		}
		
	}
	
	public void printLeastProfitableItem() {
		
		ItemTransaction minItem = null;
		double minProfit=999999999;
		for (ItemTransaction e: annualSale.getArray()) {
			if (e.netProfitByItem()<minProfit) {
				minProfit=e.netProfitByItem();
				minItem=e;
			}
			
		}
		System.out.println("the least profitable item is "+minItem.getItem().getName()+" Total profit ="+minItem.netProfitByItem());
			}
		
	public void printLeastProfitableCategory() {
		double beverage=0,food=0,snack=0,home=0,personal=0;
		for (int i=0; i<annualSale.getArray().length; i++) {
			if (annualSale.getArray()[i].getItem().getCategory().toLowerCase().equals("beverage")) {
				beverage+=annualSale.getArray()[i].netProfitByItem();}
			else if(annualSale.getArray()[i].getItem().getCategory().toLowerCase().equals("snack")) {
				snack+=annualSale.getArray()[i].netProfitByItem();}
			else if (annualSale.getArray()[i].getItem().getCategory().toLowerCase().equals("food")) {
				food+=annualSale.getArray()[i].netProfitByItem();}
			else if (annualSale.getArray()[i].getItem().getCategory().toLowerCase().equals("home")) {
				home+=annualSale.getArray()[i].netProfitByItem();}
			else {
				personal+=annualSale.getArray()[i].netProfitByItem();}	
			}
			
			if (beverage<food && beverage<snack && beverage<home && beverage<personal ) {
				System.out.println("least profit category is beverage Total profit="+beverage);
				}
			else if (food<beverage && food<snack && food<home && food<personal ) {
				System.out.println("least profit category is food Total profit="+food);
				}
			else if (snack<beverage && snack<food && snack<home && snack<personal ) {
				System.out.println("least profit category is snack Total profit="+snack);
				}
			else if(home<beverage && home<food && home<snack && home<personal ){
				System.out.println("least profit category is home Total profit="+home);
				}
			else {
				System.out.println("least profit category is personal Total profit="+personal);
				
			}
	}
	}

	
		
		

			
		
		
			

				
			
				
			
	
		
		
	

