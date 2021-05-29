import java.util.Arrays;
class Demo8 {
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4,4,6,7,7};
		int jrr[]=new int[arr.length];
		int j=0;
		int cnt=1;
		int i;
			for( i=0;i<arr.length-1;i++) {
				if(arr[i]!=arr[i+1]) {
					jrr[j]=arr[i];	
					j=j+1;
					cnt++;
				}
				
			}
			jrr[j]=arr[i];
			for( i=0;i<cnt;i++) {
				System.out.println(jrr[i]);
		}
	}

}	
			
		

