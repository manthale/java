//passing [] to the to method
import java.io.*;
class ArrayDemo3 {
	static void m1(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,8,};
		m1(arr);
	}
}

