package abstrac.homework.week3.day1;

public class DesktopAssignment1 implements SoftwareAssignment1 {

	public void desktopModel()
	{
		System.out.println("desktopModel is DEll");
	}


	public void hardwareResources() {

		System.out.println("Hardware");
	}

	public void softwareResources() {

		System.out.println("software");
	}
	public static void main(String[] args) {

		DesktopAssignment1 ds = new DesktopAssignment1();
		ds.hardwareResources();
		ds.softwareResources();
	}

}
