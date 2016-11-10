import java.io.*;
public class Round04_Ex09 {
public static void main(String[] ar) throws IOException{
	//변수선언부
	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	String name="";
	String age="";
	
	//입력부
	System.out.print("이름은?" );
	name =in.readLine();
	System.out.print("나이는?");
			age= in.readLine();
			
	
	
	//출력부
	
	
			System.out.printf("이름은: %s \n", name);
			System.out.printf("나이는: %s \n", age);
			
}

}
