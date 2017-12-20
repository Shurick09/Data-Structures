
public class StringLLApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringLL shoppingList = new StringLL();
		shoppingList.addToFront("Milk");
		shoppingList.addToFront("Cereal");
		shoppingList.addToFront("Bananas");
		shoppingList.addToFront("Apple");
		shoppingList.traverse();
		StringNode target = shoppingList.search("Cereal");
		if (target != null) {
			System.out.printf("Found target %s\n", target.data);
		}
		
		StringLL iceCream = new StringLL();
		iceCream.addToFront("Chocolate");
		iceCream.addToFront("Rum Raisin");
		iceCream.addToFront("Mint Chocolate Chip");
		iceCream.traverse();
		
	}

}
