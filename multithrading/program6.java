//creating thread by using Runnable interface 

class Mythread implements Runnable {
	public void run() {
		System.out.println("ur inside the run method ");
		for(int i=0;i<5;i++) {
			System.out.println("abhi");
		}
		System.out.println("the current thread is "+ Thread.currentThread().getName());
		System.out.println("the current thread is "+ Thread.currentThread().getPriority());
	
	}
	
}
class Test {
	public static void main(String [] args) {
		Mythread mt=new Mythread();
		Thread t=new Thread(mt);
		t.start();
		try {
			t.setPriority(-88);
		}catch(IllegalArgumentException e) {
		}
	
		for(int i=0;i<5;i++) {
			System.out.println("manthale");
		}
		System.out.println("the current thread is "+ Thread.currentThread().getName());
		System.out.println("the current thread is "+ Thread.currentThread().getPriority());
	
	}
}

