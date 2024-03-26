
public class DigitalVideoDisc {

	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.nbDigitalVideoDiscs ++;
		this.id = this.nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.nbDigitalVideoDiscs ++;
		this.id = this.nbDigitalVideoDiscs;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
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
<<<<<<< HEAD
	public int getLength() {
=======
	public int getLenght() {
>>>>>>> 8251edf890060fd090f9ede8a9e1da4ace371463
		return length;
	}
	public float getCost() {
		return cost;
	}
	private String title;
	private String category;
<<<<<<< HEAD
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
=======
	private String directory;
	private int length;
	private float cost;
>>>>>>> 8251edf890060fd090f9ede8a9e1da4ace371463
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
<<<<<<< HEAD

	
	
	
}
=======
	

}
	
>>>>>>> 8251edf890060fd090f9ede8a9e1da4ace371463
