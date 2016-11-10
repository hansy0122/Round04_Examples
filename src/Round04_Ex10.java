import java.io.*;
public class Round04_Ex10 {
        public static void main(String[] ar) throws IOException {
        	BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        	String age="";
        	
        	byte a=0;
        	int b=0;
        	float c=0;
        	double d=0;
        	
        	
        	//char으로는 변화불가능
        	
        	
        	
        	System.out.print("나이?");
        	age= in.readLine();
        	a= Byte.parseByte(age);
        	b= Integer.parseInt(age);
        	c= Float.parseFloat(age);
        	d= Double.parseDouble(age);
        	
        	
        	System.out.println(a);
        	System.out.println(b);
        	System.out.println(c);
        	System.out.println(d);
        	System.out.println(age);
        	
        	
        }
}
