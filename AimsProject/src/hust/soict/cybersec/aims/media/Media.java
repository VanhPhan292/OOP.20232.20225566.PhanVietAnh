package hust.soict.cybersec.aims.media;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public abstract class Media {
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	private int id;
    private String title;
    private String category;
    private float cost;
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    ArrayList<Media> mediaList = new ArrayList<>();



    public boolean isMatch(String title) {
		return this.getTitle().equalsIgnoreCase(title);
	}
	
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Checks if both references point to the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Checks for null and class type

        Media media = (Media) obj;

        return Double.compare(media.cost, cost) == 0 && title.equalsIgnoreCase(media.title);
    }

@Override
public String toString() {
    return "Media - " + id + " - " + title + " - " + category + " - " + cost +"$";
}

public static Comparator<Media> MediaTitleComparator = new Comparator<Media>() {
    public int compare(Media m1, Media m2) {
       String mediaTitle1 = m1.getTitle().toUpperCase();
       String mediaTitle2 = m2.getTitle().toUpperCase();

     
       return mediaTitle1.compareTo(mediaTitle2);
    }
};

public int compareTo(Media other) {
    if (other == null) throw new NullPointerException("Comparing media with null");

    
    int titleComparison = this.title.compareToIgnoreCase(other.title);
    if (titleComparison != 0) {
        return titleComparison;
    }

    
    return Double.compare(this.cost, other.cost);
}

public static Comparator<Media> MediaCostComparator = new Comparator<Media>() {
    public int compare(Media m1, Media m2) {
       float mediaCost1 = m1.getCost();
       float mediaCost2 = m2.getCost();

       
       return Float.compare(mediaCost2, mediaCost1);
    }
};
}




    

    

