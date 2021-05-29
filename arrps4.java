//arrenging in assending order
class Demo4 {
	public static void main(String[] args) {	
		int temp;
		int arr[]=new int[] {5,3,4,6,7,8,5,9,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j] && arr[i]!=arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
	
