import java.io.*;
import java.util.*;
class TokeniztionDemo {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		StringTokenizer st=new StringTokenizer(s1, "  ");

		String st1=st.nextToken();
		String st2=st.nextToken();
		String st3=st.nextToken();
		String st4=st.nextToken();
		
		String name=st1;
		int exam_no=Integer.parseInt(st2);
		int year = Integer.parseInt(st3);
		String std =st4;
	
		System.out.println("the name of the student is: "+name);
		System.out.println("the exam no is :"+ exam_no);
		System.out.println("the year is :"+ year);
		System.out.println("the class is :"+std);
		
		
	}
}

	
	
