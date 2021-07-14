class SleepDemo2 extends Thread {
	public void run() {
		for(int i=20;i<30;i++) {
			System.out.println("the roll no from DIV A :"+ i);
		}
	}
}

class Test {
	public static void main(String[] args ) throws Exception{
		SleepDemo2 d1=new SleepDemo2();
		SleepDemo2 d2=new SleepDemo2();
		d1.start();
		d1.sleep(6000);
		for(int i=20;i<30;i++) {
			System.out.println("the roll no from DIV  B:"+ i);
			//d2.sleep(2000);
		}
	}
}

