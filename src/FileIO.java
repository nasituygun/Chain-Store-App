import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class FileIO {
	private static Item[] item;
	
	private static Transaction[][] transaction;
	
	@SuppressWarnings("resource")
	public static Item[] readItem() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("HW1_Items.csv"));
		int lines = 0;
		String line;
		
		while (reader.readLine() != null) lines++;
		reader.close();
		
		item=new Item[lines];
		
		 BufferedReader secondReader = new BufferedReader(new FileReader("HW1_Items.csv"));
			while ((line=secondReader.readLine()) != null) {
				String[] data=line.toString().split(",");
				String name=data[0];
				int id=Integer.parseInt(data[1]);
				String category=data[2];
				item[id-1]=new Item(name,id,category);}
		
		return item;
		}
	public static Transaction[][] readTransaction(String fileName) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		int lines = 0;
		String line;
		while (reader.readLine() != null) lines++;
		reader.close();
		
		transaction=new Transaction[lines][12];
		
		@SuppressWarnings("resource")
		BufferedReader secondReader = new BufferedReader(new FileReader(fileName));
		int id=1;
		while ((line=secondReader.readLine()) != null) {
			int mounth=0;
			String[] data=line.toString().split(",");
			for (int i=1; i<data.length; i=i+3) {
				transaction[id-1][mounth]=new Transaction(data[i],data[i+1],data[i+2],id);	
				mounth++;
			}
			id++;
			
			
			}
		
		

		
	
		
		return transaction;
		
		
	}}


	