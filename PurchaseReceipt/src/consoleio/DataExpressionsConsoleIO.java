package consoleio;
import java.util.Scanner;
public class DataExpressionsConsoleIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("CUSTOMER FULL NAME");
		String customerFullName = input.nextLine();
		input.nextLine();
		
		System.out.println("PRODUCT NAME");
		String productName = input.nextLine();
		input.nextLine();
		
		System.out.println("QUANTITY PURCHASED");
		int quantityPurchased = input.nextInt();
		input.nextInt();
		
		System.out.println("UNIT PRICE OF THE PRODUCT");
		double unitPriceOfTheProduct = input.nextDouble();
		input.nextDouble();
		
		System.out.println("TOTAL COST");
		double totalCost = quantityPurchased *unitPriceOfTheProduct;
		

		System.out.println();
		System.out.println("CUSTOMER PURCHASE RECEIP");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("CUSTOMER FULL NAME: UGX "+customerFullName);
		System.out.println("PRODUCT NAME: "+ productName);
		System.out.println("QUANTITY PURCHASED: "+ quantityPurchased);
		System.out.println("UNITY PRICE OF THE PRODUCT: UGX "+ unitPriceOfTheProduct);
		System.out.println("TOTAL COST: UGX "+ totalCost);
		
		
		input.close();
	}

}
