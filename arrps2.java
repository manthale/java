//rotate array to the left by 1
class arrps2 {
	public static void main(String[] args) {
	int arr[]=new int[] {3,5,6,8};
	 int first;
	for(int j=0;j<2;j++) {
		first=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
	
		arr[arr.length-1]=first;
	}
	for(int k=0;k<arr.length;k++)
		System.out.println(arr[k]);
	}
	
}
