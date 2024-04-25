package hust.soict.cybersec.aims.Aims;


import hust.soict.cybersec.aims.store.Store;
import hust.soict.cybersec.aims.cart.Cart.*;
import java.util.Scanner;

public class Aims {
    private static Store store = new Store();
    private static Cart cart = new Cart();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    viewStore();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    seeCurrentCart();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number: 0-1-2-3");
                    break;
            }
        } while (choice != 0);
    }

    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void viewStore() {
        
    }

    public static void updateStore() {
        
    }

    public static void seeCurrentCart() {
        
    }

    
}