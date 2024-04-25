package hust.soict.cybersec.aims.media;
import java.util.ArrayList;
import java.util.Comparator;


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



@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Media media = (Media) obj;
    return title.equals(media.title);
}
@Override
public String toString() {
    return "Media [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
}

public static Comparator<Media> MediaTitleComparator = new Comparator<Media>() {
    public int compare(Media m1, Media m2) {
       String mediaTitle1 = m1.getTitle().toUpperCase();
       String mediaTitle2 = m2.getTitle().toUpperCase();

     
       return mediaTitle1.compareTo(mediaTitle2);
    }
};

public static Comparator<Media> MediaCostComparator = new Comparator<Media>() {
    public int compare(Media m1, Media m2) {
       float mediaCost1 = m1.getCost();
       float mediaCost2 = m2.getCost();

       
       return Float.compare(mediaCost2, mediaCost1);
    }
};


}




    

    

