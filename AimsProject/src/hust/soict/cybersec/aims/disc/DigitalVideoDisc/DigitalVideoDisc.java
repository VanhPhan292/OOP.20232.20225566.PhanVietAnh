package hust.soict.cybersec.aims.disc.DigitalVideoDisc;

import hust.soict.cybersec.aims.media.Disc;
import hust.soict.cybersec.aims.media.Playable;

public class DigitalVideoDisc extends Disc implements Playable  {
	
	public DigitalVideoDisc(int id, String title, String category, String director, int length, float cost) {
		super(id, title, category, cost, length, director);
		this.setId(id);
		this.setTitle(title);
		this.setCategory(category);
		this.setDirector(director);
		this.setLength(length);
		this.setCost(cost);
	}

	public String toString() {
		return "DVD - " + getId() + " - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + " $";
	}
	
	@Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }



	
	
	
}
