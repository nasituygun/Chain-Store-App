// NASIT UYGUN 240201012 
import java.io.IOException;

public class ChainStoreApp {

	public static void main(String[] args) throws IOException {
		AnnualSale annualSale=new TheChainStoreInitialize().initialize();
		StoreQuery storeQuery=new StoreQuery(annualSale);
		storeQuery.printMostProfitableItem();
		System.out.println("************************************************************************");
		storeQuery.printMostProfitableCategory();
		System.out.println("************************************************************************");
		storeQuery.printLeastProfitableItem();
		System.out.println("************************************************************************");
		storeQuery.printLeastProfitableCategory();
		System.out.println("************************************************************************");
		storeQuery.printMostProfitableItemSingleSale();
		System.out.println("************************************************************************");
		storeQuery.printBestSellingItem();
		System.out.println("************************************************************************");
		storeQuery.printMostProfitableStoreEachMounth();
		}
	
		
		}

	
