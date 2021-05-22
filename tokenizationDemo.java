import java.io.*;
import java.util.*;
	
class PlayerInfo {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s," ");
	
		String st1=st.nextToken();
		String st2=st.nextToken();
		String st3=st.nextToken();
		String st4=st.nextToken();
		
		String name=st1;
		char grade=(char)st.read(st2);
		int jer_no=Integer.parseInt(st3);
		double income=Double.parseDouble(st4);
		
		System.out.println("the name of the player is:"+name);
		System.out.println("the grade of the player is " + grade);
		System.out.println("the jer_no of the player is +" + jer_no);
		System.out.println("the income of the player is" + income);
	}
}

		
