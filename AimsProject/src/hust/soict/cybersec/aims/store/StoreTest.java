package hust.soict.cybersec.aims.store;
import hust.soict.cybersec.aims.disc.DigitalVideoDisc.*;
public class StoreTest {
	public static void  main(String[]args) {
		Store store = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd1);
        
	}

}
