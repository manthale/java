import java.io.*;
class PlayerInfo {
	public static void main(String[] args)throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int jerNo=Integer.parseInt(br.readLine());
		String name=br.readLine();
		char grade=(char)br.read();
		br.skip(1);
		float income=Float.parseFloat(br.readLine());
		System.out.println("the jer no is:"+jerNo);
		System.out.println("the name is :"+ name);
		System.out.println("the grade is :"+ grade);
		System.out.println("the income is +" + income);

	}
}

