package inheritance.homework.week3.day1;

public class Assignment3AxisBank extends Assignment3BankInfo {
	//over ride
	public void deposit()
	{
		System.out.println("overriding deposit method from Bank info class");
	}

	public static void main(String[] args) {

		Assignment3AxisBank ab = new Assignment3AxisBank();
		ab.deposit();
	}

}
