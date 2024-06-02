package hust.soict.cybersec.test.screen.customer.store;

import hust.soict.cybersec.aims.cart.Cart.*;
import hust.soict.cybersec.aims.media.CompactDisc;
import hust.soict.cybersec.aims.disc.DigitalVideoDisc.*;
import hust.soict.cybersec.aims.screen.customer.controller.ViewStoreController;
import hust.soict.cybersec.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewStoreScreen extends Application {
	private static Store store;
	private static Cart cart;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		final String STORE_FXML_FILE_PATH = "/hust/soict/cybersec/aims/screen/customer/view/Store.fxml";
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
		ViewStoreController viewStoreController = new ViewStoreController(store, cart);
		fxmlLoader.setController(viewStoreController);
		Parent root = fxmlLoader.load();
		
		primaryStage.setTitle("Store");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		store = new Store();
		cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc(1, "Gumball", "Animation", "Director", 320, 25.85f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(2, "JJK", "Anime", "Director2", 100, 10.15f);
        CompactDisc cd1 = new CompactDisc(3, "Kingsman", "Action", "Director3", 190, 20.25f, "Vanh");

        // Test addMedia
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(cd1);

		launch(args);
	}

	public TestViewStoreScreen() {
		// TODO Auto-generated constructor stub
	}

}
