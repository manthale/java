//returning  array
class Demo5 {
	static int[] get() {
		int arr[]={1,2,3,4,5};
		return(arr);
	}
	public static void main(String[] args) {
	int a[]=get();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}

