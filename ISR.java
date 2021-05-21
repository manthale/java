import java.io.*;
class Biodata {
	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("biodata");
	String name=br.readLine();
	int age=Integer.parseInt(br.readLine());
	float height=Float.parseFloat(br.readLine());
	String address=br.readLine();
	double income= Double.parseDouble(br.readLine());
	System.out.println("name :"+ name);
	System.out.println("age :" + age);
//	System.out.println("height :" + height);
	System.out.println("address :" + address);
	System.out.println("income :" + income);
	}
}

	
