package hust.soict.cybersec.test.disc.TestPassingParameter;
import hust.soict.cybersec.aims.disc.DigitalVideoDisc.*;




public class TestPassingParameter {

	public static void main(String[] args) {
		
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc(0, "Jungle", null, null, 0, 0);
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc(0, "Cindrella", null, null, 0, 0);
		
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
		dvd = new DigitalVideoDisc(0, oldTitle, oldTitle, oldTitle, 0, 0);
	}
}