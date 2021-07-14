//we cannot overload the run method and cannot override start method


class Demo2 extends Thread {
	public void run() {
		System.out.println("in run");
		System.out.println("thread is :"+ currentThread().getName());
	}
	public void run(int a) {
		System.out.println("hii");
	}
	public void start() {
			System.out.println("u r inside the start method");
	}
	public static void main(String [] args) {
		Demo2 d=new Demo2();
		d.start();
		System.out.println("Thraed name is :"+currentThread().getName());
	}
}

	
