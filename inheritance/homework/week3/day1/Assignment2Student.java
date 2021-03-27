package inheritance.homework.week3.day1;

public class Assignment2Student extends Assignment2Department {

	public String studentName(String studentName){
		System.out.println("student name: Manjula Thangavel");
		return studentName;

	}
	public String studentDept(String dept) {
		System.out.println("student dept: Computer Science");
		return dept;

	}
	public int studentId(int id) {
		System.out.println("student id: 275808");
		return id;

	}
	
	public static void main(String[] args) {
		
		Assignment2Student as2 = new Assignment2Student();
		as2.collegeName();
		as2.deptName();
		as2.studentName("MAnjula");
	}

}
