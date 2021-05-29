//printing frtequency of each element
import java.io.*;
class Demo1 {
	public static void main(String[] args) throws IOException{
		int arr[]=new int[5];
		
		int visited=0;
		int fr[]=new int[arr.length];
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		for (int i=0;i<arr.length;i++) {
			int s=Integer.parseInt(br.readLine());
			arr[i]=s;
		}
		for(int i=0;i<arr.length;i++) {
			int cnt=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					cnt++;
					fr[j]=-1;			
				}

			}
			if(fr[i]!=-1) {
				fr[i]=cnt;
			}
				
		}
		System.out.println("the frequency of the element are :");
		for(int i=0;i<arr.length;i++) {
			if(fr[i]!=-1) {
				System.out.println("the frequency of :" + arr[i] +"is"+ fr[i] );
			}
		}
	}
}

	
