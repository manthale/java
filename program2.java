class College {
	double sal=8000;
	static String degree;
	String gf;
	double workingHour=20;
	int age;
	static  String TPO;
	double saving;
	static  void educationalInfo() {
		College obj=new College();
		System.out.println("the degree is:"+ degree );
		System.out.println("TPO is "+ TPO);
		System.out.println("the sal is" + obj.sal);
		System.out.println("the working hours are:"+ obj.workingHour);
		System.out.println();
	
	}
	void personalInfo() {
		System.out.println("the gf is:" + gf);
		System.out.println("the age is" + age);
		System.out.println("the saving is" + saving);
	}
}
class Test {
	public static void main(String[] args) {
		College bussinessman = new College();
		bussinessman.degree="BE";
		bussinessman.TPO="pitambare sir";
		bussinessman.workingHour=11;
		bussinessman.age=21;
		bussinessman.gf="ABC";
		bussinessman.saving=500000;
		bussinessman.educationalInfo();
		bussinessman.personalInfo();
		College emp =new College();
		emp.sal=80000;
		emp.gf="xyz";
		emp.workingHour=8;
		emp.age=21;
		emp.TPO="pitambare";
		emp.saving=40000;
		emp.educationalInfo();
		emp.personalInfo();


	}
}
	

