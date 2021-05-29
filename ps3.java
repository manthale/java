//printing duplicate element of array 
class ps3 {
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,4,2,1,2};
		int jrr[]=new int[arr.length];
		
		int k=0;
		for(int i=0;i<arr.length;i++) {
			int dup=00;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]) {
			
					jrr[j]=00;
				} 
				else {
				jrr[i]=00;
				}

			}
			if(jrr[i]!=00) {
		
				jrr[i]=arr[i];
			}
			
		}
		
		for(int j=0;j<jrr.length;j++) {
				
				if(jrr[j]!=00) {
					System.out.println("the array :" + jrr[j]);
					System.out.println("hii");
				}
		}
		
	}
}

	
