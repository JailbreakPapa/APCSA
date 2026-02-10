import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart(5);
        String keepShopping = "y";
        
        System.out.println("Welcome to the Shopping Program!");
        System.out.println();
        
        while (keepShopping.equalsIgnoreCase("y")) {
            System.out.print("Enter the name of the item: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter the price of the item: ");
            double price = scanner.nextDouble();
            
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            
            Item item = new Item(name, price, quantity);
            cart.addToCart(item);
            
            System.out.println("\nCart contents:");
            System.out.println(cart.toString());
            
            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scanner.nextLine();
            System.out.println();
        }
        
        System.out.printf("Please pay $%.2f%n", cart.getTotalPrice());
        scanner.close();
    }
}

























































