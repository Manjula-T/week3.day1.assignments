package inheritance.homework.week3.day1;

public class Assignment4Students {
	
	public static void getStudentInfo(int id)
	{
	System.out.println("Student id is : " + id);
	}
	public static void getStudentInfo(int id,String name)
	{
		System.out.println("Student id is : " + id);
		System.out.println("Student name is : " + name);
	}
	public static void getStudentInfo(String email, String phoneNumber)
	{
		System.out.println("Student email is : " + email);
		System.out.println("Student phoneNumber is : " + phoneNumber);
	}
	public static void main(String[] args) {
		getStudentInfo (1);
		getStudentInfo (1,"Manjula");
		getStudentInfo ("1manju.t44@gmail.com","159737722");
		

	}

}
