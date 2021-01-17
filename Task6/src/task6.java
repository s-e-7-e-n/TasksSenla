import java.util.ArrayList;

public class task6 {
	
	static class Backpack{
		//Table with max value of items for weight
		private static int[][] Table;

		private static void setTable(Item[] itemList, int maxWeight) {
			int maxItems = itemList.length;
			Table = new int[maxItems+1][maxWeight+1];
			
			for (int w = 0; w <= maxWeight; w++) {
				Table[0][w] = 0;
			}
			
			for (int i = 1; i <= maxItems; i++) {
				for (int w = 0; w <= maxWeight; w++) {
					int weight = itemList[i-1].getWeight();
					int value = itemList[i-1].getValue();
					
					Table[i][w] = Table[i-1][w];
					if (w >= weight && (Table[i-1][w-weight] + value) > Table[i][w]) {
						Table[i][w] = Table[i-1][w-weight] + value;
					}
				}
			}
		}
		
		static ArrayList<Integer> getItemList(Item[] itemList, int maxWeight) {
			ArrayList<Integer> items = new ArrayList<Integer>();
			int maxItems = itemList.length;
			
			setTable(itemList, maxWeight);
			
			while (maxItems > 0) {
				if (Table[maxItems][maxWeight] != Table[maxItems-1][maxWeight]) {
					items.add(itemList[maxItems-1].getNumber());
					maxWeight -= itemList[maxItems-1].getWeight();
					maxItems--;
				}
				else {
					maxItems--;
				}
			}
			return items;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxWeight = 15;
		Item one = new Item(6, 5);
		Item two = new Item(4, 3);
		Item three = new Item(3, 1);
		Item four = new Item(2, 3);
		Item five = new Item(5, 6);
		Item[] itemList = {one, two, three, four, five};
		ArrayList<Integer> items = Backpack.getItemList(itemList, maxWeight);
		System.out.print(items);
	}
}

class Item{
	private static int length = 0;
	private int weight, value, number;
	
	Item(int weight, int value) {
		this.weight = weight;
		this.value = value;
		this.number = ++length;
	}
	
	public int getNumber() {
		return number;
	}

	public int getWeight() {
		return weight;
	}

	public int getValue() {
		return value;
	}
}