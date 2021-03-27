package polymorphism.week3.day1homework;

public class Calculator {

	//- 2 methods for add, 1 method with 2 int args , 1 method with 3 int args	
	int add (int a , int b) {

		System.out.println("Sum is :" +a  +b);
		return a+b;
	}

	int add (int a , int b,int c) {

		System.out.println("sum is :" +a  +b +c);
		return a+b+c;
	}

	// 2 methods for multiply, 1 method with 2 int args, 1method with 1 int and 1 double args

	int multiply (int a , int b) {

		System.out.println("product is :" +a  +b);
		return a*b;
	}
	

	double multiply (int a , double b) {

		System.out.println("product is :" +a  +b );
		return a*b;
	}

	// 2 methods for subtract, 1 method with 2 int args , 1 method with 2 double args
	int subtract (int a , int b) {

		System.out.println("The result of subtraction is :" +a  +b);
		return a-b;
	}

	double subtract (double a , double b) {

		System.out.println("The result of subtraction is  :" +a  +b );
		return a-b;
	}
	
	// 2 methods to divide , 1 method with 2 int args, one to divide one double number with one int
	int divide (int a , int b) {

		System.out.println("The division of a and b are :" +a  +b);
		return a/b;
	}

	double divide (double a , int b) {

		System.out.println("The division of a and b are :" +a  +b );
		return a/b;
	}

	public static void main(String[] args) {
		
		//create object for the Calculator class and execute all the methods*/
		
		Calculator math = new Calculator();
		math.add(2, 3);
		math.add(2, 3, 4);
		math.subtract(12.5, 8.9);
		math.subtract(2, 3);
		math.multiply(2,3);
		math.multiply(2, 56.6);
		math.divide(12.3,3);
		math.divide(2, 3);

	}

	

}


