package hust.soict.cybersec.aims.disc.DigitalVideoDisc;

import hust.soict.cybersec.aims.media.Disc;
import hust.soict.cybersec.aims.media.Playable;

public class DigitalVideoDisc extends Disc implements Playable  {
	public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost, length, director);
    }

	
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	
	
	public int getId() {
		return this.id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return "DVD - " + title+ " - " + category+ " - "+ director+" - " + length+ " : "+ cost+"$";
	}
	public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
	@Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

	
	
}
