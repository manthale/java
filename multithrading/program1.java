class ThreadDemo extends Thread {
		public void run() {
			System.out.println(Thread.currentThread().getName());
			for(int i=0;i<3;i++) {
				System.out.println("hii");
				}
			}	
		
	public static void main(String[] args) {
		ThreadDemo d=new ThreadDemo();
		d.start();
		for(int i=0;i<2;i++) {
			System.out.println("abhi");
			
		}
	}
	}


