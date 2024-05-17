package hust.soict.cybersec.aims.media;

public class Track implements Playable{
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    
    @Override
    public void play() {
        System.out.println("Playing track: " + this.title);
        System.out.println("Track length: " + this.length);
    }
    
    public boolean equals(Track track) {
        if (this.getTitle().equals(track.getTitle())&& this.getLength()== track.getLength()){
        	return true;
        }
        return false;
    }
}
