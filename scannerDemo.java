import java.util.*;
class ScannerDemo {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the age");
		int age=sc.nextInt();
		System.out.println("enter the salary");
		Double sal=sc.nextDouble();
		System.out.println("the name is :"+ name);
		System.out.println("the age is :"+ age);
		System.out.println("the sal is :"+ sal);
	}
}


