import java.io.*;
class Home {
	static String tv;
	String phone;
	static String freezer;
	String bike;
	void stuff() {
		System.out.println("tv is :"+ tv);
		System.out.println("phone is of company :"+ phone);
		System.out.println("the freezer is of company :"+ freezer);
		System.out.println("the bike is :" + bike);
	}
}
class Test {
	public static void main(String[] args) {
	Home father=new Home();
	father.tv="samsung";
	father.phone="mi";
	father.freezer="LG";
	father.bike="bullet";
	Home son =new Home();
	son.tv="LG";
	son.phone="apple";
	son.freezer="LG";
	son.bike="r15";
	father.stuff();
	son.stuff();
		
	}
}
