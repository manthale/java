//sleep 
class Demo7 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("abhi");
			try {
				sleep(2000);
			} catch(Exception ae){}
		}
		System.out.println(currentThread().getName());
	}
}
class SleepDemo {
	public static void main(String[] args) throws Exception {
		Demo7 d=new Demo7();
		d.start();
		System.out.println(Thread.currentThread().getName());
			for(int i=0;i<6;i++) {
				Thread.sleep(1000);
				System.out.println("manthale");
			}
	}
}

