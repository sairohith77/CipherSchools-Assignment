import java.util.*;
class GroceryList{
	static int budget,price,quantity;
	static String itemname;
	public static void main(String...args){
		GroceryList gr = new GroceryList();
		ArrayList<String> List1 = new ArrayList<String>();
		System.out.println("Please enter your budget: ");
		Scanner scan = new Scanner(System.in);
		budget = scan.nextInt();
		for(;true;){
			int count = 0;
			System.out.println("1. Add an item\n2. Exit");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			if(choice==1){
				System.out.println("Enter product's name: ");
				Scanner scan1 = new Scanner(System.in);
				itemname = scan1.nextLine();
				System.out.println("Enter quantity: ");
				int quantity = scan1.nextInt();
				System.out.println("Enter price: ");
				int price = scan1.nextInt();
				if(budget>=price){
					System.out.println("Item added succesfully!");
					count++;
					budget-=price;
					System.out.println("Amount left: "+ budget);
		            List1.add(itemname);
		            String quantity1 = String.valueOf(quantity);
		            List1.add(quantity1);
		            String price1 = String.valueOf(price);
		            List1.add(price1);
				}
				else{
					System.out.println("Sorry, You've insufficient balance.");
				}
			}
			else{
				System.out.println("Item name: " + List1.get(0));
		        System.out.println("Quantity: " + List1.get(1));
		        System.out.println("Price: " + List1.get(2));
				System.exit(-1);
			}
		}

	}
}