
import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeMenu {

    private ArrayList<String> menuItems;
    private ArrayList<Double> menuPrices;
    private ArrayList<String> order;

    public CoffeeMenu() {
        menuItems = new ArrayList<>();
        menuPrices = new ArrayList<>();
        order = new ArrayList<>();

        menuItems.add("Espresso"); menuPrices.add(5.00);
        menuItems.add("Cappuccino"); menuPrices.add(6.50);
        menuItems.add("Latte"); menuPrices.add(6.00);
        menuItems.add("Mocha"); menuPrices.add(7.00);
        menuItems.add("Black Coffee"); menuPrices.add(4.00);
        menuItems.add("Iced Coffee"); menuPrices.add(5.50);
    }

    public void displayMenu() {
        System.out.println("===== Coffee Menu =====");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) + " - $" + menuPrices.get(i));
        }
        System.out.println("========================");
    }

    public void addToOrder(String item) {
        for (int i = 0; i < menuItems.size(); i++) {
            if (menuItems.get(i).equalsIgnoreCase(item)) {
                order.add(menuItems.get(i));
                System.out.println(menuItems.get(i) + " added to your order.");
                return;
            }
        }
        System.out.println("Sorry, " + item + " is not on the menu.");
    }

    public double calculateTotal() {
        double total = 0;
        for (String item : order) {
            int index = menuItems.indexOf(item);
            total += menuPrices.get(index);
        }
        return total;
    }

    public void displayOrder() {
        if (order.isEmpty()) {
            System.out.println("Your order is empty.");
        } else {
            System.out.println("Your Order:");
            for (String item : order) {
                int index = menuItems.indexOf(item);
                System.out.println("- " + item + " : $" + menuPrices.get(index));
            }
            System.out.println("Total: $" + calculateTotal());
        }
    }

    public static void main(String[] args) {
        CoffeeMenu coffeeMenu = new CoffeeMenu();
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("Welcome to the Coffee Shop!");

        while (true) {
            coffeeMenu.displayMenu();
            System.out.println("Enter an item to add to your order (or type 'done' to finish):");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("done")) {
                break;
            }
            coffeeMenu.addToOrder(userInput);
        }

        coffeeMenu.displayOrder();
        System.out.println("Thank you for visiting!");

        scanner.close(); 
    }
}
