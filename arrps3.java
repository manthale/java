//printing duplicate element of array 
class Demo3 {
	public static void main(String[] args) {
		int arr[]=new int[]{1,2,5,12,3,2,4,5};
		int jrr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int cnt =1;
			for(int j=i+1;j<arr.length;j++) {	
				if(arr[i]==arr[j]) {
					jrr[j]=-1;
					cnt++;
				}
			}
			if(jrr[i]!=-1) {
				jrr[i]=cnt;
			}
		}
		for(int i=0;i<jrr.length;i++) {
			if(jrr[i]>1)	{
				System.out.println(arr[i]);
			}		
		}
	}
}

