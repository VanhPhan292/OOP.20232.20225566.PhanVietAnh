package hust.soict.cybersec.aims.screen.manager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import hust.soict.cybersec.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.cybersec.aims.media.Book;
import hust.soict.cybersec.aims.media.CompactDisc;
import hust.soict.cybersec.aims.media.Media;
import hust.soict.cybersec.aims.media.Track;
import hust.soict.cybersec.aims.store.Store;

public class StoreManagerScreen extends JFrame{
	private Store store;
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		
		return north;
	}

	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");
		JMenuItem viewStoreItem = new JMenuItem("View store");
	    viewStoreItem.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            new StoreManagerScreen(store);
	        }
	    });
	    menu.add(viewStoreItem);
 JMenu smUpdateStore = new JMenu("Update Store");
	    
	    JMenuItem addBookItem = new JMenuItem("Add Book");
	    addBookItem.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	           new AddBookToStoreScreen(store);
	        }
	    });
	    smUpdateStore.add(addBookItem);
	    
	    JMenuItem addCDItem = new JMenuItem("Add CD");
	    addCDItem.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	          new AddCompactDiscToStoreScreen(store);
	        }
	    });
	    smUpdateStore.add(addCDItem);
	    
	    JMenuItem addDVDItem = new JMenuItem("Add DVD");
	    addDVDItem.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            new AddDigitalVideoDiscToStoreScreen(store);
	        }
	    });
	    smUpdateStore.add(addDVDItem);
	    
	    menu.add(smUpdateStore);
	    
	    JMenuBar menuBar = new JMenuBar();
	    menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
	    menuBar.add(menu);
		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
		
		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN,50));
		title.setForeground(Color.CYAN);
		
		header.add(Box.createRigidArea(new Dimension(10,10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(Box.createRigidArea(new Dimension(10,10)));
		
		return header;
	}
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3,3,2,2));
		
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		for (int i = 0; i < 9; i++) {
			if (i < mediaInStore.size()) {
		        MediaStore cell = new MediaStore(mediaInStore.get(i));
		        center.add(cell);
		    }
		}
		
		return center;
	}
	public StoreManagerScreen(Store store) {
		this.store = store;
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setTitle("Store");
		setSize(1024, 768);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		Store store = new Store();
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
		
		store.addMedia(book1);
		
		CompactDisc cd1 = new CompactDisc(
				6,
				"CD",
				"Hieu",
				"Vanh",
				50,
				99.9f,
				"Vanh2"
			);
		cd1.addTrack(new Track("track 1", 5));
		cd1.addTrack(new Track("track 2", 6));
		store.addMedia(cd1);
		new StoreManagerScreen(store);
	}
	
	

	

}
