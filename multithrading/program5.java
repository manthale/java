class Newthread extends Thread {
	public void run() {
		System.out.println("in run method " + currentThread().getName());
	}
}
class Mythread extends Thread {
	public void run() {
		System.out.println("in run method " + currentThread().getName());
		Newthread nt =new Newthread();
		nt.start();
	}
}
class multithread extends Thread {
	public static void main(String[] args) {
		Mythread mt=new Mythread();
		mt.start();
		System.out.println("in run method " + Thread.currentThread().getName());
	}
}

	
