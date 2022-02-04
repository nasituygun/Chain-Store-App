import java.io.IOException;

public class TheChainStoreInitialize {
	private Item[] item;
	private Transaction[][] store1,store2,store3,store4;
	private ItemTransaction[] annualSale; 
	
	public TheChainStoreInitialize() throws IOException {
		
		item=FileIO.readItem();
		store1=FileIO.readTransaction("HW1_Transactions_Store1.csv");
		store2=FileIO.readTransaction("HW1_Transactions_Store2.csv");
		store3=FileIO.readTransaction("HW1_Transactions_Store3.csv");
		store4=FileIO.readTransaction("HW1_Transactions_Store4.csv");
		annualSale=new ItemTransaction[32];
		
	}
	
	public AnnualSale initialize() {
		for (int i=0; i<32; i++) {
			annualSale[i]=(new ItemTransaction(item[i]));
			for (int j=0; j<12; j++) {
				annualSale[i].addTransaction(store1[i][j], 0, j);
				annualSale[i].addTransaction(store2[i][j], 1, j);
				annualSale[i].addTransaction(store3[i][j], 2, j);
				annualSale[i].addTransaction(store4[i][j], 3, j);
			}		
			
		}
		return new AnnualSale(annualSale);
		
		
	}
		
		
		
		
		

			
			
			
			
			
		}
	


