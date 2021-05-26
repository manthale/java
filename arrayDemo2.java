import java.io.*;
class ArrayDemo1 {
	public static void main(String[] args) throws IOException {
		int arr[]=new int[5];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<arr.length;i++) {
			int s=Integer.parseInt(br.readLine());
			arr[i]=s;
		}
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}
}

