package hust.soict.cybersec.test.disc.TestPassingParameter;
import hust.soict.cybersec.aims.disc.DigitalVideoDisc.*;




public class TestPassingParameter {

	public static void main(String[] args) {
		
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle", null, null);
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cindrella", null, null);
		
		swap(jungleDVD,cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cindrella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD,cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		
	}
	public static void swap(Object obj1, Object obj2) {
		Object temp = obj1;
		obj1 = obj2;
		obj2 = temp;
	}
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle, oldTitle, oldTitle);
	}
}