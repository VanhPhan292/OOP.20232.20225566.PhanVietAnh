package hust.soict.cybersec.aims.Aims;


import hust.soict.cybersec.aims.store.Store;
import hust.soict.cybersec.aims.cart.Cart.*;
import hust.soict.cybersec.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.cybersec.aims.media.Book;
import hust.soict.cybersec.aims.media.CompactDisc;
import hust.soict.cybersec.aims.media.Media;
import java.util.Scanner;

public class Aims{
	public static void showMenu() {
		System.out .println("\nAIMS main menu: ");
		System.out .println("--------------------------------");
		System.out .println("1. View store");
		System.out .println("2. Update store");
		System.out .println("3. See current cart");
		System.out .println("0. Exit");
		System.out .println("--------------------------------");
		System.out .println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {
		System.out .println("\nStore Options: ");
		System.out .println("--------------------------------");
		System.out .println("1. See a media’s details");
		System.out .println("2. Add a media to cart");
		System.out .println("3. Play a media");
		System.out .println("4. See current cart");
		System.out .println("0. Back");
		System.out .println("--------------------------------");
		System.out .println("Please choose a number: 0-1-2-3-4");
	}
	
	public static void mediaDetailsMenu() {
		System.out.println("\nMedia Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}
	
	public static void cartMenu() {
		System.out .println("Options: ");
		System.out .println("--------------------------------");
		System.out .println("1. Filter media in cart");
		System.out .println("2. Sort media in cart");
		System.out .println("3. Remove media from cart");
		System.out .println("4. Play a media");
		System.out .println("5. Place order");
		System.out .println("0. Back");
		System.out .println("--------------------------------");
		System.out .println("Please choose a number: 0-1-2-3-4-5");
		}
	
	public static void chooseFilterOptions() {
		System.out.println("Filter options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter by ID");
		System.out.println("2. Filter by title");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number 1-2");
	}
	
	public static void chooseSortOptions() {
		System.out.println("Sort options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Sort by title");
		System.out.println("2. Sort by cost");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number 1-2");
	}
	
	public static void main(String[] args) {
		Store store = new Store();
		Cart cart = new Cart();
		Scanner keyboard = new Scanner(System.in);
		String page = "menu";
		int userChoice = 0;
		Media searchedItem = null;
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(
				1,
				"The Lion King",
				"Animation",
				"Roger Allers",
				87,
				19.95f
		);
		store.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc(
				2,
				"Star Wars",
				"Science Fiction",
				"George Lucas",
				50,
				24.95f
		);
		store.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc(
				3,
				"Aladin",
				"Animation",
				"Guy Ritchie",
				20,
				18.99f
		);
		store.addMedia(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc(
				4,
				"Alibaba",
				"Animation",
				"Somebody",
				34,
				50.0f
		);
		store.addMedia(dvd4);
		
		Book book1 = new Book(
				5,
				"Treasure Islands",
				"Adventure",
				99.9f
		);
		
		book1.addAuthor("Robert");
		book1.addAuthor("Louis");
		book1.addAuthor("Stevenson");
		
		store.addMedia(book1);
		
		do{
			if(page.equals("menu")) {
				showMenu();
				userChoice = keyboard.nextInt();
				
				switch(userChoice) {
					case 0: 
						page = "start";
						
						break;
					case 1: 
						store.displayStore();
						page = "storeMenu";
						
						break;
					case 2: 
						
						break;
					case 3: 
						cart.printCart();
						page = "cartMenu";
						
						break;
					default:
						System.out.println("Invalid userChoice, please choose again");
						
						break;
				}
			}
			else if(page.equals("storeMenu")) {
				storeMenu();
				userChoice = keyboard.nextInt();
				
				switch(userChoice) {
					case 0: 
						page = "menu";
						break;
					case 1: 
						System.out.println("Please enter the title you want to search: ");
						String ChosenTitle1 = keyboard.nextLine();
						ChosenTitle1 = keyboard.nextLine();
						searchedItem = store.search(ChosenTitle1);
						
						if(searchedItem == null) {
							System.out.println("No match found for '" + ChosenTitle1 + "'!");
						}
						else {
							System.out.println("\n***********************Store**********************");
							System.out.println("Searched results for Title: " + ChosenTitle1);
							System.out.println(searchedItem.toString());
							System.out.println("***************************************************");
							page = "mediaMenu";
						}
						
						break;
					case 2: 
						System.out.println("Please enter the title of the Media to add to Cart");
						keyboard.nextLine();
						String ChosenTitle2 = keyboard.nextLine();
						searchedItem = store.search(ChosenTitle2);
						
						
						if(searchedItem != null) {
							
							if(cart.addMedia(searchedItem)) {
								System.out.println("Item successfully added to Cart");
								System.out.println("Cart now contains " + cart.numberOfItems() + " item(s)");
								page = "storeMenu";
							}
							
							else {
								System.out.println("Cannot order this Item");
								page = "storeMenu";
							}
							
						}
						
						else {
							System.out.println("Cannot find any items with the title '" + ChosenTitle2 + "'!");
							page = "storeMenu";
						}
						
						break;
					case 3: 
						System.out.println("Please enter the title of the Media to play: ");
						keyboard.nextLine();
						String ChosenTitle3 = keyboard.nextLine();
						searchedItem = store.search(ChosenTitle3);
						
						if(searchedItem instanceof DigitalVideoDisc) {
							DigitalVideoDisc playableSearchedItem = (DigitalVideoDisc) searchedItem;
							playableSearchedItem.play();
						}
						else if(searchedItem instanceof CompactDisc) {
							CompactDisc playableSearchedItem = (CompactDisc) searchedItem;
							playableSearchedItem.play();

						}
						else if(searchedItem != null){
							System.out.println("\n" + searchedItem.getTitle() + " is neither DVD nor CD, cannot play!");
						}
						else {
							System.out.println("\nCannot find any item with title '" + ChosenTitle3 + "'!");
						}
						
						break;
					case 4: 
						cart.printCart();
						page = "cartMenu";
						
						break;
					default:
						System.out.println("Invalid userChoice, please choose again");
						
						break;
				}
			}
			else if(page.equals("mediaMenu")) {
				mediaDetailsMenu();
				userChoice = keyboard.nextInt();
				
				switch(userChoice) {
					case 0: 
						page = "storeMenu";
						
						break;
					case 1: 
						if(cart.addMedia(searchedItem)) {
							System.out.println("Item successfully added to Cart!");
							System.out.println("Cart now contains " + cart.numberOfItems() + " item(s)");
							page = "storeMenu";
						}
				
						else {
							System.out.println("Cannot order this Item");
							page = "storeMenu";
						}
						
						break;
					case 2: 
						if(searchedItem instanceof DigitalVideoDisc) {
							DigitalVideoDisc playableItem = (DigitalVideoDisc) searchedItem;
							playableItem.play();
						}
						else if(searchedItem instanceof CompactDisc) {
							CompactDisc playableItem = (CompactDisc) searchedItem;
							playableItem.play();
						}
						else {
							System.out.println("\n" + searchedItem.getTitle() + " is not a DVD or a CD, cannot play!");
						}
						
						break;
					default:
						System.out.println("Invalid userChoice, please choose again");
						break;
				}
			}
			else if(page.equals("cartMenu")) {
				cartMenu();
				userChoice = keyboard.nextInt();
				
				switch(userChoice) {
					case 0:
						page = "menu";
						
						break;
					case 1: 
						chooseFilterOptions();
						userChoice = keyboard.nextInt();
						
						
						if(userChoice == 1) {
							System.out.println("Enter the ID you want to filter: ");
							int ChosenID = keyboard.nextInt();
							
							Media resultItem = cart.searchByID(ChosenID);
							if(resultItem != null) {
								System.out.println("\n***********************CART***********************");
								System.out.print("Searched results for id: " + ChosenID);
								StringBuilder str = new StringBuilder();
								str.append("\n");
								str.append(resultItem.toString());
								System.out.println(str.toString());
								System.out.println("***************************************************");
							}
							else {
								System.out.println("\nNo match found for id '" + ChosenID + "'!");
							}
						}
						
						else if(userChoice == 2) {
							System.out.println("Enter the title you want to filter: ");
							keyboard.nextLine();
							String ChosenTitle = keyboard.nextLine();
							
							Media resultItem = cart.searchByTitle(ChosenTitle);
							
						
							if(resultItem != null) {
								StringBuilder str = new StringBuilder();
								str.append("\n");
								str.append(resultItem.toString());
								System.out.println("\n***********************CART***********************");
								System.out.print("Searched results for Title: " + ChosenTitle);
								System.out.println(str.toString());
								System.out.println("***************************************************");
							}
						
							else {
								System.out.println("\nNo match found for title '" + ChosenTitle + "'!");
							}
						}
						else {
							System.out.println("\nInvalid userChoice");
						}
						
						break;
					case 2: 
						chooseSortOptions();
						userChoice = keyboard.nextInt();
						
						if(userChoice == 1) {
							cart.sortByTitle();
						}
						else if(userChoice == 2) {
							cart.sortByCost();
						}
						else {
							System.out.println("\nInvalid userChoice");
						}
						
						break;
					case 3: 
						
						System.out.println("Enter the title of the Media to remove: ");
						keyboard.nextLine();
						String ChosenTitle1 = keyboard.nextLine();
						Media removeItem = cart.searchByTitle(ChosenTitle1);
						
						
						if(removeItem != null) {
							cart.removeMedia(removeItem);
							
						}
						
						else {
							System.out.println("\nCannot find Media with title '" + ChosenTitle1 + "'!");
						}
						
						break;
					case 4: 
						System.out.println("Enter the title of the Media to play: ");
						keyboard.nextLine();
						String ChosenTitle2 = keyboard.nextLine();
						Media resultItem = cart.searchByTitle(ChosenTitle2);
						
						if(resultItem instanceof DigitalVideoDisc) {
							DigitalVideoDisc playableItem = (DigitalVideoDisc) resultItem;
							playableItem.play();
						}
						else if(resultItem instanceof CompactDisc) {
							CompactDisc playableItem = (CompactDisc) resultItem;
							playableItem.play();
						}
						else if(resultItem != null){
							System.out.println("\n" + resultItem.getTitle() + " is not a DVD or a CD, cannot play");
						}
						else {
							System.out.println("\n" + ChosenTitle2 + " cannot be found in the Cart");
						}
						
						break;
					case 5: 
						System.out.println("Your order has been placed");
						cart.printCart();
						cart.clearCart();
						
						break;
					default:
						System.out.println("Invalid userChoice, please choose again");
						break;
				}
			}
		} while(userChoice != 0 || !page.equals("start"));
		
		System.out.println("\nApp exitted");
		keyboard.close();
		System.exit(0);;
		
	}
	
}