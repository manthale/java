import java.io.*;
class Demo9 {
	public static void main(String[] args) throws IOException {
		int arr[][]=new int[3][];
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[2]=new int[1];
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				int a=Integer.parseInt(br.readLine());
				arr[i][j]=a;
			}
			System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}

