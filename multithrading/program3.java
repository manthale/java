//we can change the name of the thread by  obj.setName()
//we can also set priority of thread by obj.setPriority()


class Demo3 extends Thread{
	public void run() {
		System.out.println("in run");
		System.out.println("thread name is :"+ currentThread().getName());
		System.out.println("the priority is :" + currentThread().getPriority());
	}
	
	public static void main(String [] args) {
		Demo3 d=new Demo3();
		d.start();
		d.setName("abhi");
		d.setPriority(7);
		System.out.println("thread name is :"+ currentThread().getName());
		System.out.println("the priority is "+ currentThread().getPriority());
	}
}
		
	
