//join method 

class YieldDemo1 extends Thread {
	static Thread t1=null; 
	public void run() {
		//try {
		//	//t1.join();
		//}catch(InterruptedException ie) {
	//	}

		for(int i=0;i<8;i++) {
			System.out.println("hello");
		}	
	}
}
class Test2 {
	public static void main(String[] args)throws InterruptedException {
		YieldDemo1 d1=new YieldDemo1();
		d1.start();
		d1.join();
		for(int j=0;j<20;j++) {
			YieldDemo1.t1=Thread.currentThread();
			System.out.println("abhi");
		}
	}
}

			

