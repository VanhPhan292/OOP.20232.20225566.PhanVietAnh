package hust.soict.cybersec.test.cart.CartTest;
import hust.soict.cybersec.aims.cart.Cart.*;
import hust.soict.cybersec.aims.disc.DigitalVideoDisc.*;
public class CartTest {
    public static void main(String[] args) {
        
        Cart cart = new Cart();
        
      
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        
       
        cart.addMedia(dvd1);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        
        
        cart.addMedia(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(3, "Aladin", "Animation", null, 0, 18.99f);
        
        
        cart.addMedia(dvd3);
        cart.printCart();
    }
    
   
}

