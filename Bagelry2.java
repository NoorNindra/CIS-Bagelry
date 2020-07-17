import java.util.Scanner; 
import java.util.Arrays;

class Bagelry1
{
	double chocBagel;
	double plainBagel;
	double everyBagel;
	double cerealBagel;
	double nutBagel;
	double cinnBagel;
	double jalapBagel;
	double cheeseBagel;
	
	
	double strawberrycc;
	double fruitcc;
	double spicycc;
	double regularcc;
	Bagelry1(){
		strawberrycc = 4.00;
		fruitcc = 6.00;
		spicycc= 5.00;
		regularcc = 4.00;
	}
	
}

interface amount
{
	// Display the question of quantity
	default void display() 
    { 
		System.out.println("\nGreat! How many would you like?\n");
    } 
}


class Bagelry2 implements amount
{
	public static void main(String args[]) {
		Bagelry1 eat = new Bagelry1();
		Bagelry2 ask = new Bagelry2();
		// DecimalFormat df = new DecimalFormat("#.##");

	    // Initialize bagel prices
	    eat.chocBagel=7.00;
	    eat.plainBagel = 5.00;
	    eat.everyBagel = 7.00;
	    eat.cerealBagel = 8.00;
	    eat.nutBagel = 6.00;
	    eat.cinnBagel= 6.00;
	    eat.jalapBagel= 7.00;
	    eat.cheeseBagel= 8.00;
	    
	    String bagel;
	    int quantitybagel;
		String cc;
		int quantitycc;
	    String customer;
		double tip;
		double total = 0.00;
	    
	    
	    // Greet customer 
	    System.out.println("Welcome to Brilliant Bagerly!");
		
		// Intialize user input
	    Scanner in = new Scanner(System.in);	    
		
		// Give menu for bagels
	    System.out.println("Bagel Menu:\nChocolate    $7\nPlain        $5\nEverything   $7\nCereal       $8\nNut          $6\nCinnamon     $6");
		System.out.println("Jalapeno     $7\nCheese       $8\n\nPlease choose the bagel of your choice:");
	    // Array with bagels to verify a valid entry
		String bagelMenu[] = {"Chocolate", "Plain", "Everything", 
		"Cereal", "Nut", "Cinnamon", "Jalapeno", "Cheese"};

		bagel = in.nextLine();
		// While loop for valid bagel
		while (!Arrays.asList(bagelMenu).contains(bagel)) {
			System.out.println("\nPlease choose a valid bagel from the menu.\n");
			bagel = in.nextLine();
		}
		// Ask for quantity
		ask.display();
		quantitybagel = Integer.parseInt(in.nextLine());

		// Switch statement to acquire correct bagel and add to total
		switch(bagel) {
			case "Chocolate":
				total += eat.chocBagel * quantitybagel;
				break;
			case "Plain":
				total += eat.plainBagel * quantitybagel;
				break;
			case "Everything":
				total += eat.everyBagel * quantitybagel;
				break;
			case "Cereal":
				total += eat.cerealBagel * quantitybagel;
				break;
			case "Nut":
				total += eat.nutBagel * quantitybagel;
				break;
			case "Cinnamon":
				total += eat.cinnBagel * quantitybagel;
				break;
			case "Jalapeno":
				total += eat.jalapBagel * quantitybagel;
				break;
			case "Cheese":
				total += eat.cheeseBagel * quantitybagel;
				break;
		}
		
	                
	    
	    // Give menu for cc
		System.out.println("\nCream Cheese Menu:\nStrawberry   $4\nFruit        $6\nSpicy        $5\nRegular      $4\n");
		System.out.println("Please select the cream cheese of your choice:\n");
		// Array with cc to verify a valid entry
		String ccMenu[] = {"Strawberry", "Fruit", "Spicy", "Regular"};
		
		cc = in.nextLine();
		// While loop for valid cc
		while (!Arrays.asList(ccMenu).contains(cc)) {
			System.out.println("\nPlease choose a valid cream cheese from the menu.\n");
			cc = in.nextLine();
		}
		// Ask for quantity
		ask.display();
		quantitycc= Integer.parseInt(in.nextLine());

		// If statements to acquire correct cc and add to total
		if (cc.equals(ccMenu[0])) {
			total += eat.strawberrycc * quantitycc;
		}
		else if (cc.equals(ccMenu[1])) {
			total += eat.fruitcc * quantitycc;
		}
		else if (cc.equals(ccMenu[2])) {
			total += eat.spicycc * quantitycc;
		}
		else if (cc.equals(ccMenu[3])) {
			total += eat.regularcc * quantitycc;
		}
		
		
		// Request for tip
	    System.out.println("\nWould you like to leave a tip? Please type yes or no.\n");
		customer = in.nextLine();
		// Check for a yes or no
		String ans[] = {"yes", "no"};
		while (!Arrays.asList(ans).contains(customer)) {
			System.out.println("\nPlease answer with 'yes' or 'no'.\n");
			customer = in.nextLine();
		}
		// Add on tip to total if customer answers yes
		if (customer.equals("yes")) {
			System.out.println("\nHow much would you like to give?\n");
			tip=in.nextFloat();
			total += tip;
			System.out.println("\nThank you!");
		}
	    // Print receipt and thank you message
		System.out.println("\n\nBagel: " + quantitybagel + " " + bagel + " bagel(s)");
		System.out.println("Cream Cheese: " + quantitycc + " " + cc + " cream cheese(s)");
		System.out.println("Your total is: $" + String.format("%.2f", total));
		System.out.println("Thank you for shopping with us! Have a good day!\n");
	}
}

