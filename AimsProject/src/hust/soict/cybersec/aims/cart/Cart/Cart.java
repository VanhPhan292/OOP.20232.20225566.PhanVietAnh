package hust.soict.cybersec.aims.cart.Cart;
import hust.soict.cybersec.aims.media.Media;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    public void addMedia(Media media) {
        itemsOrdered.add(media);
    }

    public void removeMedia(Media media) {
        itemsOrdered.remove(media);
    }

    public float totalCost() {
        float total = 0.0f;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

    public void printCart() {
        System.out.println("Cart:");
        for (Media media : itemsOrdered) {
            System.out.println(media);
        }
        System.out.println("Total cost: " + totalCost());
    }
}
