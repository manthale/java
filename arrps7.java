//finding smallest element in array 
class Demo7 {
	public static void main(String[] args) {
		int arr[] =new int[] {2,34,3,5,1,34,5,0,7,8};
		int s=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(s>arr[i]) {
				s=arr[i];
			}
			
		}
		System.out.println(s);
	}
}

