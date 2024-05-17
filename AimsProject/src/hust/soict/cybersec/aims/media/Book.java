package hust.soict.cybersec.aims.media;
import java.util.ArrayList;

public class Book extends Media{
	private ArrayList<String> authors = new ArrayList<>();

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        authors.remove(authorName);
    }
    

	public Book(int id, String title, String category, float cost) {
		super(id,title,category,cost);
	}


}
