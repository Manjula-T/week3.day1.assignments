package abstrac.homework.week3.day1;

public class CollegeAssignment2 extends UniversityAssignment2 {

	@Override
	public void ug() {
		System.out.println("implementing UG method from abstract class");

	}

	public static void main(String[] args) {
		CollegeAssignment2 ca = new CollegeAssignment2();
		ca.pg();
		ca.ug();
	}

}
