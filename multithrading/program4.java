//creating the multiple threads 

class Demo4 extends Thread {
	public void run() {
		System.out.println("in run method ");
		for (int i=0;i<5;i++) {
			System.out.println("abhi");
		}
		System.out.println("thread is +"+ currentThread().getName());
	}
}
class multiThread {
	public static void main(String[] args ) {
		Demo4 mt =new Demo4();
		mt.start();
		for (int i=0;i<5;i++) {
			System.out.println("manthale");
		}
		System.out.println("thread is +"+ Thread.currentThread().getName());
		Demo4 d=new Demo4();
		d.start();
		
	}
}
	
