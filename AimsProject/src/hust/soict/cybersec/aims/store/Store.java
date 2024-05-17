package hust.soict.cybersec.aims.store;

import hust.soict.cybersec.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
		if(itemsInStore.contains(media)) {
			System.out.println("\n" + media.getTitle() + " already exists in the store!");
			return;
		}
		itemsInStore.add(media);
		System.out.println("\nSuccessfully added " + media.getTitle() + " to the store!");
	}

    public void removeMedia(Media media) {
		if(!itemsInStore.contains(media)) {
			System.out.println("\n" + media.getTitle() + " does not exist in the store, cannot remove!");
			return;
		}
		itemsInStore.remove(media);
		System.out.println("\n" + media.getTitle() + " successfully removed from the store!");
	}	
    public void displayStore() {
        if (itemsInStore.isEmpty()) {
            System.out.println("The store is currently empty.");
        } else {
            System.out.println("Here are the items in the store:");
            for (Media media : itemsInStore ) {
                System.out.println(media);
            }
        }
    }
    public void displayMediaDetails(String title) {
      
        for (Media media : itemsInStore) {
            if (media.getTitle().equals(title)) {
           
                System.out.println(media);
                return;
            }
        }

        
        System.out.println("Media with title '" + title + "' not found in the store.");}
        
    	
    	
    	public void print() {
    		System.out.println("\n***********************Store***********************");
    		System.out.print("Available Medias in Store:");
    		for(Media itemInStore : itemsInStore) {
    			System.out.print("\n" + itemInStore.toString());
    		}
    		System.out.println("\n***************************************************");
    	}
    	
    	public ArrayList<Media> getItemsInStore(){
    		return (ArrayList) itemsInStore;
    	}
    	
    	
    	public Media search(String title) {
    		for(Media item : itemsInStore) {
    			if(item.isMatch(title)) {
    				return item;
    			}
    		}
    		return null;
    		}
    	
    	
    	public Media search(int id) {
    		for(Media item: itemsInStore) {
    			if(item.getId() == id) {
    				return item;
    			}
    		}
    		return null;
    	}
    	{
    }
}

    