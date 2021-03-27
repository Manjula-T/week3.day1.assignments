package inheritance.homework.week3.day1;

public class Assignment1Desktop extends Assignment1Computer{

	public static void desktopsize()
	{
		System.out.println("Desktop size: 14 inch");
	}
	//create above 2 class and call all your class methods into the Desktop using single inheritance.
	
	public static void main(String[] args) {

		Assignment1Computer ac = new Assignment1Computer();
		ac.computerModel();
		desktopsize();

	}

}
